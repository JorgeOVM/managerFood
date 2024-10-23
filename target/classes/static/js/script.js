document.addEventListener('DOMContentLoaded', () => {
    
    
    const cantidades = document.querySelectorAll('.cantidad');
    const valores = document.querySelectorAll('.valor');
   let total = document.querySelectorAll('.total');
   let pagar=document.getElementById("pagar");
  let suma=777;
	
    if (cantidades && valores) {
        	
        	try{
            cantidades.item(0).onchange = () => {
            console.log(valores.item(0).value * cantidades.item(0).value);
			total.item(0).innerHTML = valores.item(0).value * cantidades.item(0).value;   					
            }
            }
            catch(error){console.log(error)}
            try{
             cantidades.item(1).onchange = () => {
            console.log(valores.item(1).value * cantidades.item(1).value);
			total.item(1).innerHTML = valores.item(1).value * cantidades.item(1).value;   					
            }
           }
           catch(error){console.log(error)}
           
           try{
             cantidades.item(2).onchange = () => {
            console.log(valores.item(2).value * cantidades.item(2).value);
			total.item(2).innerHTML = valores.item(2).value * cantidades.item(2).value;   					
            }
            }
            catch(error){console.log(error)}
            
            try{
             cantidades.item(3).onchange = () => {
            console.log(valores.item(3).value * cantidades.item(3).value);
			total.item(3).innerHTML = valores.item(3).value * cantidades.item(3).value;   					
            }
            }
            catch(error){console.log(error)}
            
            try{
             cantidades.item(4).onchange = () => {
            console.log(valores.item(4).value * cantidades.item(4).value);
			total.item(4).innerHTML = valores.item(4).value * cantidades.item(4).value;   					
            }
          }
          catch(error){console.log(error)}
           
          try{
             cantidades.item(5).onchange = () => {
            console.log(valores.item(5).value * cantidades.item(5).value);
			total.item(5).innerHTML = valores.item(5).value * cantidades.item(5).value;   					
            }
            }catch(error){console.log(error)}
             
            try{
             cantidades.item(5).onchange = () => {
            console.log(valores.item(5).value * cantidades.item(5).value);
			total.item(5).innerHTML = valores.item(5).value * cantidades.item(5).value;   					
            }
            }
            catch(error){console.log(error)}
            
            
           	
    		total.forEach(t=>{suma=t.textContent+suma});
			pagar.innerHTML=suma;
    }
});