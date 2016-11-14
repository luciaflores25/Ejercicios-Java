public class Ejercicio35 {
  public static void main (String[] args) {
    
    System.out.println("Con este programa se pinta una X: ");
    System.out.print("Introduzca la altura de la X siendo un número impar: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("los datos introducidos son incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // Aquí se pinta la parte de arriba 
      while (altura < alturaIntroducida / 2 + 1) {
        
        // Esto para insertar espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // Esto pinta la línea de la X
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } 
      
      // Esto pinta la parte de abajo
      
      espaciosInternos = 0;
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // con esto se insertan espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      }      
    }
  }
}
