/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 11
 * 
 * 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
       aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
       final aparecerá el número de suspensos, el número de suficientes, el número
       de bienes, etc.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int suficiente = 0;
    int suspenso = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for(int i = 1; i <= 20;i++){
      int notas = (int)(Math.random()*5) + 1;
      switch(notas) {
        case 1:
          System.out.println("suspenso");
          suspenso++;
          break;
        case 2:
          System.out.println("suficiente");
          suficiente++;
          break;
        case 3:
          System.out.println("bien"); 
          bien++;
          break;
        case 4:
          System.out.println("notable");
          notable++;
          break;
        case 5:
          System.out.println("sobresaliente");
          sobresaliente++;
          break;
          default:
      }
    }//cierra el for
    System.out.println();
    System.out.println("Se han introducido " + suspenso + " suspensos");
    System.out.println("Se han introducido " + suficiente + " suficientes");
    System.out.println("Se han introducido " + bien + " bien");
    System.out.println("Se han introducido " + notable + " notables");
    System.out.println("Se han introducido " + sobresaliente + " sobresalientes");
  }
}
