/* Nombre: Lucía Flores Padilla
 * Fecha: 29 de marzo de 2017
 * Ejercicio 41 bucles
 * Programación
 */
public class Ejercicio41 {
  public static void main (String[] args) {
    
    System.out.print("Introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.println("------------------------------------");
    System.out.println(" ");
    long n = numeroIntroducido;
    int pares = 0;
    int impares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
      n /= 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
  }
}
