public class Ejercicio2 {
  public static void main(String[] args) {

    System.out.print("Dime una hora de 0-23 ");
    String line = System.console().readLine();
    int hora = Integer.parseInt( line );
    
    if ((hora >= 6) && (hora <= 12)) {
     System.out.println("¡Buenos días!");
    
    
  } if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
      
      
  } if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("¡Buenas noches!");
      
  } if ((hora >24) || (hora < 0)) {
      System.out.println("Esa hora no existe");
    }
  }
}

