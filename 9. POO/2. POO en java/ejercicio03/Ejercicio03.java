package ejercicio03;
/**
 *
 * @author Lucía Flores 
 * 
 * Programación 
 * Tema 9 POO 
 * Ejercicio 3
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 */
public class Ejercicio03 {

  public static void main(String[] args) {

    //Pruebas de los Gatos
    
    Gato marie = new Gato("Marie");
    marie.setSexo("hembra");
    Gato garfield = new Gato("Garfield");
    garfield.setSexo("macho");
    
    System.out.println("Hora de amamantar");
    marie.amamanta(garfield);

    /*Gato isidoro = new Gato("Isidoro");
    isidoro.setSexo("macho");

    System.out.print("Isidoro está maullando: ");
    isidoro.maulla();

    Gato sofia = new Gato("Sofía");
    System.out.print("\nSofía está ronroneando: ");
    sofia.ronronea();*/
    
    
    
    
  }

}
