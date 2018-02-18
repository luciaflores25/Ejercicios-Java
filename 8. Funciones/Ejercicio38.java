package ejercicios35a40;

import java.util.Scanner;
import matematicas.ManejoMatematicas;
import matematicas.ManejoArrays;

/**
 *
 * * @author Lucía Flores Programación Tema 8 Funciones
 *
 * Ejercicio 38 
 * 
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que
    haga lo que se especifica en los comentarios (puedes incluirla en tu propia
    biblioteca de rutinas):
    public int[] filtraCapicuas(int x[]) 
    
                      // Devuelve un array con todos los números
                      // capicúa que se encuentren en otro array
                      // que se pasa como parámetro.
                      // Obviamente el tamaño del array que se
                      // devuelve será menor o igual al que se
                      // pasa como parámetro.
    
    Utiliza esta función en un programa para comprobar que funcionan bien. Para
    que el ejercicio resulte más fácil, las repeticiones de números capicúa se
    conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
    array devuelto también estará repetido 3 veces. Si no existe ningún número
    capicúa en x, se devuelve un array con el número -1 como único elemento.
* 
* 18 febrero 2018
 */
public class Ejercicio38 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Array original: ");
    int[] original = ManejoArrays.generaArrayInt(20, 0, 100);
    ManejoArrays.muestraArrayInt(original);
    
    int[] soloCapicua = ManejoMatematicas.filtraCapicua(original);
    System.out.println("Array solo capicua: ");
    ManejoArrays.muestraArrayInt(soloCapicua);
    
  }
  
}
