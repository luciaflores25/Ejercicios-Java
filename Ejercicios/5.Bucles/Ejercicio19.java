/* Nombre: Lucía Flores Padilla
 * Fecha: 16 de marzo de 2017
 * Ejercicio 19 bucles
 * Programación
 */
import java.util.Scanner;
  public class Ejercicio19 {
  public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa va a pintar una pirámide.");
  
  System.out.print("Introduce la altura de la pirámide: ");
  int alturaFinal = s.nextInt();

  System.out.print("Ahora introduce el carácter con el que quieres que se pinte: ");
  char caracter = (System.console().readLine()).charAt(0);

  System.out.print("\n");

  for(int altura = 1; altura <= alturaFinal; altura++){

    for(int espacios = 0; espacios <= alturaFinal-altura; espacios++){
      System.out.print(" ");
    }

    for(int carac = 1; carac < 2 * altura; carac++){
      System.out.print(caracter);
    }
    System.out.print("\n");
  }
  
  
  
  }//Cierra el public static
  
}//Cierra el public class
