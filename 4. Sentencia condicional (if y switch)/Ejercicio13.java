/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 13
 * 18 de octubre de 2017
 * 
 * Escribe un programa que ordene tres números enteros introducidos por
   teclado.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Este programa va a ordenar 3 números introducidos");
    System.out.print("Introduce un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce otro: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Y ahora otro: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if ((num1 < num2) && (num2 < num3)) {
      System.out.println(num1+" < "+num2+" < "+num3);
    }
    if ((num1 < num3) && (num3 < num2)) {
      System.out.println(num1+" < "+num3+" < "+num2);
    }
    if ((num2 < num1) && (num1 < num3)) {
      System.out.println(num2+" < "+num1+" < "+num3);
    }
    if ((num2 < num3) && (num3 < num1)) {
      System.out.println(num2+" < "+num3+" < "+num1);
    }
    if ((num3 < num2) && (num2 < num1)) {
      System.out.println(num3+" < "+num2+" < "+num1);
    }
    if ((num3 < num1) && (num1 < num2)) {
      System.out.println(num3+" < "+num1+" < "+num2);
    }
  }
}
