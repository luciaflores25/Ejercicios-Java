/* Nombre: Lucía Flores Padilla
 * Fecha: 2 de abril de 2017
 * Ejercicio 44 bucles
 * Programación
 */
public class Ejercicio44{
  public static void main (String[] args) {
    
    System.out.print("Introduzca un número que sea entero y positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca la posición donde quiere insertar el nuevo dígito: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca el dígito que quiere insertar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
      long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
  
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion + 1)) + parteDerecha;
    System.out.print("El número resultante es " + numero);
  }
}
