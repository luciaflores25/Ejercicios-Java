/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 17
 * 22 de octubre de 2017
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero
   introducido por teclado.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero (max 7 cifras) y te diré cuál es la última cifra: ");
    int numero = /*Math.abs*/(Integer.parseInt(System.console().readLine()));
    
    if (numero >0){
      int ultimaCifra = numero % 10;
      System.out.println("La última cifra de " + numero + " es " + ultimaCifra);
    }else if (numero < 0){
      int ultimaCifra = numero % 10;
      int negativo = ultimaCifra * -1;
      System.out.println("La última cifra de " + numero + " es " + negativo);
    }
  }
}
