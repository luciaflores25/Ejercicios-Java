/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 4
 * 
 * 4. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
      por espacios.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra al azar 20 números enteros entre 0 y 10 ");
    for(int i = 1; i <= 20; i++){
      int numero = (int)(Math.random()*11);
      System.out.print(numero + " ");
    }
  }
}
