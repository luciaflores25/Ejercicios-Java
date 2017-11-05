/**
 * Programación
 * Tema 5 Bucles
 * 3 de noviembre de 2017
 * Ejercicio 17
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
  y positivo introducido por teclado. Se debe comprobar que el dato introducido
  es correcto (que es un número positivo).

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un número (entero positivo): ");
    System.out.println("Y se sumarán los 100 números siguientes.\n");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int suma = 0;
    int contador = 0;
    
    if (numeroIntroducido>= 0){
      
      for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++){
        suma+=i;
      }
      
    }else {
      System.out.println("El núemro que has introducido es incorrecto.");
    }
    System.out.println("La suma de los 100 números siguientes de " + numeroIntroducido + " es " + suma);
  }
}
