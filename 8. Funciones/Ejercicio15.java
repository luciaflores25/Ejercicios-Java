package ejercicios15a19;

/**
 *
 * @author Lucía Flores Programación Tema 8 Funciones
 *
 * Ejercicio 15
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * 14 febrero 2018
 */
public class Ejercicio15 {

  public static void main(String[] args) {

    for (int i = 1; i <= 1000; i++) {
      if (matematicas.ManejoMatematicas.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }

  }

}
