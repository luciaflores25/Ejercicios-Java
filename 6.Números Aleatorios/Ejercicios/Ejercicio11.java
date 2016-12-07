/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio11 {

  public static void main(String[] args){
    
    String nota;
    
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for (int i = 1; i <= 20; i++) {
      nota = String.valueOf((int)(Math.random() * 5 + 1));
      
      switch (nota) {

        case "1":
          nota = "Suspenso";
          suspensos++;
          break;
        case "2":
          nota = "Suficiente";
          suficientes++;
          break;
        case "3":
          nota = "Bien";
          bienes++;
          break;
        case "4":
          nota = "Notable";
          notables++;
          break;
        case "5":
          nota = "Sobresaliente";
          sobresalientes++;
          break;
      }
      
      System.out.println(nota);
    }
    
    System.out.println("\nHan salido " + suspensos + " suspensos.");
    
    System.out.println("Han salido " + suficientes + " suficientes.");
    
    System.out.println("Han salido " + bienes + " bienes.");
    
    System.out.println("Han salido " + notables + " notables.");
    
    System.out.println("Han salido " + sobresalientes + " sobresalientes.");
  }
}
