package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores Programación Tema 9 POO Ejercicio 7
 *
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas.
 *
 * La clase Zona con sus atributos y métodos se muestra a continuación:
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;

    while (opcion != 3) {

      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      System.out.println();
      
      switch (opcion) {
        case 1:
          System.out.println("En la zona principal quedan " + principal.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona de compra-venta quedan " + compraVenta.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona VIP quedan " + vip.getEntradasPorVender() + " entradas libres");
          System.out.println("");
          break;

        case 2:
          System.out.print("¿Para qué zona quieres las entradas?\n 1. Principal\n 2. Compra-Venta\n2 3. Vip: ");
          int zonaElegida = Integer.parseInt(s.nextLine());
          System.out.print("¿Cuántas quieres?: ");
          int cantidadEntradas = Integer.parseInt(s.nextLine());
          switch (zonaElegida) {
            case 1:
              principal.vender(cantidadEntradas);
              break;
            case 2:
              compraVenta.vender(cantidadEntradas);
              break;
            case 3:
              vip.vender(cantidadEntradas);
              break;
            default:
          }
        default:
          System.out.println("La opción que has elegido no es correcta");
      }
    }//Cierra el while
  }

}
