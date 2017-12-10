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
    
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] palabras = new String[8];
    String[] ordenado = new String[8];
    boolean esColor = false;
    int i = 0;
    int j = 0;
    int primerasCeldas = 0;
    int ultimasCeldas = 7;
    
    System.out.println("Introduce 8 palabras pulsando intro: \n");
    
    for(i = 0; i < 8; i++){
      palabras[i] = s.nextLine().toLowerCase();;
      
      for(j = 0; j < colores.length; j++){
        if(palabras[i].equals(colores[j])){
          esColor = true;
        }
      }
      
      if (esColor) {
        ordenado[primerasCeldas] = palabras[i];
        primerasCeldas++;
      } else {
        ordenado[ultimasCeldas] = palabras[i];
        ultimasCeldas--;
      }
      esColor = false;
    }
    
    System.out.print("\n                    Array Introducido\n");
    for(i = 0; i < 8; i++){
      System.out.print(palabras[i] + "   ");
    }
    
    System.out.print("\n\n                 Array de colores primero\n");
    
    for(i = 0; i < 8; i++){
        System.out.print(ordenado[i] + "   ");
    }
  }
}
    /////////////// pq esto no se puede hacer??? /////////////////////
  
    /*for(i = 0; i < 8; i++){
      if(ordenado1[i].equals(" ")){
        
      }else{
        System.out.print(palabras[i] + "   ");
      }
    }*/







