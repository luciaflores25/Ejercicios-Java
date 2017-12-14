/**
 * 
 * @author Lucía Flores Padilla
 * 
 * Examen Programación - Turno 2
 * 
 * 14-12-17
 * 
 *  Ejercicio 1
 * 
 *  Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
    (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá llevar el mínimo
    a la primera posición del array y el máximo a la última, dejando el resto de valores en las posiciones
    intermedias, en el mismo orden en que aperecieron, llenando los huecos que dejan el máximo y el
    mínimo. Se puede trabajar sobre un solo array o sobre varios, como el alumno estime oportuno. Si el
    máximo y/o el mínimo se repite en el array, da igual cuál de ellos se escoja para colocar el primero o el
    último, siempre que el resultado sea correcto.
    
    Ejemplo:
    Array generado:
    49 22 57 79 3 52 32 46 1 14 10 70 30 45 89 55 63 100 13 97
    
    Array resultado:
    1 49 22 57 79 3 52 32 46 14 10 70 30 45 89 55 63 13 97 100
 * 
 */
 
import java.util.Scanner;
public class Ex14lfp01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[20];
    int[] resultado = new int[20];
    int maximo = 1;
    int minimo = 99999999;
    int indicePrincipio = 0;
    int indiceResultado = 1;
    int indiceFinal = 19;
    
    System.out.println("Array Original");
    for(int i = 0; i < array.length; i++){//lee por teclado los datos del array
      array[i] = (int)(Math.random()*100 + 1);
      System.out.print(array[i] + " ");
      
      if (array[i] > maximo){
        maximo = array[i];
      }
      if (array[i] < minimo){
        minimo = array[i];
      }
    }
    
    System.out.println("\n");
    
    for(int i = 0; i < 20; i++){
      if (array[i] == minimo) {
        resultado[indicePrincipio] = array[i];
        indicePrincipio++;
        
      }else if(array[i] == maximo){
        resultado[indiceFinal] = array[i];
        indiceFinal--;
      }else{
        resultado[indiceResultado] = array[i];
        indiceResultado++;
      }
    }
    
    System.out.println("\nArray resultado");
    for(int i = 0; i < resultado.length; i++){
      System.out.print(resultado[i] + " ");
    }
  }
}
