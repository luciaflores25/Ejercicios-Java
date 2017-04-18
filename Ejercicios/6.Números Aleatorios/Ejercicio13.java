/*@author Lucía Flores Padilla
 * Fecha: 18 de abril de 2017
 * Ejercicio 13 números aleatorios
 * Programación
 */
  
public class Ejercicio13 {

  public static void main(String[] args){
    
    System.out.println("En este programa se tirarán dos dados y no parará hasta que los dados sean iguales\n");
    
    int contador = 1;
    
    boolean iguales = false;
    
    int dadoUno = 0;
    int dadoDos = 0;
    
    while (iguales == false) {
      System.out.println("\nTirada " + contador);
      
      dadoUno = (int)((Math.random() * 6) + 1);
      dadoDos = (int)((Math.random() * 6) + 1);
      
      System.out.println("\nDado 1 = " + dadoUno);
      System.out.println("Dado 2 = " + dadoDos);
      
      if (dadoUno == dadoDos) {
        iguales = true;
      }
      contador++;
    }
  }
}
