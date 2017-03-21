/* Nombre: Lucía Flores Padilla
 * Fecha: 17 de marzo de 2017
 * Ejercicio 24 bucles
 * Programación
 */
public class Ejercicio24 {
	public static void main (String[] args) {
	
	System.out.println("Este programa pinta una pirámide hecha con números.");
    System.out.println("----------------------------------------------------");
    System.out.print("Introduce la altura de la pirámide:");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // Con esto se introducen los espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // Con esto se introducen los números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      
      System.out.println();
		}
	}//Cierra el public static
	
}//Cierra el public class
