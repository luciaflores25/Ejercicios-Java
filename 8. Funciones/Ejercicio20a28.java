package matematicas;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores
 *
 * Programacion 1º DAW Segundo trimestre Tema 8 Funciones Prueba de los
 * ejercicios 20-28 15 de febrero de 2018
 */
public class Ejercicio20a28 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int pruebas = -1;

    do {
      System.out.println("\n1. Mostrar un array");
      System.out.println("2. Generar un array");
      System.out.println("3. Sacar el valor mínimo de un array");
      System.out.println("4. Sacar el máximo valor de un array");
      System.out.println("5. Hacer la media de un array");
      System.out.println("6. Comprobar si un número está dentro de un array");
      System.out.println("7. Saber la primera ocurrencia de un número dentro de un array");
      System.out.println("8. Voltear un array");
      System.out.println("9. Rotar array n posiciones hacia la derecha");
      System.out.println("10. Rotar array n posiciones hacia la izquierda");
      System.out.println("Elige el ejercicio que quieres probar.");
      System.out.println("Introduce 0 para salir.");
      pruebas = Integer.parseInt(s.nextLine());

      switch (pruebas) {
        case 0:
          System.out.println("\nHas salido correctamente.");
          break;
        case 1:
          System.out.println("HAS ELEGIDO MOSTRAR UN ARRAY\n");

          int[] array = ManejoArrays.generaArrayInt(20, 0, 100);

          ManejoArrays.muestraArrayInt(array);

          break;
        case 2:
          System.out.println("HAS ELEGIDO GENERAR UN ARRAY\n");
          System.out.println("Aquí lo tienes: ");

          int[] array2 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array2);

          break;
        case 3:
          System.out.println("HAS ELEGIDO SACAR EL VALOR MÍNIMO DE UN ARRAY\n");

          int[] array3 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array3);
          System.out.println("Mínimo: " + ManejoArrays.minimoArrayInt(array3));

          break;
        case 4:
          System.out.println("HAS ELEGIDO SACAR EL VALOR MÁXIMO DE UN ARRAY\n");

          int[] array4 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array4);
          System.out.println("Máximo: " + ManejoArrays.maximoArrayInt(array4));

          break;
        case 5:
          System.out.println("HAS ELEGIDO HACER LA MEDIA DE UN ARRAY\n");

          int[] array5 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array5);
          System.out.println("Media: " + ManejoArrays.mediaArrayInt(array5));

          break;
        case 6:
          System.out.println("HAS ELEGIDO COMPROBAR SI UN NÚMERO ESTÁ DENRO DE UN ARRAY\n");

          int[] array6 = ManejoArrays.generaArrayInt(20, 0, 100);

          System.out.print("Introduce un número entero, para comprobar si está dentro del array: ");
          int numDentro = Integer.parseInt(s.nextLine());

          if (ManejoArrays.estaEnArrayInt(array6, numDentro)) {
            System.out.println("El " + numDentro + " está en el array.");
          } else {
            System.out.println("El " + numDentro + " no está en el array.");
          }

          ManejoArrays.muestraArrayInt(array6);

          break;
        case 7:
          System.out.println("HAS ELEGIDO SABER EN QUÉ POSICIÓN DEL ARRAY ESTÁ EL NÚMERO");
          int[] array7 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array7);

          System.out.print("Introduce un número del array que estás viendo y te diré cuál es su posición: ");
          int posicionNum = Integer.parseInt(s.nextLine());

          System.out.println("El " + posicionNum + " está en la posición " + ManejoArrays.posicionEnArray(array7, posicionNum));

          break;
        case 8:
          System.out.println("HAS ELEGIDO VOLTEAR UN ARRAY");
          System.out.print("Array original: ");
          int[] array8 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array8);
          System.out.print("Array volteado: ");
          ManejoArrays.muestraArrayInt(ManejoArrays.volteaArrayInt(array8));

          break;
        case 9:
          System.out.println("HAS ELEGIDO ROTAR UN ARRAY HACIA LA DERECHA");
          System.out.print("Array original: ");
          int[] array9 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array9);
          System.out.print("Introduce el número de posiciones que quieres rotar: ");
          int posicionesARotarDer = Integer.parseInt(s.nextLine());

          ManejoArrays.muestraArrayInt(ManejoArrays.rotaDerechaArrayInt(array9, posicionesARotarDer));

          break;
        case 10:
          System.out.println("HAS ELEGIDO ROTAR UN ARRAY HACIA LA IZQUIERDA");
          System.out.print("Array original: ");
          int[] array10 = ManejoArrays.generaArrayInt(20, 0, 100);
          ManejoArrays.muestraArrayInt(array10);
          System.out.print("Introduce el número de posiciones que quieres rotar: ");
          int posicionesARotarIz = Integer.parseInt(s.nextLine());

          ManejoArrays.muestraArrayInt(ManejoArrays.rotaIzquierdaArrayInt(array10, posicionesARotarIz));

          break;

        default:
          System.out.println("El ejercicio que has elegido no es correcto.");
      }

    } while (pruebas != 0);
    
  }

}
