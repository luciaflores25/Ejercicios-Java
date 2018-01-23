/**
 * Programación
 * Tema 7 Arrays Bidimensionales
 * 23 de Enero de 2018
 * Ejercicio 6
 * 
 * 6. Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class CorreccionEjercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[60];
    boolean esValido = true;
    
    for(int i = 0; i < 60; i++){
      
      do{
        esValido = true;
        numero[i] = (int)(Math.random() * 1001);
        
        for(int j = 0; j < i; j++){
          if(numero[i] == numero[j]){
            esValido = false;
          }
        }//cierra for j
        
        
      }while(!esValido);
    }//cierra for i
    
    for (int n : numero){
     System.out.print(n + " "); 
    }
    
    System.out.println("\n");
    
    //Pasamos el contenido de numero a numeroBi
    
    int[][] numeroBi = new int [6][10];
    int fila = 0;
    int columna = 0;
    
    for (int n: numero){
      numeroBi[fila][columna] = n;
      columna++;
      
      //Si la columna llega a 10 números se salta a la siguiente fila y se iguala a 0
      if(columna == 10) {
        fila++;
        columna = 0;
      }
    }
    
    //Aquí se muestra el contenido de numeroBi
    
    for(int [] f : numeroBi) {
      for(int n : f) {
        System.out.printf("%5d", n);
      }
      
      //Cada vez que se pinta una fila hacer un salto de línea
      System.out.println();
      
    }
    
  }
}
