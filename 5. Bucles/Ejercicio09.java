/**
 * Programación
 * Tema 5 Bucles
 * 31 de octubre de 2017
 * Ejercicio 9
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número y te diré cuantos dígitos tiene: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int digitos = 1;
    int nuevoNum;
    
    nuevoNum=numeroIntroducido;
    
    do {
      nuevoNum /= 10;
      digitos++;
      System.out.println(nuevoNum);
    }while (nuevoNum > 10);
    
    System.out.println("El número " + numeroIntroducido + " tiene " + digitos + " digitos");
  }
}
