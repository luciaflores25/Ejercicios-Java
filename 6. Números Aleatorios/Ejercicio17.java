/**
 * Programación
 * Tema 6 Números Aleatorios
 * 28 de noviembre de 2017
 * Ejercicio 17
 * 
 * 17. Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
       Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
       serán de 4 unidades. No hay que comprobar que los datos se introducen
       correctamente; podemos suponer que el usuario los introduce bien. Dentro
       de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
       situado en cualquiera de las posiciones que quedan en el hueco que forma el
       rectángulo.
       Ejemplo:
        Por favor, introduzca la altura de la pecera (como mínimo 4): 4
        Ahora introduzca la anchura (como mínimo 4): 7
        * * * * * *
        *         *
        *         *
        *     &   *
        * * * * * *
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa pinta una pecera con un pez");
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());//Objetivo
    System.out.print("\nAhora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(s.nextLine());
    
    int altura = 1;//para controlar la altura actual de la imagen
    int espacios = 1;
    
    int pez = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
    
    for(int i = 1; i <= anchura; i++){
      System.out.print("*");
    }
    altura++;
    System.out.println();
    
    int espaciosInternos = anchura -2;
    while (altura < alturaIntroducida){
      System.out.print("*");
      for(int i = 1; i <= espaciosInternos; i++){
        if(espacios == pez){
          System.out.print("&");
        }else{
          System.out.print(" ");
        }
        espacios++;
      }
      System.out.print("*");
      altura++;
      System.out.println();
    }
    for(int i = 1; i <= anchura; i++){
      System.out.print("*");
    }
  }
}
