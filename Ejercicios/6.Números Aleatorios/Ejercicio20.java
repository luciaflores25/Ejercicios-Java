/*@author Lucía Flores Padilla
 * Fecha: 26 de abril de 2017
 * Ejercicio 20 Números Aleatorios
 * Programación
 */

import java.util.Scanner;  
public class Ejercicio20 {

  public static void main(String[] args){
    
      Scanner s = new Scanner(System.in);
    
    int capacidad;
    int llena;
    int capacidadInicial;
    
    System.out.println("Este programa pinta por pantalla un cubo lleno de agua aleatoriamente: \n");
    System.out.print("Introduce la capacidad maxima de la cubeta: ");
    capacidad = s.nextInt();
    
    llena = (int)(Math.random()*(capacidad+1));
    capacidadInicial = capacidad;
    
    while (capacidad > 0) {
      
      System.out.print("*");
      
      if (capacidad <= llena) {
        
        System.out.print("====");
      } else {
        
        System.out.print("    ");
      }
      
      System.out.println("*");
    
      capacidad--;
    }
    
    System.out.println("******");
    System.out.println("La cuba contiene " + llena + " litros y tiene una capacidad de " + capacidadInicial + " litros.");
    
  }
}
