/**
 * Programación
 * Tema 6 Números Aleatorios
 * 5 de diciembre de 2017
 * Ejercicio 25
 * 
 * 25. Escribe un programa que muestre por pantalla 100 números enteros separa-
       dos por un espacio. Los números deben estar generados de forma aleatoria
       en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
       almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra 100 números aleatorios.");
    System.out.print("Los primod aparecerán entre almohadillas #13# ");
    System.out.println("y los múltiplos de 5 entre corchetes [25].\n");
    
    boolean esPrimo = true;
    
    for(int i = 1; i <= 100; i++){
      int aleatorio = (int)(Math.random()*100);
      
      
      int comprobacion = 0;
      esPrimo = true;
      for(int j = 2; j < aleatorio; j++){
        comprobacion = aleatorio % j;
        
        if(comprobacion == 0){
          esPrimo = false;
        }
      }
      if(esPrimo){
        System.out.print("#" + aleatorio + "# ");
      }else if (aleatorio % 5 == 0){
        System.out.print("[" + aleatorio + "] ");
      }else{
        System.out.print(aleatorio + " ");
      }
    }
  }
}
