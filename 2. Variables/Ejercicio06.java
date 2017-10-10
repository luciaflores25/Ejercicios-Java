/**
 * Programación
 * Tema 2 Variables
 * Ejercicio 6
 * 4 de octubre de 2017
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
   imponible (precio sin IVA). La base imponible estará almacenada en una
   variable
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    double precioSinIva = 1352.64;
    double iva = (double)precioSinIva * 0.21;
    double totalFactura = precioSinIva + iva;
    
    System.out.printf("Precio sin IVA:  %21.2f€\n", precioSinIva);
    System.out.printf("IVA:             %21.2f€\n", iva);
    System.out.println("\033[31m_________________________________________\n");
    System.out.printf("\033[37mEl total de esta factura es %10.2f€", totalFactura);
    
  }
}
