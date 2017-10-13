/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 5
 * 10 de octubre de 2017
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa va a calcular el área de un rectángulo...");
    System.out.print("Introduce su base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int area = base * altura;
    
    System.out.println("\nEl área del rectángulo es " + area);

    

  }
}
