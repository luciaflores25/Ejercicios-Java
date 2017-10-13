/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 9
 * 12 de octubre de 2017
 * 
 * Escribe un programa que calcule el volumen de un cono según la
 * fórmula V = (1/3)πr^2h
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio09 {
  public static void main(String[] args) {
    
    
    System.out.println("Este programa va a pintar el volumen de un cono...");
    System.out.print("Introduce la altura del cono: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double pi = 3.141592654;
    
    System.out.print("Ahora introduzca el radio: ");
    double radio = Double.parseDouble(System.console().readLine());
    double volumen = (1.0/3.0) * pi * radio * radio * altura;
    
    System.out.println("El volumen del cono es de " +  volumen + " centímetros cuadrados");

  }
}
