/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 24
 * 
 * 24. Escribe un programa que lea un número n e imprima una pirámide de números
       con n filas como en la siguiente figura:
              1
             121
            12321
           1234321
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Vamos a pintar una piramide númerica\n");
    System.out.print("Introduce el número de filas: ");
    int nFilas = Integer.parseInt(s.nextLine());
    System.out.println();
    
    int altura = 1;
    int espacios = nFilas -1;
    int numeros = 1;
    
    while (altura <= nFilas) {
      //pinta los espacios de delante de la pirámide
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      //pinta la fila de números
      for (int i = 1; i < altura; i++) {
        System.out.print(i);
      }
      for (int i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      altura++;
      espacios--;
    }
  }
}
