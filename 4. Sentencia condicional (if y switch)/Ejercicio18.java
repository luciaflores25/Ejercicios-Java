/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 18
 * 22 de octubre de 2017
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero
   introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero (max 5 cifras) y te diré cuál es la primera cifra: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int d1 = numero % 10;
    int d2 = numero % 100 / 10;
    int d3 = numero % 1000 / 100;
    int d4 = numero % 10000 / 1000;
    int d5 = numero % 100000 / 10000;
    
    if ((numero <=9) && (numero >=-9)) {
      System.out.println("La primera cifra de " + numero + " es " + d1);
    } else if ((numero <=99) && (numero >=-99)) {
      System.out.println("La primera cifra de " + numero + " es " + d2);
    } else if ((numero <=999) && (numero >=-999)) {
      System.out.println("La primera cifra de " + numero + " es " + d3);
    } else if ((numero <=9999) && (numero >=-9999)) {
      System.out.println("La primera cifra de " + numero + " es " + d4);
    }else if ((numero <=99999) && (numero >=-99999)) {
      System.out.println("La primera cifra de " + numero + " es " + d5);
    }
    
    
      
  }
}
