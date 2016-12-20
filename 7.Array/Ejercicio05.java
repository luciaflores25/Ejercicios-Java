/**
 *
 * @author Lucía Flores Padilla
 *
 */

import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
  
    int [] x = new int [10];
    int max;
    int min;
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca 10 números de uno en uno: ");
    max = 0;
    min = Integer.MAX_VALUE;
    
    for (int i = 0; i <= 9; i++) {
      
      x[i] = s.nextInt();
      
      if (x[i] > max) {
        max = x[i];
      } else if (x[i] < min) {
        min = x[i];
      }
      
    }
    
    System.out.println("\nEstos son los números que ha introducido");
    
    for (int i = 0; i <= 9; i++) {
      
      if (x[i] == max) {
        System.out.println("Máximo: " + x[i]);
      } else if (x[i] == min) {
        System.out.println("Mínimo: " + x[i]);
      } else {
        System.out.println(x[i]);
      }
    }
  }
}
