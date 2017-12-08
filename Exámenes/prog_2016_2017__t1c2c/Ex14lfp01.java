/**
 * Programación
 * Segundo exámen DAW Primer Trimestre Año 2016-2017
 * 7 de diciembre de 2017
 * Ejercicio 1
 * 
 * 1. Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
      guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
      GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
      como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
      distinguir bien. Por cada 5 números mostrados hay un salto de línea.
      
      Ejemplo:
      
      Por favor, introduzca sus 5 números favoritos:
      13
      23
      55
      4
      5
      
      1 no me gusta, 2 no me gusta, 3 no me gusta, 4 ME GUSTA, 5 ME GUSTA,
      6 no me gusta, 7 no me gusta, 8 no me gusta, 9 no me gusta, 10 no me gusta,
      11 no me gusta, 12 no me gusta, 13 ME GUSTA, 14 no me gusta, 15 no me gusta,
      (...)
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] favoritos = new int[5];
    boolean esFavorito = false;
    
    System.out.println("Por favor, introduzca sus 5 números favoritos: ");
    
    for(int i = 0; i < 5; i++){
      favoritos[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    
    for(int i = 1; i <= 100; i++){
      
      for(int j = 0; j < favoritos.length; j++){
        if  (i == favoritos[j]){
          esFavorito = true;
        }
      }
      if(esFavorito){
        System.out.print(i + " ME GUSTA,");
        esFavorito = false;
      }else{
        System.out.print(i + " no me gusta,");
      }
    }
  }
}
