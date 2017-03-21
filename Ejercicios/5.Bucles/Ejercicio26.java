/* Nombre: Lucía Flores Padilla
 * Fecha: 17 de marzo de 2017
 * Ejercicio 26 bucles
 * Programación
 */
public class Ejercicio26 {
	public static void main (String[] args) {
	
	System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en la posición: ");
    
    // Aquí se volteará el número y se calculará la longitud.
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
        
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    }

    System.out.println();
	
	}//Cierra el public static
	
}//Cierra el public class
