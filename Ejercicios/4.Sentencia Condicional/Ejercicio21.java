/* Nombre: Lucía Flores Padilla
 * Fecha: 12 de febrero de 2017
 * Ejercicio 21 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio21 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		double primerExamen, segundoExamen, notaFinal;
		String recuperacion;

    System.out.print("Introduce la nota del primer examen de programación: ");
    primerExamen = s.nextDouble();
    
    System.out.println("Ahora introduce la nota del segundo examen: ");
    segundoExamen = s.nextDouble();
    
    notaFinal = ((primerExamen + segundoExamen)/2);
     
     if (notaFinal >= 5) {
       System.out.println("Tu nota de los 2 exámenes es " + notaFinal);
      } else {
        System.out.println("Introduce ahora si has aprobado la recuperación o no (apto/no apto)");
           recuperacion = System.console().readLine();
           if (recuperacion.equals("apto")) {
           System.out.println("¡Enhorabuena, has aprobado con un 5 sigue así!");
            } else {
              System.out.println("Tu nota es un " + notaFinal + ",¡Esfuerzate más la próxima vez!");
            }
    }
		
	}//Cierra el public static
	
}//Cierra el public class
