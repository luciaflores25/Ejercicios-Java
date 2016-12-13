/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio17 {

  public static void main(String[] args){
    
      int ancho;
      int altura;
      int num;
      int num2;
      
      
      System.out.print("Introduzca el ancho de la pecera: ");
      ancho = Integer.parseInt(System.console().readLine());
      
      num = (int)((Math.random()*(ancho-2))+2);
      
      System.out.print("Introduzca la altura de la pecera: ");
      altura = Integer.parseInt(System.console().readLine());
      
      num2 = (int)((Math.random()*(altura-2))+2);
      
      for (int j = 1; altura >= j; j++) {
        
        if (j == 1) {
        
          for (int i = 0; i < ancho; i++) {
        
            System.out.print("*");
          }
        } else if (j == altura) {
          
          for (int i = 0; i < ancho; i++) {
            
            System.out.print("*");
          }
        } else {
          
          System.out.print("*");
          
          for (int i = 2; ancho > i; i++) {
            
            if (i == num && j == num2) {
              System.out.print("&");
            } else {
            System.out.print(" ");
            }
          }
          System.out.print("*");
        }
        System.out.println();
      }
  }
}
