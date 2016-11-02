import java.util.Scanner;
public class Ejercicio12{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la nota del primer examen: ");
    
    double primerExamen = s.nextDouble();
    
    System.out.print("¿Qué nota queires sacar en el trimestre?: ");
    
    double notaDeseada = s.nextDouble();
    
    double segundoExamen = ((notaDeseada * 100) - (primerExamen * 40)) / 60;
    
    System.out.println("Para tener un " + notaDeseada + "en el trimestre, necesitas sacar un " + segundoExamen + "en el segundo examen");
    
  }
}
