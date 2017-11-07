/**
 * Programación
 * Tema 5 Bucles
 * 5 de noviembre de 2017
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
    Scanner s = new Scanner(System.in);
    
    int numeros = 0;
    int contador = 0;
    int suma = 0;
    int pares = numeros / 2;
    int contadorPares = 0;
    int contadorImpares = 0;
    
    System.out.print("Ve introduciendo numeros pulsando intro ");
    System.out.println("cuando quieras parar introduce un numero negativo: ");
    
    while (numeros >= 0){
      numeros = Integer.parseInt(s.nextLine());
      if (pares == 0){
        contadorPares++;
      }else if (pares != 0){
        contadorImpares++;
      }
      contador++;
      suma += numeros;
    }
    int cuentaNumeros = contador -1;
     System.out.println("Se han introducido " + cuentaNumeros + " numeros");
     System.out.println("Se han introducido " + contadorPares + " numeros pares");
     System.out.println("Se han introducido " + contadorImpares + " numeros impares");
  }
}
