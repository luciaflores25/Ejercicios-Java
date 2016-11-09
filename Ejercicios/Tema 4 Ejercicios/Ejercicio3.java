public class Ejercicio3 {
  public static void main(String[] args) {

  System.out.print("Por favor, introduzca un número de día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    switch (dia) {
    
    case 1:
      diaDeLaSemana = "Lunes";
      break;
      
    case 2:
      diaDeLaSemana = "Martes";
      break;
      
    case 3:
      diaDeLaSemana = "Miércoles";
      break;
      
    case 4:
      diaDeLaSemana = "Jueves";
      break;
    
    case 5:
      diaDeLaSemana = "Viernes";
      break;
      
    case 6:
      diaDeLaSemana = "Sábado";
      break;
    
    case 7:
      diaDeLaSemana = "Domingo";
      break;
      
    default:
      diaDeLaSemana = "No exise ese día.";
  }
  
  System.out.println("Día " + dia + ": " + diaDeLaSemana);
  
  }
}
