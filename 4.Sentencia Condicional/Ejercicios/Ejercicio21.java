public class Ejercicio21 {
  public static void main(String[] args) {
    
      String recuperacion;

    System.out.print("Introduce la nota del primer examen de programación: ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    System.out.println("Ahora introduce la nota del segundo examen: ");
    double segundoExamen = Double.parseDouble(System.console().readLine());
    double NotaFinal = ((primerExamen + segundoExamen)/2);
     
     if (NotaFinal >= 5) {
       System.out.println("Tu nota de los 2 exámenes es " + NotaFinal);
      } else {
        System.out.println("Introduce ahora si has aprobado la recuperación o no (apto/no apto)");
           recuperacion = System.console().readLine();
           if (recuperacion.equals("apto")) {
           System.out.println("¡Enhorabuena, has aprobado con un 5 sigue así!");
            } else {
              System.out.println("Tu nota es un " + NotaFinal + ",¡Esfuerzate más la próxima vez!");
            }
    }
  }
}
