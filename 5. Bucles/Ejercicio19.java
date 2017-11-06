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
    
    System.out.println("Este programa pinta una pirámide");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el carácter con el que quieres pintar la pirámide: ");
    String caracter = s.nextLine();
    
    int espacios = altura -1;
    int altura2 = 1;
    int i;
    
    while (altura2 <= altura){
      do{
        i = 1;
        System.out.print(" ");
        i++;
      }while (i <= espacios);
      
      do{
        i = 1;
        System.out.print(caracter);
        i++;
      }while (i < altura2);
        
      System.out.println();

      altura2++;
      espacios--;
    }
  }
}
