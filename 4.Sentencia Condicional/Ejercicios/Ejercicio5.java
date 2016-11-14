public class Ejercicio5 {
  public static void main(String[] args) {
    
  System.out.println("Resolver una ecuación de primer grado de tipo: ax + b = 0");
    System.out.print("Introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Y ahora introduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("La ecuación no tiene solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
