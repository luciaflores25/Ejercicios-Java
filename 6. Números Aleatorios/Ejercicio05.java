/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 5
 * 
 * 5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
      separados por espacios. Muestra también el máximo, el mínimo y la media
      de esos números.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra al azar 50 números enteros entre 100 y 199 ");
    System.out.println();
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int numero = 0;
    
    
    for(int i = 1; i <= 50; i++){
      numero = (int)(Math.random()*100 + 100);
      System.out.print(numero + " ");
      suma += numero;
      
      if (numero > maximo){
        maximo = numero;
      }
      if(numero < minimo){
        minimo = numero;
      }
    }//cierra el for
    
    System.out.println();
    System.out.println();
    System.out.println("El número máximo que ha salido es " + maximo);
    System.out.println("El número mínimo que ha salido es " + minimo);
    System.out.println("La media de todos los números es " + (suma /50));
  }
}
