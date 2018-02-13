package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores Programación Tema 9 POO Ejercicio 2
 *
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 *
 * VEHÍCULOS ========= 1. Anda con la bicicleta 2. Haz el caballito con la
 * bicicleta 3. Anda con el coche 4. Quema rueda con el coche 5. Ver kilometraje
 * de la bicicleta 6. Ver kilometraje del coche 7. Ver kilometraje total 8.
 * Salir Elige una opción (1-8):
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int opcion = 0;

    while (opcion != 8) {
      System.out.println("VEHÍCULO\n========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8):  ");
      opcion = Integer.parseInt(s.nextLine());

      //Objetos
      Bicicleta montana = new Bicicleta("montaña");
      Bicicleta carretera = new Bicicleta("carretera");
      Coche porche = new Coche("Porche");
      Coche descapotable = new Coche("Descapotable");
      Coche ferrari = new Coche("Ferrari");

      switch (opcion) {
        case 1:
          System.out.println("Elige una de las dos bicis que tienes:");
          System.out.println("montain o carretera");
          String eleccion = s.nextLine();

          switch (eleccion) {
            case "montain": {
              System.out.println("¿Cuántos kilometros quieres recorrer con la bici?");
              int km = Integer.parseInt(s.nextLine());
              montana.recorre(km);
              break;
            }
            case "carretera": {
              System.out.println("¿Cuántos kilometros quieres recorrer con la bici?");
              int km = Integer.parseInt(s.nextLine());
              carretera.recorre(km);
              break;
            }
            default:
              System.out.println("Esa bici no te la has comprado.");
              break;
          }

          break;
        case 2:
          montana.hacerCaballito();

          break;
        case 3:
          System.out.println("Aquí está tu garaje, elige uno de tus coches:");
          System.out.println("porche, descapotable, ferrari");
          String eleccion2 = s.nextLine();

          switch (eleccion2) {
            case "porche": {
              System.out.println("¿Cuántos kilometros quieres recorrer con este coche?");
              int km = Integer.parseInt(s.nextLine());
              porche.recorre(km);
              break;
            }
            case "descapotable": {
              System.out.println("¿Cuántos kilometros quieres recorrer con este coche?");
              int km = Integer.parseInt(s.nextLine());
              descapotable.recorre(km);
              break;
            }
            case "ferrari": {
              System.out.println("¿Cuántos kilometros quieres recorrer con este coche?");
              int km = Integer.parseInt(s.nextLine());
              ferrari.recorre(km);
              break;
            }
            default:
              System.out.println("Ese coche no te lo has comprado todavía.");
              break;
          }
          break;
        case 4:
          porche.quemarRueda();
          break;
        case 5:
          System.out.println("El kilómetraje total de todos las bicicletas es "
                  + Bicicleta.getKilometrosRecorridos());

          break;
        case 6:
          System.out.println("El kilómetraje total de todos los coches es "
                  + Coche.getKilometrosRecorridos());

          break;
        case 7:
          System.out.println("El kilómetraje total de todos tus vehículos es "
                  + Vehiculo.getKilometrosTotales());
          break;
        case 8:

          break;
        default:
          System.out.println("¡La opción que has elegido no es correcta!");

      }
    }//Cierra el while

  }

}
