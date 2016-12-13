/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio15 {

  public static void main(String[] args){
    
    int num,num2,num3;
    String nota;
    nota = "do";
    
    num2 = (int)((Math.random()*10)+4);
    
    while (num2 > 0) {
      
      for (int i = 4; i > 0; i--) {
        
        num = (int)(Math.random()*7);
    
        switch (num) {
          case 0:
            nota = "do";
            break;
          case 1:
            nota = "re";
            break;
          case 2:
            nota = "mi";
            break;
          case 3:
            nota = "fa";
            break;
          case 4:
            nota = "sol";
            break;
          case 5:
            nota = "la";
            break;
          case 6:
            nota = "si";
            break;
          }
          System.out.print(nota + " ");
        }
        System.out.print("|");
        num2--;
      }
      System.out.print("|");

  }
}
