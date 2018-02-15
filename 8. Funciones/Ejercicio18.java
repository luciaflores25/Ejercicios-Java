package ejercicios15a19;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores
 * Programación
 * Tema 8 Funciones
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que pase de decimal a binario.
 * 
 * 14 febrero 2018
 */
public class Ejercicio18 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int decimal = s.nextInt();
    
    long binario = matematicas.ManejoMatematicas.decimalABinario(decimal);
    
    System.out.println(decimal + " en decimal es " + binario + " en binario.");
  }
  
}
