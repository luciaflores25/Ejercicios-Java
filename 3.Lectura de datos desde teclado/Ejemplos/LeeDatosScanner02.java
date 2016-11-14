import java.util.Scanner;
public class LeeDatosScanner02{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tu nombre y tu edad separados por espacio: ");
    String nombre = s.next();
    int edad = s.nextInt();
    
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
  }
}
