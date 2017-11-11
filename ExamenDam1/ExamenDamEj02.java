/**
 * Programación
 * Examen DAM primer trimestre
 * 11 de noviembre de 2017
 * Ejercicio 2
 * 
 * 2. La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
      ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
      bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
      precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
      IVA ya está incluido en todas las tarifas.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class ExamenDamEj02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.println("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(s.nextLine());
    
    System.out.println("¿Quiere escudo bordado? (si/no): ");
    String escudo = s.nextLine();
    
    double precioBase = (altura * anchura) / 100;
    double gastosEnvio = 3.25;
    double precioEscudo = 2.50;
    
    System.out.println();
    System.out.println();
    
    System.out.println("Gracias. Aqui tiene el desglose de su compra.");
    System.out.print("Bandera de " + (altura * anchura) + "cm cuadrados: ");
    System.out.println(precioBase + " euros");
    
    if (escudo.equals("si")){
      System.out.println("Con escudo: 2.50 euros");
    }else{
      System.out.println("Sin escudo: 0.00 euros");
      precioEscudo = 0.0;
    }
    System.out.println("Gastos de envío: " + gastosEnvio);
    System.out.println("Total: " + (precioBase + gastosEnvio + precioEscudo));
  }
}
