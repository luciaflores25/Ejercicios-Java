/**
 * Programación
 * Tema 5 Bucles
 * 20 de noviembre de 2017
 * Ejercicio 26
 * 
 * 26. Realiza un programa que pida primero un número y a continuación un dígito.
       El programa nos debe dar la posición (o posiciones) contando de izquierda a
       derecha que ocupa ese dígito en el número introducido.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora introduce un dígito del número que has introducido antes: ");
    int digito = Integer.parseInt(s.nextLine());
    
    int nuevoNum = numero;
    int numeroDigitos = 0;
    int volteado = 0;
    int posicion = 1;
    int contador = 1;
    
    while (nuevoNum > 0) {
      volteado = (volteado * 10) + (nuevoNum % 10);
      nuevoNum /= 10;
      numeroDigitos++;
      }
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.println();
        contador ++;
        contador = posicion;
        System.out.print("El digito " + digito + " esta en la posicion " + contador);
        System.out.println(" contando de izquierda a derecha");
      }
      volteado /= 10;
      posicion++;
    }
    System.out.println();
    System.out.println();
    System.out.println("El numero tiene " + numeroDigitos + " digitos");
  }
}
