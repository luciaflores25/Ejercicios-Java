/* Nombre: Lucía Flores Padilla
 * Fecha: 16 de marzo de 2017
 * Ejercicio 22 bucles
 * Programación
 */
public class Ejercicio22 {
	public static void main (String[] args) {
	
	System.out.println("En este programa van a aparecer todos los primos entre 2 y 100");
    
    boolean primo;
    
    for (int numeroAComprobar = 2; numeroAComprobar <= 100; numeroAComprobar++) {
      primo = true;
      
      for (int i = (int)Math.sqrt(numeroAComprobar); i >= 2; i--) {
        
        if (numeroAComprobar % i == 0) {
        primo = false;
        }
      }
      
      if (primo) {
          System.out.print(numeroAComprobar + ", ");
			}
		}
		
	}//Cierra el public static
	
}//Cierra el public class
