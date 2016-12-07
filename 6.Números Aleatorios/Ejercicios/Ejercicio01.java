/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio01 {

  public static void main(String[] args){
    
    int primeraTirada = (int)(Math.random() * 6 + 1);
    
    int segundaTirada = (int)(Math.random() * 6 + 1);
    
    int terceraTirada = (int)(Math.random() * 6 + 1);
    
    System.out.println("Primera tirada: " + primeraTirada);
    System.out.println("Segunda tirada: " + segundaTirada);
    System.out.println("Tercera tirada: " + terceraTirada);
    
    System.out.println("\nSuma de los puntos: " + (primeraTirada + segundaTirada + terceraTirada));
  }
}
