/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 1
 * 17 de octubre de 2017
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
   asignatura toca a primera hora ese día.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un día de la semana y se mostrará ");
    System.out.print("qe asignatura toca a primera hora: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    
    switch (dia) {
      case 1:
        diaDeLaSemana = "Es lunes y toca Sistemas informáticos";
        break;
      case 2:
        diaDeLaSemana = "Es martes y toca Programación";
        break;
      case 3:
        diaDeLaSemana = "Es miércoles y toca Sistemas informáticos";
        break;
      case 4:
        diaDeLaSemana = "Es jueves y toca Programación";
        break;
      case 5:
        diaDeLaSemana = "Es viernes y toca Programación";
        break;
      default:
        diaDeLaSemana = "El día Introducido no hay clase o no exixte";
    }
      System.out.println("Día " + dia + ": " + diaDeLaSemana);
  }
}
