/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 30
 * 
 * 30. Realiza una programa que calcule las horas transcurridas entre dos horas de
       dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
       El día de la semana se puede pedir como un número (del 1 al 7) o como una
       cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
       los datos correctamente y que el segundo día es posterior al primero.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Vamos a calcular las horas transcurridas entre dos ");
    System.out.print("días de la semana introducidas por teclado.\n\n");
    
    boolean diaCorrecto = true;
    boolean horaCorrecta = true;
    int horasDelDia = 0;
    String dia = " ";
    int hora = 0;
    
    //Primer día
    
    while(diaCorrecto){
      System.out.print("Introduce el día de la semana (con letras): ");
      dia = s.nextLine().toLowerCase();
      diaCorrecto = false;
      
      switch (dia){
        case "lunes":
          horasDelDia = 24;
          break;
        
        case "martes":
          horasDelDia = 48;
          break;
        
        case "miercoles":
          horasDelDia = 72;
          break;
        
        case "jueves":
          horasDelDia = 96;
          break;
        
        case "viernes":
          horasDelDia = 120;
          break;
        
        case "sabado":
          horasDelDia = 144;
          break;
        
        case "domingo":
          horasDelDia = 168;
          break;
        default:
        diaCorrecto = true;
      }
    
    }
    
    while (horaCorrecta){
      System.out.print("Introduce la hora del día: ");
      hora = Integer.parseInt(s.nextLine());
      horaCorrecta = false;
      
      if ((hora < 0) || (hora > 23)) {
        horaCorrecta = true;
      }
    }
    
    //Segundo día
    
  }
}
