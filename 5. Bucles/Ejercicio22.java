/**
 * Programación
 * Tema 5 Bucles
 * 9 de noviembre de 2017
 * Ejercicio 22
 * 
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    for(int numero = 2; numero < 100; numero++){
      boolean esPrimo = true;
      int comprobacion = 0;
      
      for(int j = 2; j < numero; j ++) {
        
        comprobacion = numero % j;
        if (comprobacion == 0){
          esPrimo = false;
        }
      }
      if (esPrimo){
        System.out.print(numero + " ");
      }else{
      }
    }
  }
}
