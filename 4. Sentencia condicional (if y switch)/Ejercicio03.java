/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 3
 * 17 de octubre de 2017
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
   nombre del día de la semana.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un día de la semana y se mostrará ");
    System.out.print("qe asignatura toca a primera hora: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    
    switch (dia) {
      case 1:
        diaDeLaSemana = "Lunes";
        break;
      case 2:
        diaDeLaSemana = "Martes";
        break;
      case 3:
        diaDeLaSemana = "Miércoles";
        break;
      case 4:
        diaDeLaSemana = "Jueves";
        break;
      case 5:
        diaDeLaSemana = "Viernes";
        break;
      case 6:
        diaDeLaSemana = "Sábado";
        break;
      case 7:
        diaDeLaSemana = "Domingo";
        break;
      default:
        diaDeLaSemana = "un día que no existe";
    }
      System.out.println("Día " + dia + " es " + diaDeLaSemana);
  }
}
