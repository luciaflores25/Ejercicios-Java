/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 8
 * 
 * 8. Modifica el programa anterior para que la probabilidad de que salga un 1 sea
      de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
      2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int apuesta;
    String apuestaSacada = "";
    for(int i = 1; i <= 14; i++){
      System.out.printf("%4d. ",i);
      for(int j = 1; j <= 3; j++){
        apuesta = (int)(Math.random()*6);
        switch(apuesta) {
          case 0:
          case 1:
          case 2:
            apuestaSacada = String.valueOf("1");
            break;
          case 3:
          case 4:
            apuestaSacada = "x";
            break;
          case 5:
            apuestaSacada = String.valueOf("2");
            break;
            default:
        }
        System.out.print(" " + apuestaSacada + " ");
      }
      System.out.println();
    }
    apuesta = (int)(Math.random()*6);
    switch(apuesta) {
          case 0:
          case 1:
          case 2:
            apuestaSacada = String.valueOf("1");
            break;
          case 3:
          case 4:
            apuestaSacada = "x";
            break;
          case 5:
            apuestaSacada = String.valueOf("2");
            break;
            default:
        }
    System.out.print("  15.  " + apuestaSacada + " ");
  }
}
