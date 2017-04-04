/* Nombre: Lucía Flores Padilla
 * Fecha: 30 de marzo de 2017
 * Ejercicio 43 bucles
 * Programación
 */
public class Ejercicio43{
  public static void main (String[] args) {
    
    System.out.print("Introduce un número que sea entero y positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Y ahora introduce la posición a partir de la cual quieres que se parta el número: ");
    long posicion = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    

    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    System.out.print("Los números partidos son el " + parteIzquierda + " y  el " + parteDerecha);
  }
}
