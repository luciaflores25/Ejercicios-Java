/* Nombre: Lucía Flores Padilla
 * Fecha: 29 de marzo de 2017
 * Ejercicio 40 bucles
 * Programación
 */
public class Ejercicio40 {
  public static void main (String[] args) {
    
    System.out.println("Este programa pinta un rombo hueco: /n");
    System.out.println(" ");
    System.out.print("Introduce la altura del rombo con un número impar mayor que 3: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int espaciosInternos = 0;
    int espaciosPorDelante = alturaIntroducida / 2;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Los datos son incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      
      int altura = 1;
      
      // parte de arriba      
      while (altura <= alturaIntroducida / 2 + 1) {

        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }

        if (altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } //while parte de arriba

      // parte de abajo 
      espaciosInternos = alturaIntroducida - 3;
      espaciosPorDelante = 1;
      altura = 0;

      while (altura < alturaIntroducida / 2) {

        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura < alturaIntroducida / 2 - 1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;
      } // while parte de abajo
    }
  }
}
