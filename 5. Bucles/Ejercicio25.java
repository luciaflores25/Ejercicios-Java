/**
 * Programación
 * Tema 5 Bucles
 * 20 de noviembre de 2017
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
    int numero = Integer.parseInt(s.nextLine());
    
    int volteado = 0;
    int nuevoNum = numero;
    
    while (nuevoNum > 0) {
      volteado = (volteado * 10) + (nuevoNum % 10);
      nuevoNum /= 10;
    }

    System.out.println("El número " + numero + " al revés es " + volteado);
  }
}
