/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 2 números aleatorios
 * Programación
 */
  
public class Ejercicio02 {

  public static void main(String[] args){

    System.out.println("Este programa va a mostrar una carta de la baraja francesa al azar \n");
    
    String palo =  String.valueOf((int)(Math.random() * 4));
    String carta = String.valueOf((int)(Math.random() * 13 + 1));
    

    switch (carta) {
      case "11":
        carta = "J";
        break;
      case "12":
        carta = "Q";
        break;
      case "13":
        carta = "K";
        break;
      case "1":
        carta = "A";
        break;
    }
    
    switch (palo) {
      case "0":
        palo = "picas";
        break;
      case "1":
        palo = "corazones";
        break;
      case "2":
        palo = "diamantes";
        break;
      case "3":
        palo = "tréboles";
        break;
    }
    
    System.out.println("La carta seleccionada al azar es " + carta + " de " + palo);

  }
}
