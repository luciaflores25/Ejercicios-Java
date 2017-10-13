/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 3
 * 10 de octubre de 2017
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
   convertir debe ser introducida por teclado
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una cantidad de dinero en pesetas: ");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double euros = (double)pesetas * 0.006;
    
    System.out.printf("%d pesetas son %.2f€", pesetas, euros);
    

  }
}
