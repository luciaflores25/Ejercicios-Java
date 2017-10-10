/**
 * Programación
 * Tema 2 Variables
 * Ejercicio 4
 * 4 de octubre de 2017
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
   convertir deberá estar almacenada en una variable
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio04 {
  public static void main(String[] args) {

    double euros = 25.50;
    int pesetas = (int)(euros * 166.386);
    
    System.out.println(euros + "€ son " + pesetas + " pesetas.");
    
  }
}
