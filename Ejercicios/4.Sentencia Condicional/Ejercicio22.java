/* Nombre: Lucía Flores Padilla
 * Fecha: 12 de febrero de 2017
 * Ejercicio 22 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio22 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
	int numeroSemana, horas, minutos, horasTotales, minutosTotales;
	String diaDeLaSemana;
	
	System.out.print("Introduce un día de la semana (lunes a viernes) para calcular cuantos minutos faltan para el fin de semana: ");
    diaDeLaSemana = s.next();
    
    numeroSemana = 0;
    
    switch (diaDeLaSemana) {
      case "lunes":
        numeroSemana = 1;
        break;
        
      case "martes":
        numeroSemana = 2;
        break;
      case "miercoles":
        numeroSemana = 3;
        break;
        
      case "jueves":
        numeroSemana = 4;
        break;
        
      case "viernes":
        numeroSemana = 5;
        break;
        
      default:
         System.out.print("El día introducido no es correcto.");
      }
      
    System.out.println("Introduce la hora y los minutos a continuación");
    
      System.out.print("Aquí la hora: ");
      horas = s.nextInt();
      
      System.out.print("Y aquí los minutos: ");
      minutos = s.nextInt();
      
    
    horasTotales = (4 * 24 * 60) + (15 * 60);
    minutosTotales = (numeroSemana * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (horasTotales - minutosTotales) + " minutos para el fin de semana.");
		
		
	}//Cierra el public static
	
}//Cierra el public class
