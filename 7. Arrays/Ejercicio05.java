/**
 * Programación
 * Tema 7 Arrays
 * 4 de diciembre de 2017
 * Ejercicio 5
 * 
 * 5. Escribe un programa que pida 10 números por teclado y que luego muestre
      los números introducidos junto con las palabras “máximo” y “mínimo” al lado
      del máximo y del mínimo respectivamente.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num = 0;
    int[] array = new int[10];
    int maximo = 1;
    int minimo = 99999999;
    
    System.out.println("Introduce 10 números (enteros) pulsando intro\n");
    
    for(int i = 0; i <= 9; i++){//lee por teclado los datos del array
      num = Integer.parseInt(s.nextLine());
      array[i] = num;
      
      if (num > maximo){
        maximo = num;
      }
      if (num < minimo){
        minimo = num;
      }
    }
    
    System.out.println("\n");
    
    for(int i = 0; i <= 9; i++){
      System.out.print(array[i]);
      if (array[i] == maximo) {
        System.out.print(" máximo");
      }
      
      if (array[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}
