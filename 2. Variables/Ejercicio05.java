/**
 * Programación
 * Tema 2 Variables
 * Ejercicio 5
 * 4 de octubre de 2017
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
   convertir deberá estar almacenada en una variable
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    int pesetas = 25;
    double euros = (double)pesetas * 0.006;
    
    System.out.printf("%d pesetas son %.2f€", pesetas, euros);
    
  }
}
