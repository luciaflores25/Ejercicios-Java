/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 10
 * 
 * 10. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
       El carácter con el que se pinta cada línea se elige de forma aleatoria
       entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
       aleatoria entre 1 y 40 caracteres.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int caracter;
    String caracterSacado = "";
    for(int fila = 1; fila <= 10; fila++){
      int linea = (int)(Math.random()*40 + 1);
      for(int j = 1; j <= linea; j++){
        caracter = (int)(Math.random()*6);
        switch(caracter) {
          case 0:
            caracterSacado = String.valueOf("*");
            break;
          case 1:
            caracterSacado = String.valueOf("-");
            break;
          case 2:
            caracterSacado = String.valueOf("="); 
            break;
          case 3:
            caracterSacado = String.valueOf("."); 
            break;
          case 4:
            caracterSacado = String.valueOf("|"); 
            break;
          case 5:
            caracterSacado = String.valueOf("@"); 
            break;
            default:
        }
        System.out.print(caracterSacado);
      }
      System.out.println();
    }
  }
}
