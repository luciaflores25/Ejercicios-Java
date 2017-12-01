/**
 * Programación
 * Tema 6 Números Aleatorios
 * 1 de diciembre de 2017
 * Ejercicio 21
 * 
 * 21. Realiza un programa que genere una secuencia de cinco monedas de curso
       legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
       5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
       posiciones posibles son cara y cruz.

        Ejemplo:
        2 céntimos - cara
        20 céntimos - cruz
        50 céntimos - cruz
        1 euro - cruz
        2 euros - cara
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int posicion;
    int moneda;
    String caraOcruz = "";
    String cantidad = "";
    
    for(int i = 1; i <= 5; i++){
      posicion = (int)(Math.random()*2);
      
      switch(posicion) {
        case 0:
          caraOcruz = "Cara";
          break;
        case 1:
          caraOcruz = ("Cruz");
          break;
          default:
      }
      
      moneda = (int)(Math.random()*8);
      
      switch(moneda) {
        case 0:
          cantidad = "1 céntimo";
          break;
        case 1:
          cantidad = ("2 céntimos");
          break;
        case 2:
          cantidad = "5 céntimos";
          break;
        case 3:
          cantidad = ("10 céntimos");
          break;
        case 4:
          cantidad = "20 céntimos";
          break;
        case 5:
          cantidad = ("50 céntimos");
          break;
        case 6:
          cantidad = "1 euro";
          break;
        case 7:
          cantidad = ("2 euros");
          break;
          default:
      }
      
      System.out.println(cantidad + " - " + caraOcruz);
    }
  }
}
