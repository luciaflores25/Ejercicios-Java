/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 20
 * 
 * 20. Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vamos a pintar una piramide vacia");
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    System.out.println();
    
    int altura = 1;
    int espacios = alturaIntroducida -1;
    int espaciosInternos = 1;
    int asteriscos = 1;
    
    for(int i = 1; i <= espacios; i++){
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
    altura++;
    espacios--;
    asteriscos +=2;
    
    while(altura < alturaIntroducida){
      for(int i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      System.out.print("*");
      
      
      for(int i = 1; i <= espaciosInternos; i++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      altura++;
      espacios--;
      espaciosInternos +=2;
      asteriscos +=2;
    }
    for(int i = 1; i <= asteriscos; i++){
      System.out.print("*");
    }
  }
}
