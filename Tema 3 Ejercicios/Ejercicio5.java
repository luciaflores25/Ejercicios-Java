import java.util.Scanner;
public class Ejercicio5{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el lado ancho en centimetros del rectángulo): ");
    
    double ladoAncho = s.nextDouble();
    
    System.out.print("Ahora introduce el lado largo en centímetros): ");
    
    double ladoLargo = s.nextDouble();
    
    double area = (ladoAncho * ladoAncho);
    
    System.out.println(area + " centímetros cuadrados es el área del rectángulo");
    
  }
}
