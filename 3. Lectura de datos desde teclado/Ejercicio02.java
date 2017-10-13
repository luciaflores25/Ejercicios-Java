/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 2
 * 10 de octubre de 2017
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
   convertir debe ser introducida por teclado
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una cantidad de dinero en euros ");
    System.out.print("(puede contener céntimos): ");
    double euros = Double.parseDouble(System.console().readLine());
    
    int pesetas = (int)(euros * 166.386);
    
    System.out.println(euros + "€ son " + pesetas + " pesetas.");
    

  }
}
