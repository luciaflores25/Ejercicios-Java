/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Aleatorio06 {
  public static void main (String[] args) {
   
    System.out.println("Genera al azar piedra papel  tigera: ");
    
    int mano = (int)(Math.random()*3);//Genera un número al azar
                                      //entre 0 y 2 mbos incluidos
      
    switch (mano) {
        case 0:
          System.out.println("mano");
          break;
          
        case 1:
          System.out.println("papel");
          break;
          
        case 2:
          System.out.println("tigera");
          break;
        default:
      
    }
  }
 }
