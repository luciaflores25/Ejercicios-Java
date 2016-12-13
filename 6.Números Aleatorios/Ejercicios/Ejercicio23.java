/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class Ejercicio23{

  public static void main(String[] args){
    
    int num;
     
    System.out.println("Resultado de tirar el dado 5 veces:");
    
    for (int i = 0; i < 5; i++) {
      
      num = (int)(Math.random()*6);
      
      switch (num) {
        case 0:
          System.out.print("As ");
          break;
        case 1:
          System.out.print("K ");
          break;
        case 2:
          System.out.print("Q ");
          break;
        case 3:
          System.out.print("J ");
          break;
        case 4:
          System.out.print("7 ");
          break;
        case 5:
          System.out.print("8 ");
          break;
      }
    }
  }
}
