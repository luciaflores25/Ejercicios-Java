/**
 * Programación
 * Tema 1 Salida de datos por  pantalla
 * Ejercicio 3
 * 29 de septiembre de 2017
 * 
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto
  a su correspondiente traducción al castellano. Las palabras deben estar
  distribuidas en dos columnas y alineadas a la izquierda.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.printf("%-10s  |  %-12s  | \n", "Español", "English");
    System.out.println("------------------------------");
    System.out.printf("%-10s  |  %-12s  | \n", "Coche", "Car");
    System.out.printf("%-10s  |  %-12s  | \n", "Moto", "Motorbike");
    System.out.printf("%-10s  |  %-12s  | \n", "Manzana", "Apple");
    System.out.printf("%-10s  |  %-12s  | \n", "Plátano", "Banana");
    System.out.printf("%-10s  |  %-12s  | \n", "Asignatura", "Subject");
    System.out.printf("%-10s  |  %-12s  | \n", "Zapatos", "Shoes");
    System.out.printf("%-10s  |  %-12s  | \n", "Baloncesto", "Basket");
    System.out.printf("%-10s  |  %-12s  | \n", "Pelota", "Ball");
    System.out.printf("%-10s  |  %-12s  | \n", "Agua", "Water");

  }
}
