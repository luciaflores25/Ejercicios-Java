/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class Ejercicio25{

  public static void main(String[] args){
    
    int num;
    int temp;
    boolean primo;
    temp = 1;
    
    for (int i = 0; i < 100; i++) {
      
      num = (int)((Math.random()*191)+10);
      primo = true;
      
      if (num % 5 == 0) {
        
        System.out.print("[" + num + "] ");
      }
      
      for (int j = 2; j < num; j++) {
        
        temp = num % j;
        
        if (temp == 0) {
          primo = false;
        }
      }
      if (primo == true) {
        System.out.print("#" + num + "# ");
    } else {
        System.out.print(num + " ");
    }
   }
  }
}
