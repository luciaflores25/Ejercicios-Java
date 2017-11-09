/**
 * Programación
 * Tema 5 Bucles
 * 9 de noviembre de 2017
 * Ejercicio 12
 * 
 * 12. Escribe un programa que muestre los n primeros términos de la serie de
       Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
       y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
       los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
       debe introducir por teclado.

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n1 = 0;
    int n2 = 1;
    int aux;
    int contador = 0;
    
    System.out.print("Introduce el numero de terminos de la serie de Fibonacci ");
    System.out.print("que quieres que se muestren: ");
    int n = Integer.parseInt(s.nextLine());
    
    System.out.println("0\n" + "1");
    n = n -3;
    while (contador <= n){
      aux = n1; //aux = 0
      n1 = n2; //n1 = 1
      n2 = aux + n1; //n2 = 1
      System.out.println(n2);
      contador++;
    }
  }
}
