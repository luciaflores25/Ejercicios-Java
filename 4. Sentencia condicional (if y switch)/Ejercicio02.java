/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 2
 * 17 de octubre de 2017
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego
   buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
   tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
   cuenta las horas, los minutos no se deben introducir por teclado.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos días!");
    }
    else if ((hora > 12) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
    else if (((hora > 20) && (hora <= 23)) || ((hora >= 0) && (hora < 6))) {
      System.out.println("¡Buenas noches!");
    }
    else {
      System.out.println("La hora introducida no existe");
    }
  }
}
