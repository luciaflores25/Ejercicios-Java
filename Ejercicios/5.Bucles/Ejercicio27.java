/* Nombre: Lucía Flores Padilla
 * Fecha: 27 de marzo de 2017
 * Ejercicio 27 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio27 {
  public static void main (String[] args) {
    
    System.out.println("En este programa se van a mostrar, contar y sumar los múltiplos de 3");
    System.out.println("que hay entre 1 y un número que se introduzca por teclado.");
    System.out.println("---------------------------------------------------------------- ");
    System.out.print("Introduce un número entero: ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    int i = 0;
    int contador = 0;
    int suma = 0;
    
    System.out.println();
    
    while (i <= numero) { 
      if ((i % 3) == 0) {
        System.out.println(i);
        contador++;
        suma += i;
      }
      i++;
    }
    
    System.out.println("---------------------------------------------------------");
    System.out.println("La cantidad de números múltiplos de 3 que hay entre el 1");
    System.out.println("y el número introducido es: " + contador);
    System.out.println("Y la suma de los números da como resultado: " + suma);
  
  }//Cierra el public static

}//Cierra el public class
