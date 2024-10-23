package co.edu.ufps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class PasswordConfig {
	@Bean
	  public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(4);
	    }

}
