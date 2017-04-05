/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 9 números aleatorios
 * Programación
 */
  
public class Ejercicio09 {

  public static void main(String[] args){

    System.out.println("Este programa generará números pares aleatorios entre 0 y 100 y parará cuando salga el 24\n");

    int numero;
    int contador = 0;
    
    do {
      numero = (int)(Math.random() * 101 + 0);
      
      if (numero % 2 == 0) {
        System.out.print(numero + " ");
        contador++;
      }
      
    } while (numero != 24);
    
    System.out.println("\n\nSe han generado " + contador + " números.");
  }
}
