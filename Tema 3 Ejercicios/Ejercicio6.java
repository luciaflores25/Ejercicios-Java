import java.util.Scanner;
public class Ejercicio6{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la medida en centímetros de la base del triángulo: ");
    
    double base = s.nextDouble();
    
    System.out.print("Ahora introduce la altura en centímetros): ");
    
    double altura = s.nextDouble();
    
    double area = ((base * altura) / 2);
    
    System.out.println(area + " centímetros cuadrados es el área del triángulo");
    
  }
}
