/**
 * Programación
 * Tema 7 Arrays
 * 5 de diciembre de 2017
 * Ejercicio 8
 * 
 * 8  Realiza un programa que pida la temperatura media que ha hecho en cada mes
      de un determinado año y que muestre a continuación un diagrama de barras
      horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
      de asteriscos o cualquier otro carácter.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] meses = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    int[] temperaturas = new int[12];
    
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
      temperaturas[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 12; i++) {
      System.out.printf("%10s ", meses[i]);
      for (int j = 0; j < temperaturas[i]; j++) {
        System.out.print("*");
      }
      System.out.println(" " + temperaturas[i] + "ºC ");
    }
   
    
  }
}
