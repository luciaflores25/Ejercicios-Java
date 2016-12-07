/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio08 {

  public static void main(String[] args){
    
    String resultado;
    
    double probabilidad;
    
    for (int i = 1 ; i<= 15; i++) {
      
      System.out.printf("%2d.  ", i);
      
      for (int j = 1; j <= 3; j++) {
        
        probabilidad = Math.random();
        
        if (probabilidad < (1.0 / 2.0)) {
          resultado = "1";
        } else if (probabilidad < (1.0 / 2.0 + 1.0 / 3.0)) {
          resultado = "X";
        } else {
          resultado = "2";
        }
        
        System.out.print(resultado + " ");
      }
      
      System.out.print("\n");
    }
  }
}
