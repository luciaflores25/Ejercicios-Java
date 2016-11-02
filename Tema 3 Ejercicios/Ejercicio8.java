import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número de horas trabajadas: ");
    
    int horas = s.nextInt();
    double salarioSemanal = horas * 12;
    
    System.out.println(salarioSemanal + " € obtiene este trabajdor de salario semanal.");
    
  }
}
