public class Ejercicio33 {
  public static void main (String[] args) {
    
    System.out.println("Con este programa pitaremos una U: ");
    System.out.print("Introduzca la altura que quieras: ");
    int altura = Integer.parseInt(System.console().readLine());

    //Aquí se pintan el palo de la derecha y el de la izquierda
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    // Aquí se pinta la base
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
