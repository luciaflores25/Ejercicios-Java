/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 22
 * 24 de octubre de 2017
 * 
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
   hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
   Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
   por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
   a las 15:00h.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará las horas y los minutos que quedan para el fin de semana.");
    System.out.print("Por favor, introduzca un día de la semana:");
    String dia = (System.console().readLine()).toLowerCase();
    System.out.print("Ahora introduzca la horas (solo hora): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Y los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora < 0) || (hora >=23) || (minutos < 0) || (minutos >= 60)){  
      System.out.print("La hora o los minutos son incorrectos (hora:0-23), (minutos:0-59)");
    } else {
        int nDia = 0;
          
        switch (dia) {
          case "sábado":
          case "sabado":
            nDia = 0;
            break;
          case "domingo":
            nDia = 1;
            break;
          case "lunes":
            nDia = 2;
            break;
          case "martes":
            nDia = 3;
            break;
          case "miércoles":
          case "miercoles":
            nDia = 4;
            break;
          case "jueves":
            nDia = 5;
            break;
          case "viernes":
            nDia = 6;
            break;
          default:
            System.out.print("El día que has introducido es incorrecto.");
      }
        int totalMinutos = (6 * 24 * 60) + (15 * 60);
        int minutosIntroducidos = (nDia * 24 * 60) + (hora * 60) + minutos;
        
        System.out.println("Dia introducido: " + dia);
        System.out.println("Hora introducida " + hora);
        System.out.println("Minutos introducidos: " + minutos);
        System.out.println("Minutos que faltan hasta el fin de semana: " + (totalMinutos - minutosIntroducidos));
    }
  }
}
