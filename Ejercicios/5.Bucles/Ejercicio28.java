/* Nombre: Lucía Flores Padilla
 * Fecha: 20 de marzo de 2017
 * Ejercicio 28 bucles
 * Programación
 */
public class Ejercicio28 {
  public static void main (String[] args) {
    
    int numeroIntroducido;
    
    do {
      System.out.print("Introduzca un número entero mayor o igual que 0: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("El factorial de " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println("El factorial de " + numeroIntroducido + " es " + factorial);
		}
	}//Cierra el public static
	
}//Cierra el public class
