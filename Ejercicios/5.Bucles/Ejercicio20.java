/* Nombre: Lucía Flores Padilla
 * Fecha: 22 de marzo de 2017
 * Ejercicio 20 bucles
 * Programación
 */
import java.util.Scanner;
  public class Ejercicio20 {
  public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa va a pintar una pirámide hueca");
  
  System.out.print("Introduce la altura de la pirámide: ");
  int alturaFinal = s.nextInt();

  System.out.print("Ahora introduce el carácter con el que quieres que se pinte: ");
  char caracter = (System.console().readLine()).charAt(0);

  System.out.print("\n");

  for(int altura = 1; altura <= alturaFinal; altura++){

    for(int espacios = 1; espacios <= alturaFinal-altura; espacios++){
      System.out.print(" ");
    }

    if(altura != 1){
      System.out.print(caracter);
    }

    for(int carac = 1; carac < 2 * altura - 2; carac++){
      if(altura != alturaFinal){
        System.out.print(" ");
      }else{
        System.out.print(caracter);
      }
    }
    System.out.print(caracter + "\n");
  }

  }//Cierra el public static
  
}//Cierra el public class
