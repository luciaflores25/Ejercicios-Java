public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("Calcular la media de tres notas.");
    
    System.out.print("Introduzca la nota 1: ");
    Double notaUno = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la nota 2: ");
    Double notaDos = Double.parseDouble(System.console().readLine());
    
    System.out.print("Y ahora la nota 3: ");
    Double notaTres = Double.parseDouble(System.console().readLine());

    double media = (notaUno + notaDos + notaTres) / 3;

    System.out.printf("La media es %.2f\n", media);
  }
}

  
