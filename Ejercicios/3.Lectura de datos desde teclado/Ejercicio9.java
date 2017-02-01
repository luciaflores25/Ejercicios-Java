import java.util.Scanner;
public class Ejercicio9{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el radio del  cono: ");
    double radio = s.nextDouble();
    
    System.out.print("Introduce la altura del  cono: ");
    double altura = s.nextDouble();
    
    double volumen = (3.14 * (radio * radio) * altura) / 3;
    
    
    System.out.println(volumen + " es el volumen del cono.");
    
  }
}
