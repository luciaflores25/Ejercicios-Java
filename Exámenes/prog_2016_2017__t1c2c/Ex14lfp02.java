/**
 * Programación
 * Segundo exámen DAW Primer Trimestre Año 2016-2017
 * 7 de diciembre de 2017
 * Ejercicio 2
 * 
 * 2. Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
      330 y el 550 ambos incluidos.
      
      Ejemplo:
      517 440 385 374 550 517 484 462 363 418
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int i = 1;
    int aleatorio;
    
    do{
      aleatorio = (int)(Math.random()*220 + 330 );
      
      if(aleatorio % 11 == 0){
        System.out.print(aleatorio + " ");
        i++;
      }
    }while(i <= 10);
  }
}
