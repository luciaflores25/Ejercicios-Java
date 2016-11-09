import java.util.Scanner;
public class Ejercicio7{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base imponible: ");
    
    double baseImponible = s.nextDouble();
    double ivaNum = baseImponible * 21/100;
    
    double totalFactura = baseImponible + ivaNum;
    
    System.out.println(totalFactura + " € es el total de la factura mas IVA");
    
  }
}
