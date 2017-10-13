/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 7
 * 12 de octubre de 2017
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
   imponible
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.println("Este programa va a calcular el total de una factura...");
    System.out.print("Introduce la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduce el iva: ");
    int iva = Integer.parseInt(System.console().readLine());
    
    double totalIva = ((double)baseImponible * (double)iva) / 100;
    double totalFactura = baseImponible + totalIva;
    
    System.out.printf("\nbase imponible:  %21.2f€\n", baseImponible);
    System.out.printf("IVA:             %21.2f€\n", totalIva);
    System.out.println("\033[31m_________________________________________\n");
    System.out.printf("\033[37mEl total de esta factura es %10.2f€", totalFactura);

  }
}
