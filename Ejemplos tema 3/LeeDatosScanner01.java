import java.util.Scanner
public class LeeDatosScanner01{
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introduce otro, por favor: ");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    int total;
    
    total = (2 * primerNumero) + segundoNumero;
    
    System.out.print("El primer número introducido es: " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El doble del primer número más el segundo es ");
    System.out.print(total);    
  }
}
