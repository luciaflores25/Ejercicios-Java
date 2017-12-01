/**
 * Programación
 * Tema 6 Números Aleatorios
 * 1 de diciembre de 2017
 * Ejercicio 20
 * 
 * 20. Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
       agua. La capacidad será indicada por el usuario. La cuba se llenará con una
       cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
       pueda admitir. El ancho de la cuba no varía.
        Ejemplo:
        Por favor, indique la capacidad de la cuba en litros: 3

        *    *
        *====*
        *====*
        ******
        La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vamos a pintar una cuba con una cantidad de agua aleatoria");
    System.out.print("Introduce la capacidad de la cuba: ");
    int capacidadIntroducida = Integer.parseInt(s.nextLine());
    
    int altura = 1;//ascensor
    int agua = (int)(Math.random()*capacidadIntroducida);
    
    int sinAgua = capacidadIntroducida - agua;
    
    System.out.println();
    
    while(altura <= capacidadIntroducida){
      if(agua == 0){
        System.out.println("*    *");
      }else{
        for(int i = 1; i <= sinAgua; i++){
          System.out.println("*    *");
          altura++;
        }
        for(int i = 1; i <= agua; i++){
          System.out.println("*~~~~*");
          altura++;
        }
        
      }
      altura++; 
    }
    System.out.print("******");
    System.out.println("\n");
    System.out.print("La cuba tiene una capacidad de " + capacidadIntroducida);
    System.out.print(" litros y contiene " + agua + " litros de agua.");
  }
}
