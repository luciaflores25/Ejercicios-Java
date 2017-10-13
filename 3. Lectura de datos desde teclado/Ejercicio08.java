/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 8
 * 12 de octubre de 2017
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
   a las horas trabajadas, a razón de 12 euros la hora
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.println("Este programa va a calcular el salario semanal de un empleado...");
    System.out.print("Indique el número de horas que ha trabajado esta semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nLas horas son a 12€/hora ");
    
    int salario = horas * 12;
    
    System.out.printf("número de horas:  %21s horas\n", horas);
    System.out.println("\033[31m______________________________________________\n");
    System.out.printf("\033[37mEl salario semanal es %21s€", salario);

  }
}
