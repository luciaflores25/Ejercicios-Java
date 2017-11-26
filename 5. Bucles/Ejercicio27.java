/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 27
 * 
 * 27. Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
       entre 1 y un número leído por teclado.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(s.nextLine());
    
    int contador = 0;
    int suma = 0;
    
    System.out.println();
    
    for(int i = 1; i <= n; i++){
      if ((i % 3) == 0) {
        System.out.print(i + "  ");
        contador++;
        suma += i;
      }
    }
    System.out.println();
    System.out.print("\nLa cantidad de números múltiplos de 3 que hay entre el 1 ");
    System.out.println("y el " + n + " es: " + contador);
    System.out.println("Y la suma de esos números es " + suma);
  }
}
