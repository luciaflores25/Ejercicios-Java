/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 6
 * 10 de octubre de 2017
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("Este programa va a calcular el área de un triángulo...");
    System.out.print("Introduce su base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    double area = ((double)base * (double)altura) / 2;
    
    System.out.println("\nEl área del triángulo es " + area);

    

  }
}
