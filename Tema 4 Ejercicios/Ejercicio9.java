public class Ejercicio9 {
  public static void main(String[] args) {
    
    double x1, x2;

    System.out.println("Como resolver una ecuación del tipo:");
    System.out.println("ax^2 + bx + c = 0");
    System.out.println("Para empezar introduce los valores.");
    System.out.print("a = ");
    
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("b = ");
    
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("c = ");
    
    double c = Double.parseDouble(System.console().readLine());


// 0x^2 + 0x + 0 = 0
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Las soluciones de la ecuación son infinitas.");
    }
    

// 0x^2 + 0x + c = 0  con c distinto de 0
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
    
      // ax^2 + bx + 0 = 0  con a y b distintos de 0
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }


// 0x^2 + bx + c = 0  con b y c distintos de 0
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }

// ax^2 + bx + c = 0  con a, b y c distintos de 0
    
    if ((a != 0) && (b != 0) && (c != 0)) {	
      
        double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
        System.out.println("La ecuación no tiene soluciones reales");
          } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(4 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(4 * a * c));
      }
  }
          }
}
