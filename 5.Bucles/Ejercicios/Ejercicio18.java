public class Ejercicio18 {
  public static void main (String[] args) {
    
     System.out.println("Vamos a calcular los numeros comprendidos entre dos números a intervalos de"
        + " 7\n");
  
    System.out.print("Introduzca el primer número: ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    int numeroMenor;
    int numeroMayor;
  
    if (primerNumero > segundoNumero) {
      numeroMenor = segundoNumero;
      numeroMayor = primerNumero;
      
    } else {
      numeroMenor = primerNumero;
      numeroMayor = segundoNumero;
    }
    System.out.println("\nResultado:");
    
    for (int i = numeroMenor; i <= numeroMayor; i += 7) {
      System.out.print(i);
      
      if (numeroMayor - 7 >= i) {
        System.out.print(", ");
      }
    }
    
    System.out.print("\n");
  }
}
