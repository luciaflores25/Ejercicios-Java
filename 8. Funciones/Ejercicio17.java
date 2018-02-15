package ejercicios15a19;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores
 * Programación
 * Tema 8 Funciones
 * 
 * Ejercicio 17
 * 
 * Escribe un programa que pase de binario a decimal.
 * 
 * 14 febrero 2018
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    
    long decimal = matematicas.ManejoMatematicas.binarioADecimal(binario);
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
  
}
