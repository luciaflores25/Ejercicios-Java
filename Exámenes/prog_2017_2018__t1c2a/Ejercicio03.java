/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones Multiplataforma (DAM)
 * 7 de diciembre de 2017
 * Ejercicio 3
 * 
 * 3. Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre
      0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
      criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se
      cambia por el siguiente múltiplo de 5 que exista a partir de él. Utiliza dos arrays, uno para contener los
      números originales y otro para guardar el resultado.
      
      Ejemplo:
      
      Array original:
      459 204 20 250 178 90 353 35 229 357 224 454 260 310 140
      
      Array cincuerizado:
      460 205 20 250 180 90 355 35 230 360 225 455 260 310 140
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] inicial = new int[15];
    int[] cincuerizado = new int[15];
    int eleccion = 0;
    
    System.out.println("Array original");
    for(int i = 0; i <= 14; i++){
      inicial[i] = (int)(Math.random()*501);
      System.out.print(inicial[i] + " ");
    }
    
    System.out.println("\n\nArray cincuerizado");
    for (int i = 0; i <= 14; i++) {
      if (inicial[i] % 5 == 0) {
        cincuerizado[i] = inicial[i];
        System.out.print(cincuerizado[i] + " ");
      } else {
        cincuerizado[i] = inicial[i] - (inicial[i] % 5) + 5;
        System.out.print(cincuerizado[i] + " ");
      }
    }
  }
}
