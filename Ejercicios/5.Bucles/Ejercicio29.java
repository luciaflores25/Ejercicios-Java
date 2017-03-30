/* Nombre: Lucía Flores Padilla
 * Fecha: 20 de marzo de 2017
 * Ejercicio 29 bucles
 * Programación
 */
public class Ejercicio29 {
  public static void main (String[] args) {
    
    System.out.print("Introduzca un número entero positivo que se grande : ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número pero ahora pequeño: ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");


    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
        
      }
    }
  }//Cierra el public static
  
}//Cierra el public class
