import java.util.Scanner;
public class Ejercicio2{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad en euros(€) que quiera convertir: ");
    
    double euros = s.nextDouble();
    
    double pesetas = euros * 166.386;
    
    System.out.println("El resultado de convertir " + euros + "€ es " + pesetas + " pesetas.");
  }
}
