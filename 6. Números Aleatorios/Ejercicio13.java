/**
 * Programación
 * Tema 6 Números Aleatorios
 * 23 de noviembre de 2017
 * Ejercicio 13
 * 
 * 13. Escribe un programa que simule la tirada de dos dados. El programa deberá
	   continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
	   dados tengan el mismo valor.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dado1 = 0;
    int dado2 = 1;
    
    System.out.println("Vamos a tirar 2 dados hasta que salgan iguales ");
    
    while(dado1 != dado2){
		dado1 = (int)(Math.random()*6) + 1;
		dado2 = (int)(Math.random()*6) + 1;
		System.out.println(dado1 + " " + dado2);
	}
  }
}
