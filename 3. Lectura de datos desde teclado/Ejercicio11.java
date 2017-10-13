/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 11
 * 12 de octubre de 2017
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número de MB para convertirlos a KB: ");
    double kb = Double.parseDouble(System.console().readLine());
    
    double mb = kb / 1024;
    
    System.out.println(kb + " KB son " + mb + " MB");

  }
}
