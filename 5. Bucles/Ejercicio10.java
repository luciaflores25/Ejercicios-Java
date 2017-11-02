/**
 * Programación
 * Tema 5 Bucles
 * 31 de octubre de 2017
 * Ejercicio 10
 * 
 * Escribe un programa que calcule la media de un conjunto de números
 * positivos introducidos por teclado. A priori, el programa no sabe
 * cuántos números se introducirán. El usuario indicará que ha terminado
 * de introducir los datos cuando meta un número negativo.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa hará la media de los números introducidos.");
    System.out.println("El programa se parará al introducir un número negativo.");
    System.out.println("Ve introduciendo números pulsando intro: ");
    
    int numeros = 0;
    int contador = 0;
    int suma = 0;
    
    
    while (numeros >= 0){
      numeros = Integer.parseInt(s.nextLine());
      contador++;
      suma += numeros;
    }

    int sumaTodos = suma - numeros;
    int cuentaNumeros = contador -1;
    double media = (double)sumaTodos / (double)cuentaNumeros;
    
    System.out.println("Se han introducido " + cuentaNumeros + " números");
    System.out.println("La media de los números introducidos es " + media);
    
    
  }
}
