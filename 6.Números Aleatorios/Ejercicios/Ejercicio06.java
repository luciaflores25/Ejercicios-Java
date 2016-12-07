/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio06 {

  public static void main(String[] args){
    

    int numero = (int)(Math.random() * 101 + 0);
    int contador = 1;
    
    System.out.print("Intente adivinar el número entero de 0 a 100 que he pensado, tienes 5 oportunidades: ");
    int numeroIntento = Integer.parseInt(System.console().readLine());
    
    while (numero != numeroIntento && contador < 5) {
      System.out.print("Ese no es el número que estoy pensando, siga intentándolo, introduzca otro número: ");
      numeroIntento = Integer.parseInt(System.console().readLine());
      contador++;
    }
    
    if (contador >= 5) {
      System.out.print("\nNo lo ha adivinado en 5 oportunidades, lo siento");
    } else {
      System.out.print("\n¡Correcto ese el el número que había pensado!");
    }
    
  }
}
