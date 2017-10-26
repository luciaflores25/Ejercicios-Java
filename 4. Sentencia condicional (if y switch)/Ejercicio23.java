/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 23
 * 26 de octubre de 2017
 * 
 *     Escribe un programa que calcule el precio final de un producto según su
 *     base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 *     reducido o superreducido) y el código promocional. Los tipos de IVA general,
 *     reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 *     promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *     respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 *     se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
 *     si se muestran los valores correctos, aunque los números no estén tabulados.
 * 
 *     Ejemplo:
 *     Introduzca la base imponible: 25
 *     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 *     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 *     Base imponible        25.00
 *     IVA (10%)              2.50
 *     Precio con IVA        27.50
 *     Cód. promo. (mitad): -13.75
 *     TOTAL                 13.75
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = (System.console().readLine()).toLowerCase();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codPro = (System.console().readLine()).toLowerCase();
    
    int nIva = 0;
    
    switch (tipoIva){
      case "general":
        nIva = 21;
        break;
      case "reducido":
        nIva = 10;
        break;
      case "superreducido":
        nIva = 4;
        break;
      default:
        System.out.println("El tipo de IVA que has introducido es incorrecto.");
    }
    
    double iva = baseImponible * nIva / 100;
    double precioSinDescuento = baseImponible + iva;
    double descuento = 0;
    double total = 0;
    
    switch (codPro){
      case "nopro":
        descuento = precioSinDescuento;
        break;
      case "mitad":
        descuento = (precioSinDescuento / 2);
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = precioSinDescuento *  0.05;
        break;
      default:
        System.out.println("El código promocional que has introducido es incorrecto.");
    }
    total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", nIva, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codPro, descuento);
    System.out.println("-------------------------------");
    System.out.printf("TOTAL                %6.2f", total);
  }
}
