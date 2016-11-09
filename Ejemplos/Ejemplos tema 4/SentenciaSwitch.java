public class SentenciaSwitch {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número de mes: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    String numeroDeMes;
    switch (mes) {
    
    case 1:
      numeroDeMes = "Enero.";
      break;
      
    case 2:
      numeroDeMes = "Febrero";
      break;
      
    case 3:
      numeroDeMes = "Marzo";
      break;
      
    case 4:
      numeroDeMes = "Abril";
      break;
    
    case 5:
      numeroDeMes = "Mayo";
      break;
      
    case 6:
      numeroDeMes = "Junio.";
      break;
      
    case 7:
      numeroDeMes = "Julio";
      break;
      
    case 8:
      numeroDeMes = "Agosto";
      break;
      
    case 9:
      numeroDeMes = "Septiembre";
      break;
    
    case 10:
      numeroDeMes = "Octubre";
      break;
      
    case 11:
      numeroDeMes = "Noviembre";
      break;
    
    case 12:
      numeroDeMes = "Diciembre";
      break;
      
    default:
      numeroDeMes = "No exise ese mes.";
  }
  
  System.out.println("Mes " + mes + ": " + numeroDeMes);
  
  }
}
