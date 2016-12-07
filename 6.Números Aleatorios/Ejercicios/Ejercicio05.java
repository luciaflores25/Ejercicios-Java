/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio05 {

  public static void main(String[] args){
    

    int maximo = 0;
    int minimo = 200;
    int suma = 0;
    
    for (int i = 1; i <= 50; i++) {
      int numero = (int)(Math.random() * 100 + 100);
      System.out.print(numero + " ");
      
      if (numero > maximo){
        maximo = numero;
      }
      
      if (numero < minimo){
        minimo = numero;
      }
      suma += numero;
    }
    
    System.out.println("\n\nEl máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("La media es: " + ((double)suma / (double)50));
    
  }
}
