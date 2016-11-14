public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("Como calcular la media de tres notas:");
    
    System.out.print("Introduce la nota 1: ");
    Double notaUno = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduce la nota 2: ");
    Double notaDos = Double.parseDouble(System.console().readLine());
    
    System.out.print("Y ahora introduce la nota 3: ");
    Double notaTres = Double.parseDouble(System.console().readLine());

    double media = (notaUno + notaDos + notaTres) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Tu nota es insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Tu nota es suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Tu noes ses bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Tu nota es notable");
    }
    
    if (media >= 9) {
      System.out.print("Tu nota es sobresaliente");
    }
  }
}
  
