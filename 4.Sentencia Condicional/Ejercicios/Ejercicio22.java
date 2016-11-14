public class Ejercicio22 {
  public static void main(String[] args) {
   
   
   System.out.print("Introduce un día de la semana con números (lunes a viernes) para calcular cuantos minutos faltan para el fin de semana: ");
    String diaDeLaSemana = System.console().readLine();
    int numeroSemana = 0;
    
    switch (diaDeLaSemana) {
      case "lunes":
        numeroSemana = 1;
        break;
        
      case "martes":
        numeroSemana = 2;
        break;
      case "miercoles":
        numeroSemana = 3;
        break;
        
      case "jueves":
        numeroSemana = 4;
        break;
        
      case "viernes":
        numeroSemana = 5;
        break;
        
      default:
         System.out.print("El día introducido no es correcto.");
      }
      
    System.out.println("Introduce la hora y los minutos a continuación");
    
      System.out.print("Aquí la hora: ");
      int horas = Integer.parseInt(System.console().readLine());
      
      System.out.print("Y aquí los minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
    
    int horasTotales = (4 * 24 * 60) + (15 * 60);
    int minutosAhora = (numeroSemana * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (horasTotales - minutosAhora) + " minutos para el fin de semana.");
    
      }
}

