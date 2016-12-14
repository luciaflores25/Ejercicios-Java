/**
 *
 * @author Lucía Flores Padilla
 *
 */

import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    double [] x = new double [10];
    
    System.out.print("Introduzca 10 números de uno en uno: ");
    
    for (int i = 9; i >= 0; i--) {
      x[i] = s.nextDouble();
    }
    for (int i = 0; i <= 9; i++) {
      System.out.print(x[i] + " ");
    }
  }
}
