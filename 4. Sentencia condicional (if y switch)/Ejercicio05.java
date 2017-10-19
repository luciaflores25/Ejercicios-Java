/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 5
 * 17 de octubre de 2017
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa resuelve una ecuación de primer grado (del tipo ax + b = 0)\n");
    System.out.print("Introduce el valor de a = ");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce el valor de b = ");
    int b = Integer.parseInt(System.console().readLine());
    
    double ecuacion = (double)-b/a;
    
    System.out.println("El resultado de la ecuación es x = " + ecuacion);
    
    if (a == 0) {
      System.out.println("La ecuación no se puede resolver, ya que x vale 0");
    }
  }
}
