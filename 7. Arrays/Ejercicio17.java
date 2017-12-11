/**
 * Programación
 * Tema 7 Arrays
 * 11 de diciembre de 2017
 * Ejercicio 17
 * 
 * 17.  Escribe un programa que muestre por pantalla un array de 10 números enteros
        generados al azar entre 0 y 100. A continuación, el programa debe pedir
        un número al usuario. Se debe comprobar que el número introducido por
        teclado se encuentra dentro del array, en caso contrario se mostrará un
        mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
        introduzca uno correctamente. A continuación, el programa rotará el array
        hacia la derecha las veces que haga falta hasta que el número introducido
        quede situado en la posición 0 del array. Por último, se mostrará el array rotado
        por pantalla.
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[10];
    int num = 0;
    int i = 0;
    boolean numEstaDentroDelArray = false;
    int posicionNum = 0;
    
    System.out.print("\nÍndice:  ");
    for (i = 0; i < array.length; i++) {
      System.out.printf("| %3d", i);
    }
    System.out.print("\n-----------------------------------------------------------");
    System.out.print("\nValor:   ");
    for(i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*101);
      System.out.printf("| %3d", array[i]);
    }
    
    while (!numEstaDentroDelArray){
      
      System.out.print("\n\nIntroduzca uno de los números del array: ");
      num = Integer.parseInt(s.nextLine());
      
      for (i = 0; i < array.length; i++){
        if (array[i] == num) {
          posicionNum = i;
          numEstaDentroDelArray = true;
        }
      }
      
      if (!numEstaDentroDelArray) {
        System.out.println("\nEse número no se encuentra en el array");
      }
    } //Cierra el while
    
    //Aqui se rota el array hasta que el numero introducido esté en la posición 0
    while (num != array[0]) {
      int aux = array[9];
      
      for (i = 9; i > 0; i--) {
        array[i] = array[i - 1]; 
      }
      array[0] = aux; 
    }
    
    //Aquí se muestra el array resultado
    System.out.print("\nÍndice:  ");
    for (i = 0; i < array.length; i++) {
      System.out.printf("| %-3d", i);
    }
    System.out.print("\n-----------------------------------------------------------");
    System.out.print("\nValor:   ");
    for(i = 0; i < array.length; i++){
      System.out.printf("| %-3d", array[i]);
    }
  }
}
