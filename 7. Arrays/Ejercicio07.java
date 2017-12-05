/**
 * Programación
 * Tema 7 Arrays
 * 5 de diciembre de 2017
 * Ejercicio 7
 * 
 * 7. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
      muestre por pantalla separados por espacios. El programa pedirá entonces
      por teclado dos valores y a continuación cambiará todas las ocurrencias del
      primer valor por el segundo en la lista generada anteriormente. Los números
      que se han cambiado deben aparecer entrecomillados.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio07 {
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
