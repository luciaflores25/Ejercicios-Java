/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 24
 * 26 de octubre de 2017
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio24 {
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
