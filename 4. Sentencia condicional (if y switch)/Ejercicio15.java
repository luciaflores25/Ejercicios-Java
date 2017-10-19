/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 15
 * 19 de octubre de 2017
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
   por teclado que podrá ser una letra, un número o un símbolo como *, +,
   -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
   el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
   izquierda o hacia la derecha.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Este programa va a pintar una pirámide");
    System.out.print("Introduce el caracter con el que quieres qe aparezca: ");
    String c = System.console().readLine();
    
    System.out.println("\nAhora elige la posición del vértice (1-4)");
    System.out.println(" 1. Arriba");
    System.out.println(" 2. Abajo");
    System.out.println(" 3. Izquierda");
    System.out.println(" 4. Derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.println("    "+c);
        System.out.println("   "+c+c+c);
        System.out.println("  "+c+c+c+c+c);
        System.out.println(" "+c+c+c+c+c+c+c);
        System.out.println(c+c+c+c+c+c+c+c+c);
        break;
    
      case 2:
        System.out.println(c+c+c+c+c+c+c+c+c);
        System.out.println(" "+c+c+c+c+c+c+c);
        System.out.println("  "+c+c+c+c+c);
        System.out.println("   "+c+c+c);
        System.out.println("    "+c);
        break;
    
      case 3:
        System.out.println(c);
        System.out.println(c+c+c);
        System.out.println(c+c+c+c);
        System.out.println(c+c+c);
        System.out.println(c);
        break;
        
      case 4:
        System.out.println("    "+c);
        System.out.println("  "+c+c+c);
        System.out.println(c+c+c+c+c);
        System.out.println("  "+c+c+c);
        System.out.println("    "+c);
        break;
        
      default:
        System.out.print("\nLa opción elegida no es correcta.");
    }
  }
}
