/*@author Lucía Flores Padilla
 * Fecha: 10 de mayo de 2017
 * Ejercicio 22 Números Aleatorios
 * Programación
 */

import java.util.Scanner;
public class Ejercicio22 {

  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    int num;
    int altura;
    int espacios;
    espacios = 12;
    
    System.out.print("Introduzca la longitud de la serpiente: ");
    altura = s.nextInt();
    
    for (int i = 0; i < altura; i++) {
      
      num = (int)(Math.random()*3);
      
      for (int j = 0; espacios > j; j++) {
        System.out.print(" ");
      }
      if (i == 0) {
        System.out.println("@");
      } else {
        
        switch (num) {
          
          case 0:
            System.out.println("*");
            espacios--;
            break;
          case 1:
            System.out.println("*");
            espacios++;
            break;
          case 2:
            System.out.println("*");
            break;
        }
      }
    }
  }
}
