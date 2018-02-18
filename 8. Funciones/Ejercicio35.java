package ejercicios35a40;

import java.util.Scanner;
import matematicas.ManejoMatematicas;

/**
 *
 * @author Lucía Flores Programación Tema 8 Funciones
 *
 * Ejercicio 35
 *
 * Crea una función con la siguiente cabecera:
 *
 * public static String convierteEnPalotes(int n)
 *
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | |
 * | | | | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en
 * un programa para comprobar que funciona bien. Desde la función no se debe
 * mostrar nada por pantalla, solo se debe usar print desde el programa
 * principal.
 *
 * 18 febrero 2018
 */
public class Ejercicio35 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número largo y lo convertiré en palotes: ");
    long numero = Long.parseLong(s.nextLine());
    
    System.out.println("Conversión a palotes: ");
    System.out.println(ManejoMatematicas.convierteEnPalotes(numero));
  }
}

