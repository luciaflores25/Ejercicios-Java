public class Ejercicio36 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número y le diré si es capicúa o no: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // con esto se voltea el número introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (volteado == numeroIntroducido) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
  }
}
