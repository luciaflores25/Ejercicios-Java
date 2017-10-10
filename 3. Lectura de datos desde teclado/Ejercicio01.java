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

public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int num1 = Integer.parseInt( System.console().readLine() );
    
    System.out.print("Introduce otro número entero: \n");
    int num2 = Integer.parseInt( System.console().readLine() );
    
    int multiplicacion = num1 * num2;
    
    System.out.println("\nEl primer número es: " + num1);
    System.out.println("El segundo número es: " + num2);
    System.out.println("-------------------------------------------");
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
   
    
  }
}
