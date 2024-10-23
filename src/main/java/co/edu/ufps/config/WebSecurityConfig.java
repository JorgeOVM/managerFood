package co.edu.ufps.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import co.edu.ufps.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	private String [] rsc= new String[] {"/css/**","/img/**","/js/**"};
	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	  
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
		
	        http
	            .authorizeRequests()
		        .antMatchers(rsc).permitAll()  
		        .antMatchers("/","/home","/register/**").permitAll()
		        .antMatchers("/admin*").access("hasRole('ADMIN')")
		        .antMatchers("/user*").access("hasRole('USER')")
	                .anyRequest().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .defaultSuccessUrl("/loginPass")
	                .failureUrl("/login?error=true")
	                .usernameParameter("nombre")
	                .passwordParameter("password")
	                .and()
	            .logout()
	                .permitAll()
	                .logoutSuccessUrl("/home");
	       
	    }
	 
	 

	  public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(4);
	    }
		
	  
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
	        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()); 
	        
	    }

}
