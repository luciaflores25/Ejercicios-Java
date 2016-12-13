/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class Array02{

  public static void main(String[] args){
    
    int[] n; // se define n como un array de enteros
    n = new int[4]; // se reserva espacio para 4 enteros
            
    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;
    // definición del array y reserva de memoria en la misma línea
    int[] x = new int[5];
                
    x[0] = 8;
    x[1] = 33;
    x[2] = 200;
    x[3] = 150;
    x[4] = 11;
    
    System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
    System.out.print("Introduzca un número del 0 al 4: ");
    
    int indice = Integer.parseInt(System.console().readLine());
    
    System.out.print("El elemento que se encuentra en la posición " + indice);
    System.out.println(" es el " + x[indice]);
  }
}
