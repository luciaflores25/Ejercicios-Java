/**
 * Programación
 * Tema 7 Arrays
 * 30 de noviembre de 2017
 * Ejercicio 1
 * 
 * 1. Define un array de 12 números enteros con nombre num y asigna los valores
      según la tabla que se muestra a continuación. Muestra el contenido de todos
      los elementos del array. ¿Qué sucede con los valores de los elementos que no
      han sido inicializados?
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num; // se define n como un array de enteros
    num = new int[12]; // se reserva espacio para 4 enteros
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] =14;
    num[8] = 5;
    num[9] = 120;
    
    for(int i = 0; i < 12; i++){
      System.out.println("num[" + i + "] = " + num[i]);
    }
  }
}
