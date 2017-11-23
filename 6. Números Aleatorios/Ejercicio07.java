/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 7
 * 
 * 7. Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
      para los 14 partidos y el pleno al quince (15 filas).
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int apuesta;
    String apuestaSacada = "";
    for(int i = 1; i <= 14; i++){
      System.out.printf("%4d. ",i);
      for(int j = 1; j <= 3; j++){
        apuesta = (int)(Math.random()*3);
        switch(apuesta) {
          case 0:
            apuestaSacada = String.valueOf("1  |");
            break;
          case 1:
            apuestaSacada = " x |";
            break;
          case 2:
            apuestaSacada = String.valueOf("  2|"); 
            break;
            default:
        }
        System.out.print(" " + apuestaSacada + " ");
      }
      System.out.println();
    }
    apuesta = (int)(Math.random()*3);
    switch(apuesta) {
      case 0:
        apuestaSacada = String.valueOf("1  |");
        break;
      case 1:
        apuestaSacada = " x |";
        break;
      case 2:
        apuestaSacada = String.valueOf("  2|"); 
        break;
        default:
    }
    System.out.print("  15.  " + apuestaSacada + " ");
  }
}
