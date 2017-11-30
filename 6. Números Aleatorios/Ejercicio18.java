/**
 * Programación
 * Tema 6 Números Aleatorios
 * 28 de noviembre de 2017
 * Ejercicio 18
 * 
 * 18. Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
       sustituir el color blanco por colores más alegres. Realiza un programa que
       genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
       cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
       que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
       violeta y naranja.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Colores para los cuartos de Sinestesio y Casilda\n");
    
    int color1 = 0;
    int color2 = 0;
    int color3 = 0;
    
    while((color1 == color2) || (color2 == color3) || (color1 == color3)){
      color1 = (int)(Math.random()*6) + 1;
      color2 = (int)(Math.random()*6) + 1;
      color3 = (int)(Math.random()*6) + 1;
    }
    
    switch(color1) {
      case 1:
        System.out.print(" rojo ");
        break;
      case 2:
        System.out.print(" azul ");
        break;
      case 3:
        System.out.print(" verde ");
        break;
      case 4:
        System.out.print(" amarillo ");
        break;
      case 5:
        System.out.print(" violeta ");
        break;
      case 6:
        System.out.print(" naranja ");
        break;
        default:
    }
    switch(color2) {
      case 1:
        System.out.print(" rojo ");
        break;
      case 2:
        System.out.print(" azul ");
        break;
      case 3:
        System.out.print(" verde ");
        break;
      case 4:
        System.out.print(" amarillo ");
        break;
      case 5:
        System.out.print(" violeta ");
        break;
      case 6:
        System.out.print(" naranja ");
        break;
        default:
    }
    switch(color3) {
      case 1:
        System.out.print(" rojo ");
        break;
      case 2:
        System.out.print(" azul ");
        break;
      case 3:
        System.out.print(" verde ");
        break;
      case 4:
        System.out.print(" amarillo ");
        break;
      case 5:
        System.out.print(" violeta ");
        break;
      case 6:
        System.out.print(" naranja ");
        break;
        default:
    }
    System.out.println();
  }
}
