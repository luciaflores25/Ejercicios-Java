/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio16 {

  public static void main(String[] args){
    
    int num;
    String figura,figura1,figura2,figura3;
    
    figura1 = "";
    figura2 = "";
    figura3 = "";
    figura = "";
    
    for (int i = 0; i < 3; i++) {
      
      num = (int)(Math.random()*5);
      
      switch (num) {
        
        case 0:
          figura = "corazón";
          break;
        case 1:
          figura = "diamante";
          break;
        case 2:
          figura = "herradura";
          break;
        case 3:
          figura = "campana";
          break;
        case 4:
          figura = "limón";
          break;
        }
        switch (i) {
          case 0:
            figura1 = figura;
            break;
          case 1:
            figura2 = figura;
            break;
          case 2:
            figura3 = figura;
            break;
        }
        System.out.print(figura + " ");
      }
      if (figura1 == figura2 && figura2 == figura3) {
        
        System.out.print("Enhorabuena, ha ganado 10 monedas");
      
      } else if ((figura2 != figura1) && (figura1 != figura3) && (figura2 != figura3)) {
        
        System.out.print("Lo siento, ha perdido");
        
      } else {
        System.out.print("Enhorabuena, ha conseguido su moneda");
      }
    }
}
