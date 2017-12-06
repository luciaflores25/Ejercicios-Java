/**
 * Programación
 * Tema 7 Arrays
 * 6 de diciembre de 2017
 * Ejercicio 16
 * 
* 16.  Escribe un programa que rellene un array de 20 elementos con números ente-
       ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
       el programa mostrará el array y preguntará si el usuario quiere resaltar los
       múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
       array escribiendo los números que se quieren resaltar entre corchetes.
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] inicial = new int[20];
    int eleccion = 0;
    
    
    for(int i = 0; i <= 19; i++){
      inicial[i] = (int)(Math.random()*401);
      System.out.print(inicial[i] + " ");
    }
    
    System.out.print("\n\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    eleccion = Integer.parseInt(s.nextLine());
      
    if(eleccion == 1){
      for (int i = 0; i <= 19; i++) {
        if (inicial[i] % 5 == 0) {
          System.out.print("[" + inicial[i] + "] ");
        } else {
          System.out.print(inicial[i] + " ");
        }
      }
      
    }else if (eleccion == 2){
      for (int i = 0; i <= 19; i++) {
        if (inicial[i] % 7 == 0) {
          System.out.print("[" + inicial[i] + "] ");
        } else {
          System.out.print(inicial[i] + " ");
        }
      }
    }else{
      System.out.println("\nLa opción que has elegido no es correcta. ");
    }
  }
}
