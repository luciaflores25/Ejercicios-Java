/**
 * Programación
 * Tema 5 Bucles
 * 31 de octubre de 2017
 * Ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero;
    int mul=0;
    int multiplicacion = 0;
    
    System.out.print("Introduce el número del que quieras obtener la tabla de multiplicar: ");
    numero = Integer.parseInt(s.nextLine());
    
    do {
      
      multiplicacion = numero * mul;
      System.out.println(numero + " x " + mul + " = " + multiplicacion);
      mul++;
      
    } while(mul < 11);
  }
}
