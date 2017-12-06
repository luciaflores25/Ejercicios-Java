/**
 * Programación
 * Tema 7 Arrays
 * 6 de diciembre de 2017
 * Ejercicio 14
 * 
* 14.  Escribe un programa que pida 8 palabras y las almacene en un array. A
       continuación, las palabras correspondientes a colores se deben almacenar al
       comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
       auxiliares como quieras. Los colores que conoce el programa deben estar en
       otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
       blanco y morado.
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] colores = new String[9];
    String[] palabras = new String[8];
    String[] ordenado = new String[8];
    
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";
    
    System.out.println("Introduce 8 palabras pulsando intro: \n");
    
    for(int i = 0; i < 8; i++){
      palabras[i] = s.nextLine();
    }
  }
}
