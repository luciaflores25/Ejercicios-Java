/*@author Lucía Flores Padilla
 * Fecha: 5 de abril de 2017
 * Ejercicio 10 números aleatorios
 * Programación
 */
  
public class Ejercicio10 {

  public static void main(String[] args){

System.out.println("Líneas con carácteres\n");

    String caracter;
    for (int i = 1; i <= 10; i++) {
      int longitudLinea = (int)(Math.random() * 40 + 1);
      
      for (int j = 1; j <= longitudLinea ; j++) {
        caracter = String.valueOf((int)(Math.random() * 6 + 1));
        
        switch (caracter) {
          case "1":
            caracter = "*";
            break;
          case "2":
            caracter = "+";
            break;
          case "3":
            caracter = "-";
            break;
          case "4":
            caracter = "$";
            break;
          case "5":
            caracter = "&";
            break;
          case "6":
            caracter = "@";
            break;
        }
        
        System.out.print(caracter);
      }
    System.out.println();
    }
  }
}
