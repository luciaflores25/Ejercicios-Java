public class Ejercicio1 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número de día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    switch (dia) {
    
    case 1:
      diaDeLaSemana = "Lunes , que a primera hrora toca Sistemas informáticos.";
      break;
      
    case 2:
      diaDeLaSemana = "Martes, que a primera hora toca programación";
      break;
      
    case 3:
      diaDeLaSemana = "Miércoles, que a primera hora toca programación";
      break;
      
    case 4:
      diaDeLaSemana = "Jueves, que a primera hora toca base de datos";
      break;
    
    case 5:
      diaDeLaSemana = "Viernes, que a primera hora toca lenguaje de marcas";
      break;
      
    default:
      diaDeLaSemana = "No exise ese día.";
  }
  
  System.out.println("Día " + dia + ": " + diaDeLaSemana);
  
  }
}
