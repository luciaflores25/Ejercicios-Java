public class Ejercicio22 {
  public static void main (String[] args) {
    
    System.out.println("En este programa van a aparecer todos los primos entre 2 y 100");
    
    boolean primo;
    
    for (int numeroAComprobar = 2; numeroAComprobar <= 100; numeroAComprobar++) {
      primo = true;
      
      for (int i = (int)Math.sqrt(numeroAComprobar); i >= 2; i--) {
        
        if (numeroAComprobar % i == 0) {
        primo = false;
        }
      }
      
      if (primo) {
          System.out.print(numeroAComprobar + ", ");
      }
    }
  }
}
