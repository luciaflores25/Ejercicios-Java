/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class Ejercicio04 {
  public static void main(String[] args) {
  
    int [] numero = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    
    for (int i = 0; i <= 19; i++) {
      
      numero [i] = (int)(Math.random()*101);
      
      cuadrado [i] = numero[i]*numero[i];
      
      cubo [i] = cuadrado[i]*numero[i];
    }
    
    for (int i = 0; i <= 19; i++) {
      
      System.out.printf("%-4d    %-4d    %-4d  \n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
