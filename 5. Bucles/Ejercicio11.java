/**
 * Programación
 * Tema 5 Bucles
 * 2 de noviembre de 2017
 * Ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
  los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número por favor: ");
    int numero = Integer.parseInt(s.nextLine());
    
    int contador = 5;
    int cuadrado= 0;
    int cubo= 0;
    
    System.out.println("Número    Cuadrado      Cubo");
    System.out.println("------------------------------");
    
    while(contador > 0 ){
      
      cuadrado = numero * numero;
      cubo = numero * numero * numero;
      
      System.out.println("  " + numero + "          " + cuadrado + "          " + cubo);
      numero++;
      contador--;
    }
  }
}
