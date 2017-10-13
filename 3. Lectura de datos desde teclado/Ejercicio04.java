/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 4
 * 10 de octubre de 2017
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
   introducidos por teclado.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero entero por teclado: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce un numero entero por teclado: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    double division = (double)num1 / (double)num2;
    
    System.out.println("\nEl resultado de la suma de "+ num1 +" más "+ num2 +" es " + suma);
    System.out.println("El resultado de la resta de "+ num1 +" menos "+ num2 +" es " + resta);
    System.out.println("El resultado de la multiplicación de "+ num1 +" por "+ num2 +" es " + multiplicacion);
    System.out.println("El resultado de la división de "+ num1 +" entre "+ num2 +" es " + division);
    

  }
}
