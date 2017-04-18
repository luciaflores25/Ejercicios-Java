/*@author Lucía Flores Padilla
 * Fecha: 18 de abril de 2017
 * Ejercicio 12 números aleatorios
 * Programación
 */
  
public class Ejercicio12 {

  public static void main(String[] args){
    
    String verde = "\033[32m";
    while (1 < 2) {
      
      char caracter = (char)((Math.random() * 94) + 32);
      
      System.out.print(verde + caracter);
    }
  }
}
