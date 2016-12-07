/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio09 {

  public static void main(String[] args){
    
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
