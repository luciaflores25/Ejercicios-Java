public class Ejercicio26 {
  public static void main (String[] args) {
    
    System.out.print("Introduzca un número entero que tenga mínimo 2 dígitos: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.println("Si le damos la vuelta al número introducido: " + numeroIntroducido + ", aparecerá asi: " + volteado);
  }
}
