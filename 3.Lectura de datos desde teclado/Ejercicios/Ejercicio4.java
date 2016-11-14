import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número (sin decimales): ");
    
    int numeroUno = s.nextInt();
    
    System.out.print("Introduce otro número (sin decimales): ");
    
    int numeroDos = s.nextInt();
    
    int sum = (numeroUno + numeroDos);
    
    System.out.println(sum + " es el resultado de la suma de los dos números");
    
    int res = (numeroUno - numeroDos);
    
    System.out.println(res + " es el resultado de la resta de los dos números");
    
    int mul = (numeroUno * numeroDos);
    
    System.out.println(mul + " es el resultado de la multiplicación de los dos números");
    
    double div = numeroUno / numeroDos;
    
    System.out.println(div + " es el resultado de la división de los dos números");
  }
}
