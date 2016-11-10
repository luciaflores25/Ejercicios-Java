public class Ejercicio9 {
  public static void main(String[] args) {
     
    int digitos = 1, n, numeros;

    System.out.print("Introduzca un número y aparecerá cuantos dígitos tiene: ");
    numeros = Integer.parseInt(System.console().readLine());
    
    n = numeros;
    
    while (n > 10) {
      n /= 10;
      digitos++;
    }
    
    System.out.println(numeros + " tiene " + digitos + " dígito/s.");

  }
}
