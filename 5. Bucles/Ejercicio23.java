/**
 * Programación
 * Tema 5 Bucles
 * 9 de noviembre de 2017
 * Ejercicio 23
 * 
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada
       de números mientras su suma no supere el valor 10000. Cuando esto último
       ocurra, se debe mostrar el total acumulado, el contador de los números
       introducidos y la media.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce numeros (enteros) pulsando intro: ");
    
    int nLimite = 10000;
    int contador = 0;
    int suma = 0;
    
    while (suma <= nLimite){
      int n = Integer.parseInt(s.nextLine());
      suma += n;
      contador++;
    }
    int media = suma / contador;
    System.out.println("\nEl total acumulado es " + suma);
    System.out.println("Se han introducido " + contador + " numeros");
    System.out.print("La media de " + suma + " entre los " + contador);
    System.out.print(" numeros introducidios es " + media);
  }
}
