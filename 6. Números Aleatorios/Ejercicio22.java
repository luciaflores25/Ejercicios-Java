/**
 * Programación
 * Tema 6 Números Aleatorios
 * 1 de diciembre de 2017
 * Ejercicio 22
 * 
 * 22. Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
       aleatorio. La cabeza se representará con el carácter @ y se debe colocar
       exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
       el cuerpo irá serpenteando de la siguiente manera: se generará de forma
       aleatoria un valor entre tres posibles que hará que el siguiente carácter se
       coloque una posición a la izquierda del anterior, alineado con el anterior o una
       posición a la derecha del anterior. La longitud de la serpiente se pedirá por
       teclado y se supone que el usuario introducirá un dato correcto.
      
        Ejemplo:
        Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
          @
          *
         *
          *
          *
           *
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la longitud de la serpiente contando la cabeza: ");
    System.out.println("\n");
    int longitud = Integer.parseInt(s.nextLine());
    int espacios = 13;
    
    System.out.println("            @");
  
    while (longitud > 1) {
      espacios += (int)(Math.random() * 3) - 1;
      
      for (int i = 1; i < espacios; i++) {
        System.out.print(" ");
      }

      System.out.println("*");

      longitud--;
    }
  }
}
