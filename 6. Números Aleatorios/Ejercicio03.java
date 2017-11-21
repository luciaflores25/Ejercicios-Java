/**
 * Programación
 * Tema 6 Números Aleatorios
 * 21 de noviembre de 2017
 * Ejercicio 3
 * 
 * 3. Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
      de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra al azar una carta de la baraja española ");
    int cartas = (int)(Math.random()*10 +1);
    int palo = (int)(Math.random()*4 +1);
    String cartaSacada = "";
    
    switch(cartas) {
      case 1:
        cartaSacada = "AS";
        break;
      case 2:
        cartaSacada = String.valueOf("2 de");
        break;
      case 3:
        cartaSacada = String.valueOf("3 de"); 
        break;
      case 4:
        cartaSacada = String.valueOf("4 de");
        break;
      case 5:
        cartaSacada = String.valueOf("5 de");
        break;
      case 6:
        cartaSacada = String.valueOf("6 de");
        break;
      case 7:
        cartaSacada = String.valueOf("7 de");
        break;
      case 8:
        cartaSacada = String.valueOf("Sota de");
        break;
      case 9:
        cartaSacada = String.valueOf("Caballo de");
        break;
      case 10:
        cartaSacada = String.valueOf("Rey de");
        break;
        default:
    }
        
    switch(palo) {
      case 1:
        cartaSacada += " Oros";
        break;
      case 2:
        cartaSacada += " Espadas";
        break;
      case 3:
        cartaSacada += " Copas"; 
        break;
      case 4:
        cartaSacada += " Bastos";
        break;
        default:
    }
    System.out.println(cartaSacada);

    
    
  }
}
