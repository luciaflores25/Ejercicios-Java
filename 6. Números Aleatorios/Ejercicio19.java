/**
 * Programación
 * Tema 6 Números Aleatorios
 * 30 de noviembre de 2017
 * Ejercicio 19
 * 
 * 19. Escribe un programa que muestre 50 números enteros aleatorios comprendi-
        dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
        luego el máximo de los pares el mínimo de los impares y la media de todos los
        números generados.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Se mostrarán 50 números enteros aleatorios entre (-100 y 200)");
    
    int pares = 0;
    int contadorPares = 0;
    int maxPar = 0;
    int contadorImpares = 0;
    int minImp = 0;
    int suma = 0;
    
    for(int i = 0; i <= 50; i++){
      int num = (int)(Math.random()*300) - 100;
      System.out.print(num + " ");
      
      suma += num;
      pares = num % 2;
      
      if (pares == 0){
        if (num > maxPar){
          maxPar = num;
        }
      }
      
      if (pares != 0){
        if (num < minImp){
          minImp = num;
        }
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("El máximo de los pares es " + maxPar);
    System.out.println("El mínimo de los impares es " + minImp);
    System.out.println("La media de los números introducidos es " + (suma/50));
  }
}
