public class Ejercicio6 {
  public static void main(String[] args) {
    
    double baseImponible = 20000;
    double ivaNum = baseImponible * 21/100;
    
    double sum = baseImponible + ivaNum;
    
    System.out.println("El total de la factura (con IVA) es " + sum);
  }
}
