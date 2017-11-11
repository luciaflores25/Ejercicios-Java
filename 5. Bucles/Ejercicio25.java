/**
 * Programación
 * Tema 5 Bucles
 * 9 de noviembre de 2017
 * Ejercicio 25
 * 
 * 25. Realiza un programa que pida un número por teclado y que luego muestre ese
       número al revés.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número y te diré cuantos dígitos tiene: ");
    int n = Integer.parseInt(s.nextLine());
    
    int volteado;
    int nuevoNum = 0;
    
    while (n > 0){
      volteado = n % 10;
      volteado = n / 10;
      nuevoNum = n * 10;
    }
    System.out.println(nuevoNum);
  }
}
