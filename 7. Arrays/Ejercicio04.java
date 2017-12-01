/**
 * Programación
 * Tema 7 Arrays
 * 1 de diciembre de 2017
 * Ejercicio 4
 * 
 * 4. Define tres arrays de 20 números enteros cada una, con nombres numero ,
      cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
      array cuadrado se deben almacenar los cuadrados de los valores que hay en el
      array numero . En el array cubo se deben almacenar los cubos de los valores que
      hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
      en tres columnas.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int aleatorio = 0;
    
    for(int i = 0; i <= 19; i++){
      aleatorio = (int)(Math.random()*100 + 1);
      numero[i] = aleatorio;
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
    }
    
    
    
    System.out.println();
    System.out.println("  numero  │   cuadrado  │    cubo");
    System.out.println("-------------------------------------");
    for(int i = 0; i <=19; i++){
      System.out.printf("%6d    │ %7d     │%8d    \n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
