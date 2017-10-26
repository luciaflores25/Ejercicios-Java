/**
 * Programación
 * Tema 5 Bucles
 * 26 de octubre de 2017
 * Ejercicio 5
 * 
 *  Muestra los números del 320 al 160, contando de 20 en 20 hacia
 *  atrás utilizando un bucle while.
 *  
 * @author Lucía Flores Padilla
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    
    int i = 320;
    
    while(i >= 160) {
        System.out.println(i);
        i-=20;
    }
  }
}
