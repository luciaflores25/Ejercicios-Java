public class Ejercicio12 {
  public static void main(String[] args) {
     
    System.out.print("Introduce n para que se muestren los primeros números de la serie de Fibonacci: ");
    
    int n = Integer.parseInt(System.console().readLine());

    switch (n) {
      case 1:
        System.out.print("0");
        break;
        
      case 2:
        System.out.print("0 1");
        break;
        
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        
        while(n > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            n--;
        }
    }    
    System.out.println();
  }
}
