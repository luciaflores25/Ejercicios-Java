/**
 * Programación
 * Tema 5 Bucles
 * 2 de noviembre de 2017
 * Ejercicio 13
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
  son positivos, y cuántos son negativos.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int contadorPositivos = 0;
    int contadorNegativos = 0;
    int contadorCero = 0;
    int contador = 1;
    int numeros = 0;
    
    System.out.println("Introduce 10 números pulsando intro");
    System.out.println("Y te diré cuantos son negativos y cuanos positivos.");
    System.out.println("Empieza a introducir números: ");
    
    do {
      numeros = Integer.parseInt(s.nextLine());
      contador++;
      if (numeros < 0){
        contadorNegativos++;
      }else if (numeros > 0){
        contadorPositivos++;
      }else {
      contadorCero++;
      }
    }while (contador <= 10);
    
    
    System.out.println("\nHas introducido " + contadorPositivos + " números positivos");
    System.out.println("Has introducido " + contadorNegativos + " números negativos");
    System.out.print("Has introducido " + contadorCero + " veces el número 0 ");
    
    System.out.print("que no es ni positivo ni negativo");
  }
}
