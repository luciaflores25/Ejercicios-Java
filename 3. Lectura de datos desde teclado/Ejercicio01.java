/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 1
 * 10 de octubre de 2017
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
   de su multiplicación
 * 
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número entero: ");
    int num1 = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce otro número entero: ");
    int num2 = Integer.parseInt(s.nextLine());
    
    int multiplicacion = num1 * num2;
    
    System.out.println("\n\nEl primer número es: " + num1);
    System.out.println("El segundo número es: " + num2);
    System.out.println("-------------------------------------------");
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
   
    
  }
}
