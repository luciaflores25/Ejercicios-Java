public class Ejercicio10 {
  public static void main(String[] args) {
     
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Introduzca números positivos por teclado para hacer su media.");
    System.out.println("Cuando ya no quiera introducir mas numeros lo q tiene que hacer es introducir un número negativo:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números que se han introducido es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
