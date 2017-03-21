/* Nombre: Lucía Flores Padilla
 * Fecha: 17 de marzo de 2017
 * Ejercicio 25 bucles
 * Programación
 */
public class Ejercicio25 {
	public static void main (String[] args) {
	
	System.out.print("Introduzca un número entero que tenga mínimo 2 dígitos: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.println("Si le damos la vuelta al número introducido: " + numeroIntroducido + ", aparecerá asi: " + volteado);
	
	}//Cierra el public static
	
}//Cierra el public class
