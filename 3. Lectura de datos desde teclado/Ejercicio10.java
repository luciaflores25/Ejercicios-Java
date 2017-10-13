/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 10
 * 12 de octubre de 2017
 * 
 * Realiza un conversor de mb a kb
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número de MB para convertirlos a KB: ");
    double mb = Double.parseDouble(System.console().readLine());
    
    double kb = mb * 1024;
    
    System.out.println(mb + " MB son " + kb + " KB");

  }
}
