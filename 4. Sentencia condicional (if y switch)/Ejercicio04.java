/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 4
 * 17 de octubre de 2017
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
   las horas extras. Escribe un programa que calcule el salario semanal de un
   trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
   trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
   euros la hora.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    
      System.out.println("Este programa va a calcular el salario semanal de un empleado...");
      System.out.print("Indique el número de horas que ha trabajado esta semana: ");
      int horas = Integer.parseInt(System.console().readLine());
      
      int salario;
      if (horas <=40){
        salario = horas * 12;
        
        System.out.printf("\nnúmero de horas:  %16s horas\n", horas);
        System.out.printf("horas extras:  %19s horas\n", 0);
        System.out.printf("\nTotal horas extras:  %17s €\n", 0);
        System.out.printf("Salario base:  %23s €\n", salario);
        System.out.println("\033[31m______________________________________________\n");
        System.out.printf("\033[37mEl salario semanal es %16s€", salario);
        
      } else if (horas >=40) {
        
        int extras = (horas - 40);
        int totalExtras = 16 * extras;
        salario = 40 * 12;
        int totalSalario = salario + totalExtras;
        
        System.out.printf("\nnúmero de horas:  %16s horas\n", horas);
        System.out.printf("horas extras:  %19s horas\n", extras);
        System.out.printf("\nTotal horas extras:  %17s €\n", totalExtras);
        System.out.printf("Salario base:  %23s €\n", salario);
        System.out.println("\033[31m______________________________________________\n");
        System.out.printf("\033[37mEl salario semanal es %16s€", totalSalario);
        }
  }
}
