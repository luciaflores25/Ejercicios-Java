/**
 * Programación
 * Tema 7 Arrays Bidimensionales
 * 21 de Enero de 2018
 * Ejercicio 5
 * 
 * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[6][10];
    int fila = 0;
    int minFila = 0;
    int maxFila = 0;
    int columna = 0;
    int minColumna = 0;
    int maxColumna = 0;
    int minimo = 1001;
    int maximo = 0;
    
    System.out.println("Array de 6 filas por 10 columnas");
    
    //Aquí se introducen los números aleatorios para rellenar el array
    for (fila = 0; fila < 6; fila++){
      for (columna = 0; columna < 10; columna++){
        array[fila][columna] = (int)(Math.random()* +1000);
        
        if (array[fila][columna] > maximo){
          maximo = array[fila][columna];
          maxFila = fila;
          maxColumna = columna;
        }
        if (array[fila][columna] < minimo){
          minimo = array[fila][columna];
          minFila = fila;
          minColumna = columna;
        }
      }
    }
    
    //Aquí se imprime el array
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%4d   ", array[fila][columna]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("El máximo es " + maximo + " y está en la fila: " + maxFila + ", columna: " + maxColumna);
    System.out.println("El mínimo es " + minimo + " y está en la fila: " + minFila + ", columna: " + minColumna);
  }
}
