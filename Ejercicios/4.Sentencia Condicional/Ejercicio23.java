/* Nombre: Lucía Flores Padilla
 * Fecha: 12 de febrero de 2017
 * Ejercicio 23 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio23 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		double baseImponible, iva, precioSinDescuento, descuento, total;
		int cantidadIVA;
		String tipoIVA, codigoPromocional;
		
	System.out.print("Introduce la base imponible: ");
    baseImponible = s.nextDouble();
    
    System.out.print("Ahora introduce el tipo de IVA (general, reducido o superreducido): ");
    tipoIVA = s.next();
    
    System.out.print("Y el código promocional en el caso de que exista (nopro, mitad, meno5 o 5porc): ");
    codigoPromocional = s.next();
    
    cantidadIVA = 0;
    
    switch(tipoIVA) {
      case "general":
        cantidadIVA = 21;
        break;
        
      case "reducido":
        cantidadIVA = 10;
        break;
        
      case "superreducido":
        cantidadIVA = 4;
        break;
        
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    
    iva = baseImponible * cantidadIVA / 100;
    precioSinDescuento = baseImponible + iva;
    
    
    descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad": 
        descuento = precioSinDescuento / 2;
        break;
      case "meno5": 
        descuento = 5;
        break;
      case "5porc": 
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    
    total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible  %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)  %6.2f\n", cantidadIVA, iva);
    System.out.printf("Precio con IVA  %6.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo.  (%5s)  -%6.2f\n", codigoPromocional, descuento);
  System.out.printf("TOTAL  %6.2f", total);
		
	}//Cierra el public static
	
}//Cierra el public class
