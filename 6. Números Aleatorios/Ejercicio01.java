/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 1
 * 
 * 1. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
      también la suma total (los puntos que suman entre los tres dados).
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra la tirada de tres dados ");
    int suma = 0;
    
    for(int i = 0; i <= 2; i++){
      int tirada = (int)(Math.random()*6) + 1;
      System.out.print(tirada + " ");
      suma += tirada;
    }
    System.out.println();
    System.out.println();
    System.out.println("La suma de los tres dados es " + suma);
  }
}
