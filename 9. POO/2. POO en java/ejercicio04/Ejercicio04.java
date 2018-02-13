package ejercicio04;
/**
 *
 * @author Lucía Flores
 * Programación
 * Tema 9 POO
 * Ejercicio 4
 * 
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
 * los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(5,17);
    Fraccion f2 = new Fraccion(3,31);
    Fraccion f3 = new Fraccion(352,428);
    
    System.out.println("Francción f1: ");
    System.out.println(f1);    
    System.out.println("Aquí se va a inventir una fracción: ");
    System.out.println(f1.invierte());
    System.out.println("Aquí se van a multiplicar dos fracciones: ");
    System.out.println(f1.multiplica(2, 2));
    System.out.println("Aquí se van a dividir dos fracciones: ");
    System.out.println(f1.divide(2, 2));
    System.out.println("Aquí se va a simplificar una fracción: ");
    System.out.println(f3.simplifica());
  }
  
}
