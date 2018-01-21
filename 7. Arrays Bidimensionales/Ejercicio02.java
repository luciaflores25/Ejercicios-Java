/**
 * Programación
 * Tema 7 Arrays Bidimensionales
 * 21 de Noviembre de 2018
 * Ejercicio 2
 * 
 * 2. Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[4][5];
    int fila = 0;
    int columna = 0;
    int sumarFilas = 0;
    int totalFila = 0;
    int sumarColumnas = 0;
    int totalColumnas = 0;
    int total = 0;
    
    System.out.println("Introduce 20 números enteros.");
    
    //Aquí se introducen los 20 números enteros para rellenar el array
    for (fila = 0; fila < 4; fila++){
      for (columna = 0; columna < 5; columna++){
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        array[fila][columna] = Integer.parseInt(s.nextLine());
      }
    }
    
    //Aquí se pinta el array con el resultado de la suma de cada fila y se hace la suma del total
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%4d   ", array[fila][columna]);
        sumarFilas += array[fila][columna];
        total += array[fila][columna];
      }
      
      System.out.printf("⇨ %6d ", sumarFilas);
      totalFila += sumarFilas;
      sumarFilas = 0;  /*Cada vez que se suma una fila hay que volver a poner el total en 0*/
      System.out.println();/*para que empiece de nuevo a sumar la siguiente fila*/
       
    }
    
    System.out.print("   ⇩");
    for (columna = 0; columna < 4; columna++) {
      System.out.printf("%6s ", "⇩");
    }
    
    System.out.println();
    //Aquí se pinta la suma de cada columna
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        sumarColumnas += array[fila][columna];
      }
      
      if(columna == 4) {
        System.out.printf("%4d ", sumarColumnas);
      }else {
        System.out.printf("%4d   ", sumarColumnas);
      }
      totalColumnas += sumarColumnas;
      sumarColumnas = 0;
    }
    System.out.print("Total ⇨ " + total);
  }
}
