/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones WEB (DAW)
 * 12 de diciembre de 2017
 * Ejercicio 1
 * 
 * 1. Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
      (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá mostrar por
      separado los múltiplos de 2, de 3 y de 5.
      
      Ejemplo:
      
      Array generado:
      49 22 57 79 3 52 32 46 1 14 10 70 30 45 89 55 63 13 97 100
      
      Múltiplos de 2: 22 52 32 46 14 10 70 30 100
      Múltiplos de 3: 57 3 45 63
      Múltiplos de 5: 10 70 30 45 55 100
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa rellena un array con 20 números aleatorios ");
    System.out.println("y muestra por separado los múltiplos de 2, de 3 y de 5.\n");
    
    int[] array = new int[20];
    int[] dos = new int[20];
    int[] tres = new int[20];
    int[] cinco = new int[20];
    
    System.out.println("Array generado aleatoriamente");
    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*100 + 1);//esto genera los 20 números aleatorios y los va metiendo dentro del array
      System.out.print(array[i] + " ");// esto imprime el array con los 20 números aleatorios
      
      if(array[i] % 2 == 0){//aqui se buscan los múltiplos de 2 y se guardan un array
        dos[i] = array[i];
        
      }else if(array[i] % 3 == 0){//aqui los múltiplos de 3
        tres[i] = array[i];
        
      }else if(array[i] % 5 == 0){//Y aquí los múltiplos de 5
        cinco[i] = array[i];
      }
    }//Cierra el for
    
    System.out.print("\n\nMúltiplos de dos: ");
    for(int i = 0; i <= 19; i++){
      if (dos[i] != 0){
        System.out.print(dos[i] + " ");
      }
    }
    
    System.out.print("\nMúltiplos de tres: ");
    for(int i = 0; i <= 19; i++){
      if (tres[i] != 0){
        System.out.print(tres[i] + " ");
      }
    }
    
    System.out.print("\nMúltiplos de cinco: ");
    for(int i = 0; i <= 19; i++){
      if (cinco[i] != 0){
        System.out.print(cinco[i] + " ");
      }
    }
    /////////////////////He tardado 25 min en hacerlo
  }
}
