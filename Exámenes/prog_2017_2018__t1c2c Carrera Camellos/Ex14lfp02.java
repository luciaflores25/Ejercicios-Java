/**
 * 
 * @author Lucía Flores Padilla
 * 
 * Examen Programación - Turno 2
 * 
 * 14-12-17
 * 
 *  Ejercicio 2
 * 
 *  Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100
    (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno
    de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.
    Ejemplo:
    
    Array generado:
    19 22 57 11 3 52 32 46 2 14
    
    El 19 es primo y no es capicúa.
    El 22 no es primo y es capicúa.
    El 57 no es primo y no es capicúa.
    El 11 es primo y es capicúa.
    El 3 es primo y es capicúa.
    El 52 no es primo y no es capicúa.
    El 32 no es primo y no es capicúa.
    El 46 no es primo y no es capicúa.
    El 2 es primo y es capicúa.
    El 14 no es primo y no es capicúa.
 * 
 */
 
import java.util.Scanner;
public class Ex14lfp02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[10];
    int[] aux = new int[10];
    boolean esPrimo = true;
    boolean esCapicua  = false;
    int[] volteado = new int[10];
    
    System.out.println("Array generado");
    for(int i = 0; i < array.length; i++){
      aux[i] = (int)(Math.random()*99 + 2);
      array[i] = aux[i];
      System.out.print(array[i] + " ");
    }
    System.out.println("\n");
    for(int i = 0; i < aux.length; i++){
      
      int comprobacion = 0;
      esPrimo = true;
      esCapicua  = false;
      
      for(int j = 2; j < aux[i]; j++){
        comprobacion = aux[i] % j;
        
        if(comprobacion == 0){
          esPrimo = false;
        }
      }
      
      while (array[i] > 0) {
        volteado[i] = (volteado[i] * 10) + (array[i] % 10);
        array[i] /= 10;
      }
      if (volteado[i] == aux[i]) {
        esCapicua = true;
      }
      
      if((esPrimo) && (esCapicua)){
        System.out.println("El " + aux[i] + " es capicúa y es primo");
      }else if(esCapicua){
        System.out.println("El " + aux[i] + " no es primo y es capicúa");
      }else if(esPrimo){
        System.out.println("El " + aux[i] + " es primo y no es capicúa");
      }else{
        System.out.println("El " + aux[i] + " no es primo y no es capicúa");
      }      
    }//Cierra el for grande
    
    
  }
}
