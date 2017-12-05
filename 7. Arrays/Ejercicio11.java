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
    
    int[] inicial = new int [10];
    int i = 0;
    int[] primos = new int[10];
    int noPrimos = inicial.length-1;//para empezar el array desde el final
    int contadorPrimos = 0;
    int contadorNoPrimos = 0;
    boolean esPrimo = true;
    
    System.out.println("Introduce 10 números (enteros): ");
    for(i = 0; i <= 9; i++){
      inicial[i] = Integer.parseInt(s.nextLine());
    }
    
    for(i = 0; i <= 9; i++){
      int comprobacion = 0;
      esPrimo = true;
      for(int j = 2; j < inicial[i]; j++){
        comprobacion = inicial[i] % j;
        
        if(comprobacion == 0){
          esPrimo = false;
        }
      }
      if(esPrimo){
        primos[contadorPrimos] = inicial[i];
        contadorPrimos++;
      }else{
        primos[noPrimos] = inicial[i];
        noPrimos--;
      }
    }
    
    System.out.println("\nArray inicial: ");
    for(i = 0; i <= 9; i++){
      System.out.print(inicial[i] + "  ");
    }
    
    System.out.println("\nArray inicial: ");
    for(i = 0; i <= 9; i++){
      System.out.print(primos[i] + "  ");
    }
    
  }
}
