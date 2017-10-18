/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 9
 * 18 de octubre de 2017
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
   ax2 + bx + c = 0)
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio09 {
  public static void main(String[] args) {
    
    System.out.println("Este programa resuelve una ecuación de segundo grado (del tipo ax2 + bx + c = 0)\n");
    System.out.print("Introduce el valor de a = ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduce el valor de b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduce el valor de c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    double raiz = Math.sqrt((b*b)-(4*a*c));
    
    double solucion1 = (-b+raiz)/(2*a);
    double solucion2 = (-b-raiz)/(2*a);
    
    if (a==0){
      System.out.println("La ecuación no tiene solución");
    }else if (raiz<0){
      System.out.println("La ecuación no tiene solución");
    }
    
    System.out.println("x1 = " + solucion1);
    System.out.println("x2 = " + solucion2);
  }
}
