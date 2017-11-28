/**
 * Programación
 * Tema 6 Números Aleatorios
 * 28 de noviembre de 2017
 * Ejercicio 16
 * 
 * 16. Realiza un simulador de máquina tragaperras simplificada que cumpla los
       siguientes requisitos:
        a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
          figuras posibles: corazón, diamante, herradura, campana y limón.
        b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
          ha perdido”.
        c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
          ha recuperado su moneda”.
        d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
          10 monedas”.
        Ejemplo 1:
          diamante diamante limón
          Bien, ha recuperado su moneda
        Ejemplo 2:
          herradura campana diamante
          Lo siento, ha perdido
        Ejemplo 3:
          corazón corazón corazón
          Enhorabuena, ha ganado 10 monedas
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("MÁQUINA TRAGAPERRAS");
    System.out.println();
    System.out.println();
    int figura = 0;
    int tirada = 0;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    
    for(int i = 1; i <= 3; i++){
      tirada = (int)(Math.random()*3);
      switch(tirada) {
        case 0:
          System.out.print(" corazon ");
          break;
        case 1:
          System.out.print(" diamante ");
          break;
        case 2:
          System.out.print(" herradura ");
          break;
        case 3:
          System.out.print(" limón ");
          break;
        case 4:
          System.out.print(" campana ");
          break;
          default:
      }
      
      //Este switch es para hacer luego la comparación de las tres figuras
      
      switch(i){
        case 1:
          figura1 = figura;
          break;
        case 2:
          figura2 = figura;
          break;
        case 3:
          figura3 = figura;
          break;
          default:
      }
    }//Cierra el for
    System.out.println();
    //Aquí se comprueba si son las tres tiradas iguales, las tres distintas, o dos de ellas iguales
    
    if((figura1 == figura2) && (figura2 == figura3)){
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    }else if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)){
      System.out.println("Lo siento, ha perdido su moneda");
    }else{
      System.out.println("Bien, ha recuperdado su moneda");
    }
  }
}
