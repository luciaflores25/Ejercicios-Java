/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 19
 * 22 de octubre de 2017
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
   puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero (max 5 cígitos) y te diré cuantos dígitos tiene: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int d1 = numero % 10;
    int d2 = numero % 100 / 10;
    int d3 = numero % 1000 / 100;
    int d4 = numero % 10000 / 1000;
    int d5 = numero % 100000 / 10000;
    
    if ((numero <=9) && (numero >=-9)) {
      System.out.println("El número "+numero+" tiene 1 dígito");
    } else if ((numero <=99) && (numero >=-99)) {
      System.out.println("El número "+numero+" tiene 2 dígitos");
    } else if ((numero <=999) && (numero >=-999)) {
      System.out.println("El número "+numero+" tiene 3 dígitos");
    } else if ((numero <=9999) && (numero >=-9999)) {
      System.out.println("El número "+numero+" tiene 4 dígitos");
    }else if ((numero <=99999) && (numero >=-99999)) {
      System.out.println("El número "+numero+" tiene 5 dígito");
    }
  }
}
