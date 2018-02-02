/**
 * Este paquete contiene funciones de manejo de arrays
 * 
 * @author Lucía Flores Padilla
 * 
 * Programacion 1º DAW Segundo trimestre
 * Tema 8 Funciones
 * Ejercicios 29-34
 * Martes, 30 de enero de 2018
 */
 
package matematicas;
 
public class ManejoArrays{
   
  ///////////////  Para generar un array bidimensional /////////////////
   
  /**
   * 
   * @param 
   * @return 
   */
  public static int[][] generaArrayBi(int f, int c, int max, int min) {
    
    int resultado[][] = new int [f][c];
    
    for(int fila = 0; fila < f; fila++){
      for(int columna = 0; columna < c; columna++){
        resultado[fila][columna] = (int)(Math.random() * (max - min) + 1) + min;
      }
    }
    return resultado;
  }
  
  ///////////////  Para mostrar un array bidimensional /////////////////
  
  /**
   * 
   * @param 
   * @return 
   */
  public static void muestraArrayBi(int[][] x){
    for(int fila = 0; fila < x.length; fila++){
      for(int columna = 0; columna < x[0].length; columna++){
        System.out.print(x[fila][columna] + " ");
      }
      System.out.println();
    }
  }
}
 
