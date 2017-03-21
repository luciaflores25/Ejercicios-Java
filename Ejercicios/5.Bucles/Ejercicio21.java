/* Nombre: Lucía Flores Padilla
 * Fecha: 16 de marzo de 2017
 * Ejercicio 21 bucles
 * Programación
 */
public class Ejercicio21 {
	public static void main (String[] args) {
	
	System.out.println("Vamos a introducir varios números mayores o iguales a 0 (para detenerlo se introduce un número negativo");
        
    int numero;
    int numerosIntroducidos = 0;
    int sumaImpares = 0;
    int cantidadImpares = 0;
    int mayorPares = 0;
    
    do {
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      numerosIntroducidos++;
      
      if (numero % 2 == 1) {
        cantidadImpares++;
        sumaImpares += numero;
      } else {
        if (numero > mayorPares) {
          mayorPares = numero;
        }
      }
    } while (numero >= 0);
    
    double mediaImpares;
    
    System.out.println("Números introducidos: " + (numerosIntroducidos - 1));
    System.out.println("Media de los impares: " + ((double)sumaImpares / (double)cantidadImpares));
    System.out.println("Número par mayor: " + mayorPares);
		
	}//Cierra el public static
	
}//Cierra el public class
