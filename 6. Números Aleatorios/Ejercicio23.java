/**
 * Programación
 * Tema 6 Números Aleatorios
 * 1 de diciembre de 2017
 * Ejercicio 23
 * 
 * 23. Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
       Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
        Ejemplo 1:
         Q J 7 J As
        Ejemplo 2:
         K 8 J As 7
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int tirada;
    String figura = "";
    
    
    for(int i = 1; i <= 5; i++){
      tirada = (int)(Math.random()*6);
      
      switch(tirada){
        case 0:
          figura = "As";
          break;
        case 1:
          figura = ("K");
          break;
        case 2:
          figura = "Q";
          break;
        case 3:
          figura = ("J");
          break;
        case 4:
          figura = "7";
          break;
        case 5:
          figura = ("8");
          break;
          default:
      }
      System.out.print(figura + " ");
    }
  }
}
