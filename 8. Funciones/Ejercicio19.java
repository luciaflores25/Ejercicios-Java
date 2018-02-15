package ejercicios15a19;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores Programación Tema 8 Funciones
 *
 * Ejercicio 19
 *
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario, hexadecimal y octal.
 *
 * 14 febrero 2018
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String resultado = "";
    long numeroIntroducido = 0;

    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = s.nextLine();

    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(s.nextLine());
    }

    switch (opcion) {
      case 1:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioADecimal(numeroIntroducido));
        break;
      case 3:
        resultado = matematicas.ManejoMatematicas.binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(matematicas.ManejoMatematicas.octalABinario(numeroIntroducido));
        break;
      case 5:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioADecimal(matematicas.ManejoMatematicas.octalABinario(numeroIntroducido)));
        break;
      case 6:
        resultado = matematicas.ManejoMatematicas.binarioAHexadecimal(matematicas.ManejoMatematicas.octalABinario(numeroIntroducido));
        break;
      case 7:
        resultado = Long.toString(matematicas.ManejoMatematicas.decimalABinario(numeroIntroducido));
        break;
      case 8:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioAOctal(matematicas.ManejoMatematicas.decimalABinario(numeroIntroducido)));
        break;
      case 9:
        resultado = matematicas.ManejoMatematicas.binarioAHexadecimal(matematicas.ManejoMatematicas.decimalABinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(matematicas.ManejoMatematicas.hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioAOctal(matematicas.ManejoMatematicas.hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(matematicas.ManejoMatematicas.binarioADecimal(matematicas.ManejoMatematicas.hexadecimalABinario(numeroIntroducidoString)));
        break;
    }

    System.out.println(resultado);

  }

}
