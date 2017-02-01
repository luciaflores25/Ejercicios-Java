import java.util.Scanner;
public class Ejercicio10{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce los Mb que quieres convertir: ");
    
    int Mb = s.nextInt();
    
    int Kb = Mb * 1000;
    
    System.out.println("El resultado de convertir " + Mb + "Mb es " + Kb + " Kb.");
  }
}
