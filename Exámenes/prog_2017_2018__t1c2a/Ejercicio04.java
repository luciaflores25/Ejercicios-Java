/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones Multiplataforma (DAM)
 * 5 de diciembre de 2017
 * Ejercicio 4
 * 
 * 4. El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han
      traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un
      programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en
      posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede
      coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que como
      mínimo serán de 4 unidades.
      
      Ejemplo:
      Por favor, introduzca la altura de la pecera (como mínimo 4): 4
      Ahora introduzca la anchura (como mínimo 4): 7
        * * * * * * *
        *   @     & *
        *      $    *
        * * * * * * *
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa pinta una pecera con un pez");
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());//Objetivo
    System.out.print("\nAhora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(s.nextLine());
    
    int altura = 1;//para controlar la altura actual de la imagen
    int espacios = 1;
    
    int pez = 0;
    int caracola = 0;
    int caballito = 0;
    
    while((pez == caracola) || (caracola == caballito) || (pez == caballito)){
      pez = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
      caracola = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
      caballito = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
    }
    
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
        }else if(espacios == caracola){
          System.out.print("@");
        }else if(espacios == caballito){
          System.out.print("$");
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
