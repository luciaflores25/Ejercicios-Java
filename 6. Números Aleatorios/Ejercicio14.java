/**
 * Programación
 * Tema 6 Números Aleatorios
 * 23 de noviembre de 2017
 * Ejercicio 13
 * 
 * 14. Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
       El programa intentará adivinar el número que estás pensando - un número
       entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
       programa debe preguntar si el número que estás pensando es mayor o menor
       que el que te acaba de decir.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean acertado = false;
    int oportunidades = 5;
    int numeroMayor = 100;
    int numeroMenor = 0;//número por el que se empieza
    String siOno = "";
    String mayorOmenor = "";
    
System.out.println("Piensa un número entre (0-100) que voy a intentar adivinarlo");
    
    while(!acertado){
    int numeroAleatorio = (int)(Math.random()*(numeroMayor - numeroMenor)) + numeroMenor;
    System.out.println("El número es ¿"+numeroAleatorio+"?");
    siOno = (s.nextLine());
      
      if(siOno.equals("no")){
        System.out.println("¿Es mayor o menor?");
        mayorOmenor = (s.nextLine());
      
        if(mayorOmenor.equals("mayor")){
          numeroMenor = numeroAleatorio + 1;
          oportunidades--;
        }else if (mayorOmenor.equals("menor")){
          numeroMayor = numeroAleatorio - 1;
          oportunidades--;
        }
        if(oportunidades == 0){
          System.out.println("Me quedé sin oportunidades!");
          break;
        }
      }
      if(siOno.equals("si")){
        System.out.println("JEJE ¡lo he acertado!");
        break;
      }
    }
  }
}
