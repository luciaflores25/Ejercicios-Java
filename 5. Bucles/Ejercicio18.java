/**
 * Programación
 * Tema 5 Bucles
 * 5 de noviembre de 2017
 * Ejercicio 18
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre
  dos números introducidos por teclado y validados como distintos, el programa
  debe empezar por el menor de los enteros introducidos e ir incrementando de
  7 en 7.

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Te diré los números de 7 en 7 que hay entre dos números.");
    System.out.print("Introduce un número(entero): ");
    int numero1 = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce otro número(entero): ");
    int numero2 = Integer.parseInt(s.nextLine());
    
    if(numero1 != numero2){
      if (numero1 < numero2){
        while (numero1 <= numero2){
          System.out.print(numero1 + " ");
          numero1 +=7;
        }
      }else {
        while (numero2 < numero1){
          System.out.print(numero2 + " ");
          numero2 +=7;
        }
      }
    }else{
      System.out.println("Los números son iguales, tienen que ser distintos.");
    }
  }
}
