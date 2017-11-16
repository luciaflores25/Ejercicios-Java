/**
 * Programación
 * Examen DAM primer trimestre
 * 10 de noviembre de 2017
 * Ejercicio 1
 * 
 * 1. Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
       positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
       primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
       cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class ExamenDamEj01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esPrimo = true;
    int noPrimos = 0;
    int numMax = 1;
    int numMin = 999999999;
    int numero;
    int suma = 0;
    
    System.out.println("introduce números: ");
    
    while(esPrimo){
      numero = Integer.parseInt(s.nextLine());
      for (int i = 2; i < numero; i++){  
        if (numero % i == 0){           //este bucle for SOLO es
          esPrimo = false;              //para comprobar que un número es primo
        }
      }
      if(esPrimo){
        esPrimo = false; //esto hace que si el número ES primo salga del bucle
      }else{
        esPrimo = true;  //Dentro del ELSE se hace todo lo que hay que hacer
        noPrimos++;      //si el número que se ha introducido no es primo
        suma += numero;
        if(numero < numMin){
          numMin = numero;
        }
        if(numero > numMax){
          numMax = numero;
        }
      }
    }//Cierra el while
    System.out.println("Se han introducido " + noPrimos + " numeros no primos");
    System.out.println("El numero maximo introducido es " + numMax);
    System.out.println("El numero minimo introducido es " + numMin);
    System.out.println("La media de los numeros introducidos es " + (suma / noPrimos));
  }
}
