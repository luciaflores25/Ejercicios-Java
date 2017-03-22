/* Nombre: Lucía Flores Padilla
 * Fecha: 22 de marzo de 2017
 * Ejercicio 22 bucles
 * Programación
 */

public class Ejercicio22 {
  public static void main (String[] args) {
  
  System.out.println("Este programa va a mostrar los números primos que hay entre 2 y 100: \n");

  boolean esPrimo;

    for(int i = 2; i<=100; i++){
      esPrimo = true;

      for(int j=(int)Math.sqrt(i); j >= 2; j--) { 

        if(i % j == 0){
          esPrimo = false;
        }

      }
      if(esPrimo){
        System.out.print(i + ", ");
      }
  
    }

  }//Cierra el public static
  
}//Cierra el public class
