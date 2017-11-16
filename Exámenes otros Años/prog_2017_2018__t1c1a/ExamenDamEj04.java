/**
 * Programación
 * Examen DAM primer trimestre
 * 11 de noviembre de 2017
 * Ejercicio 4
 * 
 * 4. El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
      encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
      el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class ExamenDamEj04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número entero (mayor que cero): ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int numeroNuevo = 0;
    boolean aComido = false;
    int volteado = 0;
    
    while (numeroIntroducido >= 1){
      if((numeroIntroducido % 10 == 0) || (numeroIntroducido % 10 == 8)){
        numeroIntroducido = numeroIntroducido / 10;
        aComido = true;
      }else{
        numeroNuevo = numeroNuevo + numeroIntroducido % 10;
        numeroNuevo = numeroNuevo * 10;
        numeroIntroducido = numeroIntroducido / 10;
      }
    }
    numeroNuevo = numeroNuevo / 10;
    
    while (numeroNuevo > 0){
      volteado = (volteado * 10) + (numeroNuevo % 10);
      numeroNuevo = numeroNuevo / 10;
    }
    
    if(aComido){
      System.out.println("Después de haber sido comido por el gusano numérico se queda en " + volteado);
    }else{
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
    
  }
}
