
/**
 * Programación
 * Tema 5 Bucles
 * 9 de noviembre de 2017
 * Ejercicio 21
 * 
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un
       numero negativo y nos diga cuantos números se han introducido, la media de
       los impares y el mayor de los pares. El número negativo sólo se utiliza para
       indicar el final de la introducción de datos pero no se incluye en el cómputo.

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numeros = 0;
    int contador = 0;
    int contadorPares = 0;
    int contadorImpares = 0;
    int suma = 0;
    int mayorPares = 0;
    
    System.out.print("Ve introduciendo numeros pulsando intro ");
    System.out.println("cuando quieras parar introduce un numero negativo: ");
    
    while (numeros >= 0){
      numeros = Integer.parseInt(s.nextLine());
      int pares = numeros % 2;
      if ((pares == 0) && (numeros > 0)){
        
        contadorPares++;
      }
      if ((pares != 0) && (numeros > 0)){
        suma += numeros;
        contadorImpares++;
      }
      if (numeros > mayorPares){
        mayorPares = numeros;
      }
      
      contador++;
    }
    int cuentaNumeros = contador -1;
    int mediaImpares = suma / contadorImpares;
     System.out.println("\nSe han introducido " + cuentaNumeros + " numeros");
     System.out.println("Se han introducido " + contadorPares + " numeros pares");
     System.out.println("Se han introducido " + contadorImpares + " numeros impares\n");
     System.out.println("La media de los impares es " + mediaImpares );
     System.out.println("El mayor de los pares es " + mayorPares );
  }
}
