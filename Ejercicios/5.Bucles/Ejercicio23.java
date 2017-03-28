/* Nombre: Lucía Flores Padilla
 * Fecha: 25 de marzo de 2017
 * Ejercicio 23 bucles
 * Programación
 */
public class Ejercicio23 {
  public static void main (String[] args) {
  
    System.out.println("Estos son todos los primos entre 2 y 100");
    
    boolean primo;
    
    for (int numero = 2; numero <= 100; numero++) {
      primo = true;
      
      for (int i = (int)Math.sqrt(numero); i >= 2; i--) {
        
        if (numero % i == 0) {
        primo = false;
        }
      }
      
      if (primo) {
          System.out.print(numero + ", ");
      }
    }
          
  }//Cierra el public static
  
}//Cierra el public class
