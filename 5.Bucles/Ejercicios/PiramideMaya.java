public class PiramideMaya {
  public static void main(String[] args) {
     
    System.out.print("altura: ");
    int n = Integer.parseInt(System.console().readLine().toLowerCase());
    int huecosActual = n-1;
    
    for (int linea=1; linea <= n; linea++){

      for (int pEspacio=1; pEspacio <= huecosActual; pEspacio++){ //Con esto se pintan los espacios
        System.out.print(" ");
      }

      for (int asteriscos=1; asteriscos <= linea; asteriscos++){//Con esto se pintan los asteriscos del principio
        System.out.print("*");
      }
      
      for (int asteVShueco= 1; asteVShueco <= 4; asteVShueco++){//Con esto se pintan los espacios de enmedio
        if( linea%2 == 0 ){//pares
          System.out.print(" ");
        } else { //impares
          System.out.print("*");
        }
      }
      
      for(int asteriscos=1; asteriscos <= linea; asteriscos++){//Con este¡o se pintan los asteriscos del final
        System.out.print("*");
      }
      
        huecosActual--;
      System.out.println();
  }
 }
}
