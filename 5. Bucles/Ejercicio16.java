/**
 * Programación
 * Tema 5 Bucles
 * 3 de noviembre de 2017
 * Ejercicio 16
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
  primo. Un número primo es aquel que sólo es divisible entre él mismo y la
  unidad.

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean esPrimo = true;
    System.out.println("Introduce un número y te diré si es primo o no: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    int comprobacion = 0;
    
    for(int i = 2; i < numeroIntroducido; i ++) {
      
      comprobacion = numeroIntroducido % i;
      if (comprobacion == 0){
        esPrimo = false;
      }
      System.out.println(comprobacion);
    }
    if (esPrimo){
      System.out.println("El número es primo");
    }else{
      System.out.println("El número no es primo");
    }
  }
}
