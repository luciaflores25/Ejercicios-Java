public class Ejercicio38 {
  public static void main (String[] args) {
    
    System.out.println("Programa que pinta un reloj de arena relleno: ");
    System.out.println("-------------------------------------------------");
    System.out.println(" ");
    System.out.print("Por favor, introduzca la altura del reloj (tiene que se un número impar): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Los datos son incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // Esto pinta la parte de arriba 
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea superior del reloj
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print("*");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } // while parte de arriba 
      
      // pint la parte de abajo
      espaciosInternos = 0;
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // Esto inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // Esto pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print("*");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } // while parte de abajo      
    }
  }
}
