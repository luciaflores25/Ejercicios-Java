/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class Ejer4ArrayClase {
  public static void main(String[] args) {
  
  System.out.println("");
    System.out.println("");
    long[] numero = new long[20];
    long[] cuadrado = new long[20];
    long[] cubo = new long[20];
      System.out.println("[a]: numero  | cuadrado | cubo");
      System.out.println("--------------------------------");
      for(int i = 0;i < 20;i++){
        
          numero[i] = (int)((Math.random()*101));
          cuadrado[i] = numero[i]*numero[i];
          cubo[i] = cuadrado[i]*numero[i];
          
          
          System.out.print("[" + i + "]: ");
          System.out.print(numero[i] + "  " + cuadrado[i] + "  " + cubo[i]);
          System.out.println();

  }
 }
}
