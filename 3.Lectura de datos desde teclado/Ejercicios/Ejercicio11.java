import java.util.Scanner;
public class Ejercicio11{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce los Kb que quieres convertir: ");
    
    int Kb = s.nextInt();
    
    double Mb = Kb * 0.001;
    
    System.out.println("El resultado de convertir " + Kb + "Kb es " + Mb + " Mb.");
  }
}
