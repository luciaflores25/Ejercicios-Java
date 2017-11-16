/**
 * Programación
 * Examen DAM primer trimestre
 * 10 de noviembre de 2017
 * Ejercicio 3
 * 
 * 3. Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a
      los últimos acontecimientos que han tenido lugar en Cataluña, han recibido muchos pedidos del cartel
      que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
      usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre los
      números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior
      de los cincos también es siempre igual. La parte inferior del 5 sí que varía en función de la altura.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class ExamenDamEj03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vamos a pintar el articulo 155");
    System.out.println("Introduce la altura (minimo 5): ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el numero de espacios entre los numeros(minimo 1): ");
    int anchuraEntreNumeros = Integer.parseInt(s.nextLine());
    
    int altura = 1;
//////////////////linea 1/////////////////////////////////////////////////////
    System.out.print("*");                        //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //aqui se pinta
    }                                             //la primera línea
    System.out.print("****");                     //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //
    }                                             //
    System.out.print("****");                     //
    altura++;
    System.out.println();
/////////////////////linea 2/////////////////////////////////////////////////////////
    System.out.print("*");                        //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //aqui se pinta
    }                                             //la segunda línea
    System.out.print("*   ");                     //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //
    }                                             //
    System.out.print("*   ");                     //
    altura++;
    System.out.println();
//////////////////linea 3/////////////////////////////////////////////////////
    System.out.print("*");                        //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //aqui se pinta
    }                                             //la tercera línea
    System.out.print("****");                     //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //
    }                                             //
    System.out.print("****");                     //
    altura++;
    System.out.println();
    
    while(altura < alturaIntroducida){
      System.out.print("*");                        //
      for(int i = 1; i <= anchuraEntreNumeros; i++){//
        System.out.print(" ");                      //aqui se pinta
      }                                             //la altura de la
      System.out.print("   *");                     //barriga de abajo
      for(int i = 1; i <= anchuraEntreNumeros; i++){//del número 5
        System.out.print(" ");                      //
      }                                             //
      System.out.print("   *");                     //
      altura++;
      System.out.println();
    }
//////////////////última línea/////////////////////////////////////////////////////
    System.out.print("*");                        //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //aqui se pinta
    }                                             //la última línea
    System.out.print("****");                     //
    for(int i = 1; i <= anchuraEntreNumeros; i++){//
      System.out.print(" ");                      //
    }                                             //
    System.out.print("****");                     //
  }
}
