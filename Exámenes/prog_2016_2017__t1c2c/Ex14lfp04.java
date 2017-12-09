/**
 * Programación
 * Segundo exámen DAW Primer Trimestre Año 2016-2017
 * 7 de diciembre de 2017
 * Ejercicio 4
 * 
 * 4. Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter #. La
      anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en
      medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto,
      girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por
      cada metro de sendero – representado por una línea – puede que haya un obstáculo o puede que no,
      la probabilidad es del 50%. La posición del obstáculo es aleatoria y puede estar entre el primer y el
      cuarto carácter dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una
      línea), puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u
      otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o
      ninguno.
      
      Ejemplo:
      
      Introduzca la longitud del sendero en metros: 7
      
      # *  #
       #   O#
       #    #
      # *  #
     #*   #
      # O  #
     #    #
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int espacios = 2;
    int dentroDeCamino = 4;
    int direccion = 0;
    boolean obstaculo;
    int porcentaje;
    int posicionObstaculo;
    int tipoObstaculo;
    
    System.out.println("Seleccione la longitud en metros: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    for (int e = 0; e < longitud; e++) {
      porcentaje = (int)(Math.random() * 2);
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      switch (porcentaje) {
        case 0:
          System.out.print("#");
          for (int i = 0; i < dentroDeCamino; i++) {
            System.out.print(" ");
          }
          System.out.print("#");
          System.out.println();
      
          direccion = (int)(Math.random() * 3);
          switch (direccion) {
            case 0:
              espacios--;
              break;
            case 1:
              espacios = espacios;
              break;
            case 2:
              espacios++;
              break;
          }
          break;
        case 1: 
          posicionObstaculo = (int)(Math.random() * 4);
          tipoObstaculo = (int)(Math.random() * 2);
          switch (tipoObstaculo) {
            case 0:
              obstaculo = false;
              System.out.print("#");
              for (int i = 0; i < dentroDeCamino; i++) {
                if (obstaculo == false) {
                  if (i == posicionObstaculo) {
                    System.out.print("*");
                    obstaculo = true;
                  }else {
                    System.out.print(" ");
                  } 
                }else {
                  System.out.print(" ");
                }
              }
                
            System.out.print("#");
            System.out.println();
      
            direccion = (int)(Math.random() * 3);
      
            switch (direccion) {
              case 0:
                espacios--;
                break;
              case 1:
                espacios = espacios;
                break;
              case 2:
                espacios++;
                break;
            }
              break;
            case 1:
          
              obstaculo = false;
              System.out.print("#");
    
              for (int i = 0; i < dentroDeCamino; i++) {
                  
                if (obstaculo == false) {
            
                    if (i == posicionObstaculo) {
                      System.out.print("O");
                      obstaculo = true;
                    } else {
                      System.out.print(" ");
                    } 
                  } else {
                    System.out.print(" ");
                  }
                }
                
            System.out.print("#");
            System.out.println();
      
            direccion = (int)(Math.random() * 3);
            switch (direccion) {
              case 0:
                espacios--;
                break;
              case 1:
                espacios = espacios;
                break;
              case 2:
                espacios++;
                break;
            }
              break;
          }
      }
    }
  }
}
