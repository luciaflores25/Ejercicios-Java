/**
 * Programación
 * Tema 5 Bucles
 * 5 de noviembre de 2017
 * Ejercicio 19
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
  pedir por teclado. El carácter con el que se pinta la pirámide también se debe
  pedir por teclado.

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce una altura para pintar una pirámide rellena: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    
    int altura = 1;
    int espacios = alturaIntroducida -1;
    int asteriscos = 1;
    
    while(altura <= alturaIntroducida){
      for(int i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      for(int i = 1; i <= asteriscos; i++){
        System.out.print("*");
      }
      altura ++;
      System.out.println();
      espacios--;
      asteriscos +=2;
    }
  }
}
