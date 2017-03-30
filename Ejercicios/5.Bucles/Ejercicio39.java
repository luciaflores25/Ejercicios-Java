/* Nombre: Lucía Flores Padilla
 * Fecha: 29 de marzo de 2017
 * Ejercicio 39 bucles
 * Programación
 */
public class Ejercicio39 {
  public static void main (String[] args) {
    
    int numeroIntroducido;

    System.out.print("Introduzca un número entero que sea positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int numero = 1; numero <= numeroIntroducido; numero++) {

      int factorial = numero;

      for (int i = 1; i < numero; i++) {
        factorial *= i;
      }

      System.out.println(numero + "! = " + factorial);
    }
  }
}
