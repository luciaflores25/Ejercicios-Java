public class Ejercicio6 {
  public static void main(String[] args) {
    
    double g = 9.81;

    System.out.println("Tiempo que tarda un objeto en caer.");
    System.out.print("Introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}

  
