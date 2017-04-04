/* Nombre: Lucía Flores Padilla
 * Fecha: 2 de abril de 2017
 * Ejercicio 45 bucles
 * Programación
 */
public class Ejercicio45{
  public static void main (String[] args) {
    
    System.out.print("Por favor, introduzca un número que sea entero y positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca la posición del dígito que quiere cambiar: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca el nuevo dígito: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda con el dígito nuevo
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));

    // resultado
    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion)) + parteDerecha;
    System.out.print("El número resultante es " + numero);
  }
}
