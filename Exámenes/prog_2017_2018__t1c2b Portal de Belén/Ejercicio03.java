/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones WEB (DAW)
 * 12 de diciembre de 2017
 * Ejercicio 3
 * 
 * 3. Si hay algo típico y entrañable en la época navideña es el nacimiento con La Virgen María, El Niño
      Jesús y San José. Realiza un programa que pinte por pantalla un nacimiento teniendo en cuenta las
      siguientes premisas:
        a) El portal es siempre el mismo, no varía en anchura ni en altura ni en los caracteres que se
      pintan (guiones y asteriscos). Debe salir exactamente igual a como se indica en los ejemplos.
        b) La Virgen María se representa con una V, San José con una S y el Niño Jesús con una o
      minúscula.
        c) Los tres personajes deben aparecer colocados de forma aleatoria en la misma línea, apoyados
      en el suelo (no pueden levitar), en alguna de las 5 posiciones posibles.
        d) Cada uno de los personajes debe aparecer en una posición distinta (no se pueden superponer).
        e) El Niño Jesús siempre debe aparecer en medio de La Virgen y de San José. Sin embargo, tanto
      La Virgen como San José pueden aparecer a la derecha o a la izquierda del Niño Jesús.
      
      Ejemplo: 
      
          * * * * * * *
          *           *
          * V    o S  *
       -------------------
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int nino = 0;
    int espacios = 1;
    int espaciosTotales = 5;
    String figura1 = "";
    String figura2 = "";
    
    int aleatorio = (int)Math.random()*2;
    
    switch(aleatorio){
      case 0:
        figura1 = "S";
        figura2 = "V";
        break;
      case 1:
        figura1 = "V";
        figura2 = "S";
        break;
    }
    
    int posicion1 = 0;
    int posicion2 = 0;
    
    posicion1 = (int)(Math.random()*(5-2) + 1);
    nino = (int)(Math.random()*(espaciosTotales - posicion1 - 1) + (posicion1 + 1));
    posicion2 = (int)(Math.random()*(espaciosTotales - (posicion1 + nino)) + (nino + 1)); 
    
    System.out.println("      *******");
    System.out.println("      *     *");
    
      System.out.print("      *");
      for(int i = 1; i <= espaciosTotales; i++){
        if(espacios == posicion1){
          System.out.print(figura1);
          
        }else if(espacios == posicion2){
          System.out.print(figura2);
     
        }else if(espacios == nino){
          System.out.print("o");
        }else{
          System.out.print(" ");
        }
        espacios++;
      }
      System.out.print("*\n");
    
    System.out.println("-------------------");
    
  }
}
