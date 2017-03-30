/* Nombre: Lucía Flores Padilla
 * Fecha: 30 de marzo de 2017
 * Ejercicio 37 bucles
 * Programación
 */
public class Ejercicio42 {
  public static void main (String[] args) {
    
    System.out.print("Introduce un número entero y positivo: \n");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.println(" ");
    boolean primo;

    for (int numero = numeroIntroducido; numero < numeroIntroducido + 5; numero++) {

      // Esto es para comprobar si el numero es primo
      primo = true;
      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          primo = false;
        }
      }

      // Esto muestra si el numero es primo o no
      if (primo) {
        System.out.println(numero + " es  primo.");
      } else {
        System.out.println(numero + " no es primo.");
      }
    }
    System.out.println();
  }
}
