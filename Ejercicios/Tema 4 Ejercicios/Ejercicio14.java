public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Vamos a introducir un número por teclado para saber si es par o impar y/o divisible entre 5: ");
    double x = Double.parseDouble(System.console().readLine());
    
    if (x%2 == 0) {
      System.out.println("El número es par");
      } else {
       System.out.println("El número es impar");
       }
  
    if (x%5 == 0) {
      System.out.println("El número es divisible entre 5");
      } else {
      System.out.println("El número no es divisible entre 5");
       }
      
  }
}
