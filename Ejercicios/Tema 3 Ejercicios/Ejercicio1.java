import java.util.Scanner;
public class Ejercicio1{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce dos números (enteros) separados por espacios: ");
    
    int x1 = s.nextInt();
    int x2 = s.nextInt();
    
    int mul = (x1 * x2);
    
    System.out.println("El resultado de la multiplicación de estos dos números es " + mul);
  }
}
