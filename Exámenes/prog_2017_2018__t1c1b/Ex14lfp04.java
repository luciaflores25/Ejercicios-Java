/**
 * Programación
 * Examen 1 DAW Primer Trimestre (Mi Exámen)
 * 5 de diciembre de 2017
 * Ejercicio 4
 * 
 * 4. Los números “donut” son los que tienen un 0 justo en la posición central, en caso de que el número de
      cifras sea impar; o bien, los que tienen dos ceros en las posiciones centrales, en caso de que el
      número de dígitos sea par. El resto de dígitos pueden ser ceros o no, no se tienen en cuenta. Por
      ejemplo, los números 23037, 1008, 9060044, 0 y 8000 son “números donut”. Sin embargo 6758, 8903,
      4200, 1234 y 7 no lo son. Realiza un programa que diga si un número introducido por teclado es un
      “número donut” o no.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo: ");
    long numeroIntroducido = s.nextLong();
    
    long aux = numeroIntroducido;
    int contadorDeCifras = 0;
    int primeraParte;
    boolean numeroDonut = false;
    //contamos cifras
    while (aux > 0) {
      aux /= 10;
      contadorDeCifras++;
    }
    int cifras = contadorDeCifras;
    aux = numeroIntroducido;
    if (contadorDeCifras % 2 == 0) { //Si el número es par se mete aqui
      while (contadorDeCifras > cifras / 2 + 1) {
        aux /= 10;
        contadorDeCifras--;
      }
      primeraParte = (int) aux % 10; //empieza a comprobar los datos desde el 0 del centro hacia la derecha
      aux /= 10;
      int segundaParte = (int) aux % 10; //sigue comprobando el siguiente numero de la derecha
      if (primeraParte == 0 && segundaParte == 0) {
        numeroDonut = true;
      }
    } else { //Aquí se mete si el número es impar
      while (contadorDeCifras > cifras / 2 + 1) {
        aux /= 10;
        contadorDeCifras--;
      }
      primeraParte = (int) aux % 10;
      if (primeraParte == 0) {
        numeroDonut = true;
      }
    }
    if (numeroDonut) {
      System.out.println("\nEl " + numeroIntroducido + " es es un número donut.");
    } else {
      System.out.println("\nEl " + numeroIntroducido + " no es un número donut.");
    }
  }
}
