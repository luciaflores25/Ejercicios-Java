import java.util.Scanner;
public class Ejercicio3{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad en pesetas que quiera convertir: ");
    
    double pesetas = s.nextDouble();
    
    double euros = (pesetas * 0.006);
    
    
    
    System.out.println("El resultado de convertir " + pesetas + " pesetas es " + euros + "€.");
  }
}
