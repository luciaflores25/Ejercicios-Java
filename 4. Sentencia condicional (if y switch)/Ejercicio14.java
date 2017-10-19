/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 14
 * 19 de octubre de 2017
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
   divisible entre 5.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número y te diré si es par o divisible entre 5: ");
    int num = Integer.parseInt(System.console().readLine());
    int par = num % 2;
    int divisibleCinco = num % 5;
    if ((par == 0) && (divisibleCinco == 0)){
      System.out.print("El número " + num + " es par y divisible entre 5");
    }else if (par == 0){
      System.out.print("El número " + num + " es par");   
    }else if (divisibleCinco == 0) {
       System.out.print("El número " + num + " es divisible entre 5");  
    }
  }
}
