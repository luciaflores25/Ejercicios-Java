/**
 * Programación
 * Tema 2 Variables
 * Ejercicio 1
 * 3 de octubre de 2017
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    int x =144;
    int y=999;
    
    int suma = x + y;
    int resta = x - y;
    int multiplicacion = x * y;
    double division = (double)x / (double)y;
    
    System.out.println("El resultado de la suma de "+ x +" más "+ y +" es " + suma);
    System.out.println("El resultado de la resta de "+ x +" menos "+ y +" es " + resta);
    System.out.println("El resultado de la multiplicación de "+ x +" por "+ y +" es " + multiplicacion);
    System.out.println("El resultado de la división de "+ y +" entre "+ x +" es " + division);
    
  }
}
