/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio18 {

  public static void main(String[] args){
    
      int num;
    String color,temp,temp2;
    
    color = "";
    temp = "";
    temp2 = "";
    
    System.out.println("Estos son los colores para el cuarto");
    
    for (int i = 0; i < 3; i++) {
      
      num = (int)(Math.random()*6);
      
      switch (num) {
        
        case 0:
          color = "verde";
          break;
        case 1:
          color = "amarillo";
          break;
        case 2:
          color = "rojo";
          break;
        case 3:
          color = "azul";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
      }
      if (temp.equals(color) || temp2.equals(color)) {
  
        i--;
      } else {
        System.out.println(color);
      }
      temp = color;
      
      if (i == 0) {
        
      temp2 = color;
      }
    }
  }
}
