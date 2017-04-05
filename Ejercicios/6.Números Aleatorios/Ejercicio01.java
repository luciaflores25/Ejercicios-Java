/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 1 números aleatorios
 * Programación
 */
   

public class Ejercicio01 {

  public static void main(String[] args){

    System.out.println("En este programa se van a tirar 3 dados:\n");
    int dadoUno = (int)(Math.random() * 6 + 1);
    
    int dadoDos = (int)(Math.random() * 6 + 1);
    
    int dadoTres = (int)(Math.random() * 6 + 1);
    
    System.out.println("En el primer dado ha salido: " + dadoUno);
    System.out.println("En el segundo dado ha salido: " + dadoDos);
    System.out.println("En el tercer dado ha salido: " + dadoTres);
    
    System.out.println("\nLa suma de los puntos es: " + (dadoUno + dadoDos + dadoTres));
  }
}
