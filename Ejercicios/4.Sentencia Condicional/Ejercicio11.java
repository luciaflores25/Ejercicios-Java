/* Nombre: Lucía Flores Padilla
 * Fecha: 6 de febrero de 2017
 * Ejercicio 11 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int hora, minutos, segundos; 
		
		System.out.print("Introduce la hora: (de  a 23)");
		hora = s.nextInt();
    
			if (hora >= 0 && hora <= 23){
    
		System.out.print("Ahora los minutos: (de 0 a 59)");
		minutos = s.nextInt();
      
			if (minutos >= 0 && minutos <= 59){
				
      segundos = 24 * 3600 - (hora * 3600 + minutos * 60);
          
          System.out.println("\nFaltan " + segundos + " segundos para llegar a la medianoche.");
          
        } else {
          System.out.println("\n Los minutos son incorrectos, deben estar entre 0 y 59.");
        }
    } else {
      System.out.println("\n La hora es incorrecta, debe estar entre 0 y 23.");
       }
		
	}//Cierra el public static
	
}//Cierra el public class
