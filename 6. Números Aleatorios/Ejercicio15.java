/**
 * Programación
 * Tema 6 Números Aleatorios
 * 24 de noviembre de 2017
 * Ejercicio 15
 * 
 * 15. Realiza un generador de melodía con las siguientes condiciones:
        a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
            sol, la y si.
        b) Una melodía está formada por un número aleatorio de notas mayor o igual
            a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
        c) Cada grupo de 4 notas será un compás y estará separado del siguiente
            compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
            con dos barras.
        d) La última nota de la melodía debe coincidir con la primera.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int notas;
    int compas = (int)(Math.random()*7);
    String notaAleatoria = "";
    String notaFinal = "";
    
    for(int i = 0; i <= compas; i++){
      for(int j = 0; j <= 3; j++){
        notas = (int)(Math.random()*7);
        
        switch(notas) {
          case 0:
            notaAleatoria = String.valueOf(" do "); 
            break;
          case 1:
            notaAleatoria = String.valueOf(" re "); 
            break;
          case 2:
            notaAleatoria = String.valueOf(" mi "); 
            break;
          case 3:
            notaAleatoria = String.valueOf(" fa "); 
            break;
          case 4:
            notaAleatoria = String.valueOf(" sol "); 
            break;
          case 5:
            notaAleatoria = String.valueOf(" la ");  
            break;
          case 6:
            notaAleatoria = String.valueOf(" si ");
            break;
            default:
        }
        
        //Aqui se comprueba cual es la primera nota y se guarda en notaFinal
        
        if((i == 0) && (j == 0)){
          notaFinal = notaAleatoria; 
        }
        
        //En la ultima posición que salga aleatoriamente se imprime notaFinal
        
        if((i == compas) && (j == 3)){
          System.out.print(notaFinal);
          
          //En las demás posiciones se imprime la notaAleatoria
          
        }else{
          System.out.print(notaAleatoria);
        }
      }
      System.out.print("|");
    }
    System.out.print("|");
  }
}
