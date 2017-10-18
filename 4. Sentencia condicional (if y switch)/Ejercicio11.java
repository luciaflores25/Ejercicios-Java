/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 11
 * 18 de octubre de 2017
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
   calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula los segundos que quedan para la medianoche");
    
    System.out.print("Introduce la hora (sin lo minutos):  ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = (minutos * 60) + (hora * 3600);
    int segundosEnUnDia = 86400;
    int totalSegundos = segundosEnUnDia - segundos;
    
    System.out.println("Quedan " + totalSegundos + " segundos para la media noche.");
    
    
    
  }
}
