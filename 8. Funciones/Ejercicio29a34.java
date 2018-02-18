package matematicas;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores
 *
 * Programacion 1º DAW Segundo trimestre Tema 8 Funciones Prueba de los
 * ejercicios 29-34 17 de febrero de 2018
 */
public class Ejercicio29a34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int pruebas = -1;

    do {
      System.out.println("\nARRAYS BIDIMENSIONALES");
      System.out.println("--------------------------------------------");
      System.out.println("1. Generar un array con 4 parámetros y mostrarlo");
      System.out.println("2. Generar un array con 2 parámetros y mostrarlo");
      System.out.println("3. Devuelve una fila de un array bidimensional");
      System.out.println("4. Devuelve una columna de un array bidimensional");
      System.out.println("5. Obtener coordenadas de un número en un array bidimensional");
      System.out.println("6. Comprobar si un número es punto de silla");
      System.out.println("7. Obtener la diagonal de un array bidimensional");
      System.out.println("8. Obtener el valor máximo de un arrayBi");
      System.out.println("9. Obtener el valor mínimo de un arrayBi");
      System.out.println("Elige el ejercicio que quieres probar.");
      System.out.println("Introduce 0 para salir.");
      pruebas = Integer.parseInt(s.nextLine());

      switch (pruebas) {
        case 0:
          System.out.println("\nHas salido correctamente.");
          break;
        case 1:
          System.out.println("HAS ELEGIDO GENERAR UN ARRAY CON 4 PARÁMETROS\n");

          int[][] array = ManejoArraysBi.generaArrayBiInt(20, 8, 0, 100);

          ManejoArraysBi.muestraArrayBiInt(array);

          break;
        case 2:
          System.out.println("HAS ELEGIDO GENERAR UN ARRAY CON 2 PARÁMETROS\n");
          System.out.println("Aquí lo tienes: ");

          int[][] array2 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array2);

          break;
        case 3:
          System.out.println("HAS ELEGIDO EXTRAER UNA FILA DE UN ARRAY BIDIMENSIONAL\n");

          int[][] array3 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array3);

          System.out.print("Introduce el número de la fila que queires sacar: ");
          int numFila = Integer.parseInt(s.nextLine());

          int[] filaArray;
          filaArray = ManejoArraysBi.filaDeArrayBiInt(array3, numFila);
          System.out.print("Fila elgida: ");
          ManejoArrays.muestraArrayInt(filaArray);

          break;
        case 4:
          System.out.println("HAS ELEGIDO EXTRAER UNA COLUMNA DE UN ARRAY BIDIMENSIONAL\n");

          int[][] array4 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array4);

          System.out.print("Introduce el número de la columna que queires sacar: ");
          int numColumna = Integer.parseInt(s.nextLine());

          int[] columnaArray;
          columnaArray = ManejoArraysBi.columnaDeArrayBiInt(array4, numColumna);
          System.out.print("Columna elgida: ");
          ManejoArrays.muestraArrayInt(columnaArray);

          break;
        case 5:
          System.out.println("HAS ELEGIDO OBTENER LAS COORDENADAS DE UN NÚMERO\n");

          System.out.print("Introduce un número para ver sus coordenadas: ");
          int numABuscar = Integer.parseInt(s.nextLine());

          int[] coordenadasArray;

          int[][] array5 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array5);
          coordenadasArray = ManejoArraysBi.coordenadasEnArrayBiInt(array5, numABuscar);
          System.out.print("Coordenadas: ");
          ManejoArrays.muestraArrayInt(coordenadasArray);

          break;
        case 6:
          System.out.println("HAS ELEGIDO COMPROBAR SI UN NÚMERO ES PUNTO DE SILLA\n");

          int[][] array6 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array6);

          System.out.print("Introduce un número del array para comprobar si es punto de silla: ");
          int numIntroducido = Integer.parseInt(s.nextLine());

          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              if (ManejoArraysBi.esPuntoDeSilla(array6, i, j)) {
                System.out.println("fila " + i + ", columna " + j + " -> " + array6[i][j]);
                System.out.println("Es punto de silla");
              }
            }
          }

          break;
        case 7:
          System.out.println("HAS ELEGIDO OBTENER LA DIAGONAL DE UN ARRAY BIDIMENSIONAL");
          int[][] array7 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array7);

          System.out.println("\nBusca los puntos de silla: ");
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              if (ManejoArraysBi.esPuntoDeSilla(array7, i, j)) {
                System.out.println("fila " + i + ", columna " + j + " -> " + array7[i][j]);
              }
            }
          }

          break;
          case 8:
          System.out.println("HAS ELEGIDO SACAR EL VALOR MÁXIMO DE UN ARRAY\n");
          
          int[][] array8 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array8);
          System.out.println("Máximo: " + ManejoArraysBi.maximoArrayBiInt(array8));
          
          break;
          case 9:
          System.out.println("HAS ELEGIDO SACAR EL VALOR MÍNIMO DE UN ARRAY\n");
          
          int[][] array9 = ManejoArraysBi.generaArrayBiInt(10, 10, 0, 100);
          ManejoArraysBi.muestraArrayBiInt(array9);
          System.out.println("Mínimo: " + ManejoArraysBi.minimoArrayBiInt(array9));
          
          break;
        default:
          System.out.println("El ejercicio que has elegido no es correcto.");
      }

    } while (pruebas != 0);
  }

}
