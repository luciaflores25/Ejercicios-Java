/* Nombre: Lucía Flores Padilla
 * Fecha: 25 de marzo de 2017
 * Ejercicio 29 bucles
 * Programación
 */
public class Ejercicio31 {
  public static void main (String[] args) {
    
    System.out.print("Introduce la altura con un número entero: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("*");
    }

  }
}
