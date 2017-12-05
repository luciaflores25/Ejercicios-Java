/**
 * Programación
 * Tema 7 Arrays
 * 4 de diciembre de 2017
 * Ejercicio 6
 * 
 * 6. Escribe un programa que lea 15 números por teclado y que los almacene en un
      array. Rota los elementos de ese array, es decir, el elemento de la posición 0
      debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
      la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
      del array.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[15];
    int[] array2 = new int[15];
    int aux = 0;
   
    System.out.println("Introduce 15 números (enteros) pulsando intro\n");
    
    for(int i = 0; i <= 14; i++){//lee por teclado los datos del array
      array[i] = Integer.parseInt(s.nextLine());
    }
    aux = array[14]; 
    for(int i = 0; i <= 14; i++){
      //aqui se imprime el array original
      System.out.print("[" + i + "]" + " = " + array[i] + "\n");
    }
  
    //se rota el array
    System.out.println();
    
     
    for(int i = 0; i <= 14; i++){
      array2[i] = (array[i] -1);
      array2[0] = aux;
      System.out.print("[" + i + "]" + " = " + array2[i] + "\n");
    }
  }
}
