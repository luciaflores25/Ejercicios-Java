/**
 * Programación
 * Tema 8 Funciones
 * 30 de enero de 2018
 * Prueba ejercicios del 29 al 34
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicios29a34 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[100];
    int aux = 0;
    int i = 0;
   
    System.out.println("Este programa muestra 100 números aleatorios\n");
    
    for(i = 0; i <= 99; i++){//lee por teclado los datos del array
      array[i] = (int)(Math.random()*21);
      System.out.print(array[i] + " ");
    }
    System.out.print("\n\nElige un número de los 100 que han aparecido: ");
    int elegido = Integer.parseInt(s.nextLine());
    
    System.out.print("\n\nEscribe el número por el que lo quieres sustituir: ");
    int sustituido = Integer.parseInt(s.nextLine());
    
    //Aquí se vuelven a mostrar los 100 números pero con el cambio
    for (i = 0; i <= 99; i++){
      if(array[i] == elegido){//se busca donde aparece el número que hemos elegido
          array[i] = sustituido;//se sustituye el número elegido por el otro
          System.out.print("\"" + array[i] + "\" ");
      }else{
        System.out.print(array[i] + " ");
      }
    }
  }
}

