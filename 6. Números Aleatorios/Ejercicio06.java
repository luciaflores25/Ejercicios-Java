/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 6
 * 
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario
      debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
      fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
      es menor o mayor que el número secreto.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Hello, voy a pensar un número y tienes que intentar adivinarlo, ");
    System.out.println("tienes 5 oportunidades");
    System.out.println("Introduce un número (0-100): ");
    System.out.println();
    
    int numeroPensado = (int)(Math.random()*101);
    int oportunidades = 5;
    int numeroIntroducido;
    
    while (oportunidades > 0){
      numeroIntroducido = Integer.parseInt(s.nextLine());
      if (numeroIntroducido < numeroPensado){
        System.out.println("El número que he pensado es mayor");
        oportunidades--;
        System.out.println("Te quedan " + oportunidades + " oportunidades");
      }
      if (numeroIntroducido > numeroPensado){
        System.out.println("El número que he pensado es menor");
        oportunidades--;
        System.out.println("Te quedan " + oportunidades + " oportunidades");
      }
      if (numeroIntroducido == numeroPensado){
        System.out.println("Correcto!! Ese es el número que estaba pensando");
        oportunidades = 0;
      }
      if(oportunidades == 0){
        System.out.println();
        System.out.println();
        System.out.println("El número que estaba pensando es el " + numeroPensado);
      }
    }
  }
}
