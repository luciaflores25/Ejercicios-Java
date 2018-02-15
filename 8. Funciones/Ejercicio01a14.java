package matematicas;

import java.util.Scanner;

/**
 * Programación 
 * Tema 8 
 * Funciones 
 * Ejercicios 1 - 14
 *
 * 11-01-2018
 *
 * @author Lucía Flores
 *
 */
public class Ejercicio01a14 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int pruebas = -1;

    do {

      System.out.println("Introduce el número del ejercicio que quieres corregir (1-14)");
      System.out.println("Introduce 0 para salir.");
      pruebas = Integer.parseInt(s.nextLine());

      switch (pruebas) {
        case 0:
          System.out.println("\nHas salido correctamente.");
          break;
        case 1:
          ///////////////  PRUEBA EJERCICIO 1 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 1\n");

          System.out.print("Introduce un número y te diré si es o no capicúa: ");
          int numeroIntroducido = Integer.parseInt(s.nextLine());

          if (ManejoMatematicas.esCapicua(numeroIntroducido)) {
            System.out.println("\nEl número que has introducido es capicúa.");
          } else {
            System.out.println("\nEl número que has introducido no es capicúa");
          }
          break;
        case 2:
          ///////////////  PRUEBA EJERCICIO 2 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 2\n");

          System.out.print("Introduce un número y te diré si es o no primo: ");
          int numeroIntroducido2 = Integer.parseInt(s.nextLine());

          if (ManejoMatematicas.esPrimo(numeroIntroducido2)) {
            System.out.println("El número que has introducido es primo.");
          } else {
            System.out.println("El número que has introducido no es primo");
          }
          break;
        case 3:
          ///////////////  PRUEBA EJERCICIO 3 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 3\n");

          System.out.println("Introduce un número y te dire cuál es el siguiente primo: ");
          int numeroIntroducido3 = Integer.parseInt(s.nextLine());

          int siguiente = ManejoMatematicas.siguientePrimo(numeroIntroducido3);

          System.out.println("El siguiente primo de " + numeroIntroducido3 + " es " + siguiente);
          break;
        case 4:
          ///////////////  PRUEBA EJERCICIO 4 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 4");
          System.out.println("Con una base y un exponente se muestra su potencia...\n");

          System.out.print("Introduce un número (base): ");
          int base = Integer.parseInt(s.nextLine());

          System.out.print("Ahora Introduce otro número (exponente): ");
          int exponente = Integer.parseInt(s.nextLine());

          double potencia = ManejoMatematicas.potencia(base, exponente);

          System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + potencia);
          break;
        case 5:
          ///////////////  PRUEBA EJERCICIO 5 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 5\n");

          System.out.print("Introduce un número y te diré cuantos dígitos tiene: ");
          int numeroIntroducido4 = Integer.parseInt(s.nextLine());

          int cuentaDigito = ManejoMatematicas.digitos(numeroIntroducido4);

          System.out.println("El " + numeroIntroducido4 + " tiene " + cuentaDigito + " dígitos");
          break;
        case 6:
          ///////////////  PRUEBA EJERCICIO 6 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 6\n");

          System.out.print("Introducé un número y te lo voltearé: ");
          int numeroIntroducido5 = Integer.parseInt(s.nextLine());

          int volteado = ManejoMatematicas.voltea(numeroIntroducido5);

          System.out.println("Tu número volteado es " + volteado);
          break;
        case 7:
          ///////////////  PRUEBA EJERCICIO 7 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 7");
          System.out.println("Este programa muestra la posición de un  dígito de un número introducido por el usuario\n");

          System.out.print("Introduce un número: ");
          int numeroIntroducido6 = Integer.parseInt(s.nextLine());

          System.out.print("Ahora introduce una posición de ese número y te diré qué número está ahi: ");
          int posicion = Integer.parseInt(s.nextLine());

          int posicionDelDigito = ManejoMatematicas.digitoN(numeroIntroducido6, posicion);

          System.out.println("En esa posición está el " + posicionDelDigito);
          break;
        case 8:
          ///////////////  PRUEBA EJERCICIO 8 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 8");
          System.out.print("Este programa te dice la primera ocurrencia de un número");
          System.out.print(" introducido por el usuario de otro número introducido anteriormente");
          System.out.println(", si no se encuentra aparecerá un -1\n");

          System.out.print("Introduce un número: ");
          int numeroIntroducido7 = Integer.parseInt(s.nextLine());

          System.out.print("Ahora introduce un número de 1 cifra: ");
          int cifra = Integer.parseInt(s.nextLine());

          int ocurrencia = ManejoMatematicas.posicionDeDigito(numeroIntroducido7, cifra);

          if (ocurrencia == -1) {
            System.out.println("El número " + cifra + " no se encuentra " + ocurrencia);
          } else {
            System.out.println("El número " + cifra + " aparece primero en la posición " + ocurrencia);
          }
          break;
        case 9:
          ///////////////  PRUEBA EJERCICIO 9 /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 9");
          System.out.println("Este programa le quita por detras n dígitos a un número introducido por el usuario\n");

          System.out.print("Introduce un número largo: ");
          long numeroIntroducido8 = Long.parseLong(s.nextLine());

          System.out.print("¿Cuántos dígitos le quieres quitar al número por detrás?: ");
          int quitarDetras = Integer.parseInt(s.nextLine());

          long resultadoDetras = ManejoMatematicas.quitaPorDetras(numeroIntroducido8, quitarDetras);

          System.out.println("Este es tu número acortado: " + resultadoDetras);
          break;
        case 10:
          ///////////////  PRUEBA EJERCICIO 10  /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 10");
          System.out.println("Este programa le quita por delante n dígitos a un número introducido por el usuario\n");

          System.out.print("Introduce un número largo: ");
          int numeroIntroducido9 = Integer.parseInt(s.nextLine());

          System.out.print("¿Cuántos dígitos le quieres quitar al número por delante?: ");
          int quitarDelante = Integer.parseInt(s.nextLine());

          int resultadoDelante = ManejoMatematicas.quitaPorDelante(numeroIntroducido9, quitarDelante);

          System.out.println("Este es tu número acortado: " + resultadoDelante);
          break;
        case 11:
          ///////////////  PRUEBA EJERCICIO 11  /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 11");
          System.out.println("Este programa le pega por detras un dígito a un número introducido por el usuario\n");

          System.out.print("Introduce un número largo: ");
          int numeroIntroducido10 = Integer.parseInt(s.nextLine());

          System.out.print("Escribe un dígito para pegarselo por detrás al número: ");
          int pegarDetras = Integer.parseInt(s.nextLine());

          int resultadoPegaDetras = ManejoMatematicas.pegaPorDetras(numeroIntroducido10, pegarDetras);

          System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDetras);
          break;
        case 12:
          ///////////////  PRUEBA EJERCICIO 12  /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 12");
          System.out.println("Este programa le pega por delante un dígito a un número introducido por el usuario\n");

          System.out.print("Introduce un número largo: ");
          int numeroIntroducido11 = Integer.parseInt(s.nextLine());

          System.out.print("Escribe un dígito para pegarselo por delante al número: ");
          int pegarDelante = Integer.parseInt(s.nextLine());

          int resultadoPegaDelante = ManejoMatematicas.pegaPorDelante(numeroIntroducido11, pegarDelante);

          System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDelante);
          break;
        case 13:
          ///////////////  PRUEBA EJERCICIO 13  /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 13");
          System.out.println("En este programa se eligen una posión inicial y otra final para coger el trozo de otro número ya introducido\n");

          System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: "
                  + matematicas.ManejoMatematicas.trozoDeNumero(78604000, 0, 3));
          System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: "
                  + matematicas.ManejoMatematicas.trozoDeNumero(78604000, 4, 6));
          System.out.println("Al 78604000 le cojo el trozo que va de la posición 2 a la 2: "
                  + matematicas.ManejoMatematicas.trozoDeNumero(78604000, 2, 2));

          break;
        case 14:
          ///////////////  PRUEBA EJERCICIO 14  /////////////////

          System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 14");
          System.out.println("Este programa junt dos números introducidos por el usuario\n");

          System.out.println("Juntando el 21 y el 40 da el " + matematicas.ManejoMatematicas.juntaNumeros(21, 40));
          System.out.println("Juntando el 789 y el 250 da el " + matematicas.ManejoMatematicas.juntaNumeros(789, 250));

          break;
        default:
          System.out.println("El ejercicio que has elegido no es correcto.");
      }

    } while (pruebas != 0);

  }

}
