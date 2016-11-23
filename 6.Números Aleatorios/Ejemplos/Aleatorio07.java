/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Aleatorio07 {
  public static void main (String[] args) {
   
    System.out.println("Aquí se mestra un día de la semana al azar: ");
    
    int dia = (int)(Math.random()*7) + 1;//Genera un número al azar
                                         //entre 1 y 7 ambos incluidos
      
    switch (dia) {
        case 1:
          System.out.println("Lunes");
          break;
          
        case 2:
          System.out.println("Martes");
          break;
          
        case 3:
          System.out.println("Miércoles");
          break;
          
        case 4:
          System.out.println("Jueves");
          break;
          
        case 5:
          System.out.println("Viernes");
          break;
          
        case 6:
          System.out.println("Sábado");
          break;
          
        case 7:
          System.out.println("Domingo");
          break;
        default:
      
    }
  }
 }
