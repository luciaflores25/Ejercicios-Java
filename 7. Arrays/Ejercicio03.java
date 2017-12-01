/**
 * Programación
 * Tema 7 Arrays
 * 1 de diciembre de 2017
 * Ejercicio 3
 * 
 * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
      en orden inverso, es decir, el primero que se introduce es el último en
      mostrarse y viceversa.
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num = 0;
    int[] array = new int[10];
    
    System.out.println("Introduce 10 números pulsando intro\n");
    
    for(int i = 0; i <= 9; i++){//lee por teclado los datos del array
      num = Integer.parseInt(s.nextLine());
      
      array[i] = num;
    }
    System.out.println();
    System.out.println("Estos son los números que has introducido al revés\n");
    for(int i = 9; i >=0; i--){//muestra el array al revés desde la posición 9 hasta la 0
      System.out.println(array[i]);
    }
  }
}
