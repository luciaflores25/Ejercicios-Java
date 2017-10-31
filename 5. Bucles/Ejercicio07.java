/**
 * Programación
 * Tema 5 Bucles
 * 30 de octubre de 2017
 * Ejercicio 7
 * 
 *    Realiza el control de acceso a una caja fuerte. La combinación
 *    será un número de 4 cifras. El programa nos pedirá la combinación
 *    para abrirla. Si no acertamos, se nos mostrará el mensaje
 *    “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 *    “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 *     oportunidades para abrir la caja fuerte.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int intentos = 0;
    int clave;
    do {
      System.out.println("Introduce la clave: ");
      clave = Integer.parseInt(s.nextLine());
      
      if (clave != 1234){
        System.out.println("Lo siento, esa no es la combinación");
        intentos++;
      }else if (clave==1234) {
        System.out.println("La caja se ha abierto satisfactoriamente");
        intentos=4;
      }
      
    } while(intentos < 4);
  }
}
