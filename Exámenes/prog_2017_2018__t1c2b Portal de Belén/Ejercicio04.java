/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones WEB (DAW)
 * 12 de diciembre de 2017
 * Ejercicio 4
 * 
 * 4. Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa
      debe pedir el día de la semana (de lunes a domingo) y debe mostrar de forma aleatoria la secuencia
      del entrenamiento en función de las siguientes pautas:
      a) El entrenamiento empieza siempre con un calentamiento aeróbico que puede ser bicicleta,
        elíptica o cinta.
      b) A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los
        grupos musculares grandes son espalda, pecho y piernas y los grupos musculares pequeños
        son bíceps, tríceps y hombros.
      c) El entrenamiento finaliza o bien con abdominales o bien con ejercicio aeróbico (bicicleta,
        elíptica o cinta). En caso de finalizar con aeróbico, no se puede repetir el ejercicio que se hizo
        en el calentamiento.
      d) Los miércoles y los domingos son días de descanso.
      
      Ejemplo:
      Introduzca el día de la semana: jueves
      Su entrenamiento de hoy es el siguiente: elíptica, espalda, bíceps y bicicleta.
      
      Introduzca el día de la semana: miércoles
      Hoy es día de descanso.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int calentamiento = 0;
    int grupoGrande = 0;
    int grupoPeque = 0;
    int entrenamientoFinal = 0;
    
    while(calentamiento == entrenamientoFinal){
      calentamiento = (int)(Math.random()*3 + 1);
      grupoGrande = (int)(Math.random()*3 + 1);
      grupoPeque = (int)(Math.random()*3 + 1);
      entrenamientoFinal = (int)(Math.random()*4 + 1);
    }

    System.out.println("Este programa genera la tabla de entrenamiento para un gimnasio\n");
    
    System.out.print("Introduzca el día de la semana: ");
    String dia = s.nextLine(). toLowerCase();
    
    switch(dia){
      case "lunes":
      case "martes":
      case "jueves":
      case "viernes":
      case "sabado":
      case "sábado":
      
        System.out.print("Su entrenamiento de hoy es ");
        switch(calentamiento){
          case 1:
            System.out.print("bicicleta, ");
            break;
          case 2:
            System.out.print("elíptica, ");
            break;
          case 3:
            System.out.print("cinta, ");
            break;
            default:
        }
        
        switch(grupoGrande){
          case 1:
            System.out.print("espalda, ");
            break;
          case 2:
            System.out.print("pecho, ");
            break;
          case 3:
            System.out.print("piernas, ");
            break;
            default:
        }
        
        switch(grupoPeque){
          case 1:
            System.out.print("bíceps ");
            break;
          case 2:
            System.out.print("tríceps ");
            break;
          case 3:
            System.out.print("hombros ");
            break;
            default:
        }
        
        switch(entrenamientoFinal){
          case 1:
            System.out.print("y bicicleta.");
            break;
          case 2:
            System.out.print("y elíptica.");
            break;
          case 3:
            System.out.print("y cinta.");
            break;
          case 4:
            System.out.print("y abdominales.");
            break;
            default:
        }
        
        break;
      case "miercoles":
      case "miércoles":
      case "domingo":
        System.out.println("Hoy es día de descanso.");
        
        break;
      default:
        System.out.print("\nEl día que has introducido no es correcto, ");
        System.out.println("debes introducir un día de lunes a domingo.");
    }
  }
}
