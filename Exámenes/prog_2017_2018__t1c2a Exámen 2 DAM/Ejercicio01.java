/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones Multiplataforma (DAM)
 * 5 de diciembre de 2017
 * Ejercicio 1
 * 
 * 1. Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
      deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
      programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”
      Ejemplo:
      45 92 4 2 25 17 8 90 35 29 55 24 45 66 30 74 90 13 18 72
      Números primos encontrados: 2 17 29 13
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa genera 20 números aleatorios ");
    System.out.print(" y hará una lista con los números primos que han salido.\n\n");
    
    boolean esPrimo = true;
    int cuentaPrimos = 0;
    int[] primos = new int[20];
    
    for(int i = 0; i <= 19; i++){
      int numero = (int)(Math.random()*100 + 2);
      System.out.print(numero + " ");
      
      int comprobacion = 0;
      esPrimo = true;
      for(int j = 2; j < numero; j++){
        comprobacion = numero % j;
        
        if(comprobacion == 0){
          esPrimo = false;
        }
      }
      if(esPrimo){
          primos[cuentaPrimos] = numero;
          cuentaPrimos++;
      }
    }
    System.out.println("\n\nCuenta Primos: " + cuentaPrimos);
    System.out.println();
    System.out.print("Números primos: ");
    for(int k = 0; k < cuentaPrimos; k++){
      System.out.print(primos[k] + " ");
    }
    
  }
}
