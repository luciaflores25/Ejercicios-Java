/* Nombre: Lucía Flores Padilla
 * Fecha: 22 de marzo de 2017
 * Ejercicio 21 bucles
 * Programación
 */
import java.util.Scanner;
  public class Ejercicio21 {
  public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  
  int numeros = 0;
  int mayorPares = 0;
  int impares = 0;
  int sumaImpares = 0;
  int numeroIntroducido;
  
    do{
      System.out.println("Ve introduciendo números enteros y cuando quieras parar introduce uno negativo: ");
      numeroIntroducido = s.nextInt();

        numeros++;

        if (numeroIntroducido % 2 == 1) {
        impares++;
        sumaImpares += numeroIntroducido;
      } else {
        if (numeroIntroducido > mayorPares) {
          mayorPares = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    double media;

    System.out.println("Se han introducido " + numeros + " numeros.");
    System.out.println("La media de los números impares es " + ((double)sumaImpares / (double)impares));
    System.out.println("El mayor número par es " + mayorPares);

  }//Cierra el public static
  
}//Cierra el public class
