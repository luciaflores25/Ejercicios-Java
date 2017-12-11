/**
 * Programación
 * Tema 7 Arrays
 * 10 de diciembre de 2017
 * Ejercicio 12
 * 
* 12.   Realiza un programa que pida 10 números por teclado y que los almacene en
        un array. A continuación se mostrará el contenido de ese array junto al índice
        (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
        “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
        ambos números están entre 0 y 9. El programa deberá colocar el número de
        la posición inicial en la posición final, rotando el resto de números para que no
        se pierda ninguno. Al final se debe mostrar el array resultante.
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] original = new int[10];
    int[] resultado = new int[10];
    int posicionInicial = 0;
    int posicionFinal = 0;
    boolean datosCorrectos = true;
    
    System.out.println("Introduce 10 números para meterlos en un array: ");
    for(int i = 0; i < original.length; i++){
      original[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("\n\nArray original"); 
    //System.out.printf("%6.d")
    for(int i = 0; i < original.length; i++){
      System.out.print(original[i] + "  ");
    }
    datosCorrectos = false;
    while(!datosCorrectos){
      
      datosCorrectos = true; 
      System.out.println("\n\nPosición Inicial: ");
      posicionInicial = Integer.parseInt(System.console().readLine());
      
      System.out.println("\nPosición final: ");
      posicionFinal = Integer.parseInt(s.nextLine());
      
      if((posicionInicial >= posicionFinal) || (posicionInicial < 0) || (posicionFinal > 10)) {
        System.out.print("\n\nLo siento los datos que has introducido son incorrectos..." );
        System.out.print("\nLa posición inicial debe ser menor que la final");
        System.out.print("\nNo pueden ser valores negativos");
        System.out.print("\nLas posiciones son de (0-9)");
        System.out.print("\n\nVuelve a introducir los valores");
        datosCorrectos = false;
      }
    }//cierra el while
    
    for(int i = 0; i < posicionInicial; i++){
      resultado[i+1] = original[i];
    }
    
    for(int i = posicionFinal+1; i < original.length; i++){
      resultado[i] = original[i-1];
    }
    
    for(int i = posicionInicial+1; i < posicionFinal; i++){
      resultado[i] = original[i];
    }
    
    resultado[0] = original[9];
    
    resultado[posicionFinal] = original[posicionInicial];
    
    System.out.println("\n\nArray final"); 

    for(int i = 0; i < original.length; i++){
      System.out.print(resultado[i] + "  ");
    }
    
  }
}








