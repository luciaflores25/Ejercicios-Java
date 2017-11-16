/**
 * Programación
 * Examen 1 DAW Primer Trimestre
 * 14 de noviembre de 2017
 * Ejercicio 3
 * 
 * 3. Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
      usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
    int ladoIntroducido = Integer.parseInt(s.nextLine());
    
    int altura = 2;
    int espaciosInternos = ladoIntroducido -4;
    int asteriscos = 1;
    
    for(int i = 1; i <= ladoIntroducido; i++){
      System.out.print("*");//este for pinta la primera línes
    }
    altura++;
    System.out.println();
    for(int i = 1; i <= ladoIntroducido; i++){
      System.out.print("*");//este for pinta la segunda línea
    }
    altura++;
    System.out.println();
    
    while (altura < ladoIntroducido){
      System.out.print("**");//Se ponen dos asteriscos para que pinten el lado doble de la derecha
      for(int i = 1; i <= espaciosInternos; i++){
        System.out.print(" ");//esto son los espacios internos
      }
      System.out.print("**");//se pintan 2 asteriscos para el lado de la izquierda
      altura++;
      System.out.println();
    }
    //Los dos siguientes for son las dos lineas de la base
    
    for(int i = 1; i <= ladoIntroducido; i++){
      System.out.print("*");
    }
    System.out.println();
    for(int i = 1; i <= ladoIntroducido; i++){
      System.out.print("*");
    }
  }
}
