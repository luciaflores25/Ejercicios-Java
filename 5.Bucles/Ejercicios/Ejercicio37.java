public class Ejercicio37 {
  public static void main (String[] args) {
    System.out.println("Conversor de décimales a sistema de palotes: ");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    int palotes;
    
    while (volteado > 0) {
      palotes = (int)(volteado % 10); // Este es el último dígito de volteado
      // Aquí se pinta el dígito con palotes.
      for (int i = 0; i < palotes; i++) {
        System.out.print("|");
      }
      if (volteado > 10) { // para que no se pinte el último guión
        System.out.print(" - "); // con esto se separan los dígitos
      }
      volteado = volteado / 10; // quita el último dígito volteado
    }    
  }
}
