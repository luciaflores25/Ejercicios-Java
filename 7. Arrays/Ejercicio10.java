/**
 * Programación
 * Tema 7 Arrays
 * 5 de diciembre de 2017
 * Ejercicio 10
 * 
 * 10.  Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
        y que los almacene en un array. El programa debe ser capaz de pasar todos
        los números pares a las primeras posiciones del array (del 0 en adelante) y
        todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
        es necesario.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] original = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    int aux = 0;
    int i = 0;
    
    System.out.print("                    Array Original\n");
    
    for(i = 0; i <= 19; i++){//lee por teclado los datos del array
      original[i] = (int)(Math.random()*101);
      
      
      if(original[i] % 2 == 0){
        pares[i] = original[i];
      }else{
        impares[i] = original[i];
      }
    }
    System.out.println();
    System.out.print("\n                 Array de pares primero\n");
    
    for(i = 0; i <= 19; i++){
      if (pares[i] != 0){
        System.out.print(pares[i] + " ");
      }
    }
    for(i = 0; i <= 19; i++){
      if (impares[i] != 0){
        System.out.print(impares[i] + " ");
      }
    }
  }
}
