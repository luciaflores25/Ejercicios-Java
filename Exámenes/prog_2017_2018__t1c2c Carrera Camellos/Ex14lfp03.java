/**
 * 
 * @author Lucía Flores Padilla
 * 
 * Examen Programación - Turno 2
 * 
 * 14-12-17
 * 
 *  Ejercicio 3
 * 
 *  En ocasiones, en clase, se pide la iniciativa de un alumno voluntario para corregir ejercicios, salir a la
    pizarra, etc. Por vergüenza, por no tener las tareas hechas o por cualquier otro motivo, a veces nadie
    se presta voluntario o bien se ofrecen siempre los mismos. Para evitar esta situación vamos a realizar
    un programa que seleccione un alumno de la clase de forma aleatoria. Para simplificar, se tienen en
    cuenta solamente 6 alumnos. Todos los nombres se almacenan en un array.
    Está terminantemente prohibido utilizar las sentencias if o switch en este ejercicio. Si el programa
    contiene algún if o switch, se puntuará con un 0 aunque el resultado que se muestre sea correcto.
    
    Ejemplo 1:
    Le ha tocado salir a... María Margarita Benítez
    
    Ejemplo 2:
    Le ha tocado salir a... Jorge Alcaraz
 * 
 */
 
import java.util.Scanner;
public class Ex14lfp03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] nombres = {"Adrián Aguilar", "Manuel Alcántara", "Jorge Alcaraz",
       "Joaquín Bello", "María Margarita Benítez", "Francisco Casasola"};
    
      int aleatorio = (int) (Math.random() * 6); //saca un índice aleatorio entre 0 y 5
      System.out.println("Le ha tocado salir a... " + nombres[aleatorio]);
       
  }
}
