public class Ejercicio11 {
  public static void main(String[] args) {
     
    System.out.print("Introduzca un número y mira que ocurre: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("_______________________");
    System.out.println("  Num  Cuadrado  Cubo");

    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
