/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 3 números aleatorios
 * Programación
 */
  
public class Ejercicio03 {

  public static void main(String[] args){

    System.out.println("Este programa va a mostrar una carta de la baraja española al azar \n");
    
    String palo =  String.valueOf((int)(Math.random() * 4));
    String carta = String.valueOf((int)(Math.random() * 10 + 1));
    

    switch (carta) {
      case "8":
        carta = "sota";
        break;
      case "9":
        carta = "caballo";
        break;
      case "10":
        carta = "rey";
        break;
    }
    
    switch (palo) {
      case "0":
        palo = "oro";
        break;
      case "1":
        palo = "copas";
        break;
      case "2":
        palo = "espada";
        break;
      case "3":
        palo = "basto";
        break;
    }
    
    System.out.println("La carta seleccionada es " + carta + " de " + palo);
  }
}
