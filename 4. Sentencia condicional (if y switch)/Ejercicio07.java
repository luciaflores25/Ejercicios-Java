/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 7
 * 18 de octubre de 2017
 * 
 * Realiza un programa que calcule la media de tres notas
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.print("Este programa calcula la media de 3 notas ");
    System.out.print("Introduce la primera nota:  ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota:  ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota:  ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.printf("La media de las tres notas introducidas es %.2f", media);
  }
}
