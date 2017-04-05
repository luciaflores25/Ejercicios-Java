/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 4 números aleatorios
 * Programación
 */
  
public class Ejercicio04 {

  public static void main(String[] args){

    System.out.println("Este programa muestra 201 números aleatorios de 0 a 10 (ambos incluidos)");
    

    for (int i = 1; i <= 20; i++) {
      System.out.print(((int)(Math.random() * 10 + 1)) + " ");
    }
    
  }
}
