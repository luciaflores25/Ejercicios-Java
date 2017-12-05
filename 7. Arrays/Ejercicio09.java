/**
 * Programación
 * Tema 7 Arrays
 * 5 de diciembre de 2017
 * Ejercicio 9
 * 
 * 9  Realiza un programa que pida 8 números enteros y que luego muestre esos
      números junto con la palabra “par” o “impar” según proceda.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[8];
    System.out.println("Introduce 10 números (enteros) pulsando intro\n");
    
    for(int i = 0; i <= 7; i++){//lee por teclado los datos del array
      numero[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    for(int i = 0; i <= 7; i++){
      if(numero[i] % 2 == 0){
        System.out.print(numero[i] + " par");
      }else{
        System.out.print(numero[i] + " impar");
      }
      System.out.println();
    }
  }
}
