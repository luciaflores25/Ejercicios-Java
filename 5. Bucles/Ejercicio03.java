/**
 * Programación
 * Tema 5 Bucles
 * 26 de octubre de 2017
 * Ejercicio 3
 * 
 *  Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *  
 * @author Lucía Flores Padilla
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    
    int i = 0;
    
    do {
      System.out.println(i);
      i+=5;
    } while(i <= 100);
  }
}
