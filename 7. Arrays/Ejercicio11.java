/**
 * Programación
 * Tema 7 Arrays
 * 5 de diciembre de 2017
 * Ejercicio 11
 * 
 * 11  Realiza un programa que pida 10 números por teclado y que los almacene en
       un array. A continuación se mostrará el contenido de ese array junto al índice
       (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
       primos a las primeras posiciones, desplazando el resto de números (los que
       no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
       el array resultante.
       
       Por ejemplo:
       Array Inicial: 20   5   7   4  32   9   2  14  11  6 
       Array final:    5   7   2  11  20   4  32   9  14  6
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] original = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    int contadorPares = 0;
    int contadorImpares = 0;
    int aux = 0;
    int i = 0;
    
    System.out.print("                    Array Original\n");
    
    for(i = 0; i <= 19; i++){//lee por teclado los datos del array
      original[i] = (int)(Math.random()*101);
      System.out.print(original[i] + " ");
      
      if(original[i] % 2 == 0){
        pares[i] = original[i];
        contadorPares++;
      }else{
        impares[i] = original[i];
        contadorImpares++;
      }
    }
    System.out.println("ContPares: " + contadorPares);
    System.out.println("ContImpares: " + contadorImpares);
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
