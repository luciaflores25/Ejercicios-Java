/**
 * Programación
 * Examen 1 DAW Primer Trimestre
 * 14 de noviembre de 2017
 * Ejercicio 1
 * 
 * 1. La compañía automovilística Ñesla nos ha encargado un configurador para 
      calcular el precio de su coche eléctrico. Los dos modelos que tiene a la 
      venta son el Ñesla Modelo 5 y el Ñesla Modelo 8, que tienen un precio base
      de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
      con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir
      con 80 kWh o con 120 kWh. En todos los casos, cada kWh de batería se paga 
      a 125 €. El Modelo 8 (solo este modelo) se puede encargar con el paquete 
      de conducción autónoma, que cuesta 1800 €. Todos los coches eléctricos 
      cuentan con una subvención del gobierno del 5% del precio final del 
      vehículo. No hay que considerar el IVA, ya está incluido en todas las tarifas.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("COMPAÑIA AUTOMOVILISTICA ÑESLA (Coches eléctricos)");
    System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
    String modeloCoche = (s.nextLine().toLowerCase()); 
    
    System.out.println();
    System.out.println();
    
    double modelo5 = 0.0;
    double modelo8 = 0.0; 
    String bateriaModeloCinco = "";
    String bateriaModeloOcho = "";
    String paqueteConduccion = "";
    double bateriaModeloCincoA = 0.0;
    double bateriaModeloCincoB = 0.0;
    double bateriaModeloOchoA = 0.0;
    double bateriaModeloOchoB = 0.0;
    double paqueteConduccionPrecio = 0.0;
    double subvencion = 0.0;
    double precioTotal = 0.0;
    
    if(modeloCoche.equals("a")){
      System.out.print("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
      bateriaModeloCinco = (s.nextLine());
    }
    if(modeloCoche.equals("b")){
      System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
      bateriaModeloOcho = (s.nextLine());
    }
    if(modeloCoche.equals("b")){
      System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
      paqueteConduccion = (s.nextLine());
    }
    if(bateriaModeloCinco.equals("a")){
        modelo5 =30000.0;
        bateriaModeloCincoA = 50.0 * 125.0;
        System.out.println("Ñesla Modelo 5");
        System.out.println("Precio Base........ 30,000.00 euros");
        System.out.println("Batería de 50 kWh........ " + bateriaModeloCincoA + " euros" );
      }
    if(bateriaModeloCinco.equals("b")){
        modelo5 =30000.0;
        bateriaModeloCincoB = 70.0 * 125.0;
        System.out.println("Ñesla Modelo 5");
        System.out.println("Precio Base........ 30,000.00 euros");
        System.out.println("Batería de 70 kWh........ " + bateriaModeloCincoB + " euros" );
      }
    if(bateriaModeloOcho.equals("a")){
        modelo5 =36000.0;
        bateriaModeloOchoA = 80.0 * 125.0;
        System.out.println("Ñesla Modelo 8");
        System.out.println("Precio Base........ 36,000.00 euros");
        System.out.println("Batería de 80 kWh........ " + bateriaModeloOchoA + " euros" );
      }
    if(bateriaModeloOcho.equals("b")){
        modelo5 =36000.0;
        bateriaModeloOchoB = 120.0 * 125.0; //En el examen me he equivocado en el nombre de la variable 
        System.out.println("Ñesla Modelo 8");//he puesto bateriaModeloOchoA en lugar de bateriaModeloOchoB
        System.out.println("Precio Base........ 36,000.00 euros");
        System.out.println("Batería de 120 kWh........ " + bateriaModeloOchoB + " euros" );
      }
    if(paqueteConduccion.equals("s")){
        paqueteConduccionPrecio = 1800.0;
        System.out.println("Con conducción aut. ...... 1,800.00 euros");
      }
    if(paqueteConduccion.equals("n")){
        paqueteConduccionPrecio = 0.0;
        System.out.println("Sin conducción aut. ...... 0.00 euros");
      }
    
    precioTotal = modelo5 + modelo8 + bateriaModeloCincoA 
                        + bateriaModeloCincoB + bateriaModeloOchoA
                        + bateriaModeloOchoB + paqueteConduccionPrecio;
    
    subvencion = precioTotal * (0.05);
    
    precioTotal = precioTotal - subvencion;
  
    System.out.printf("\nSubvención Estatal........ -%.2f euros",subvencion);
    System.out.printf("\nTotal................... %.2f euros",precioTotal);
  }
}
