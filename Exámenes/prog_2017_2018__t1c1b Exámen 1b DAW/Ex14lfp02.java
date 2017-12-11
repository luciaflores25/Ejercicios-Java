/**
 * Programación
 * Examen 1 DAW Primer Trimestre
 * 14 de noviembre de 2017
 * Ejercicio 2
 * 
 * 2. Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
      introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
      número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
      media.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ex14lfp02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca diez números enteros positivos: ");
    int numero = 0;
    
    boolean esPrimo = true;
    int contadorPrimos = 0;
    int noPrimos = 0;
    double suma = 0;
    double media = 0.0;
    
    for(int i = 0;i < 10;i++){
      numero = Integer.parseInt(s.nextLine());
      
      int comprobacion = 0;
      esPrimo = true;//En el examen me ha faltado machacar esPrimo = true ;(
      for(int j = 2; j < numero; j ++) {
        comprobacion = numero % j;
        if (comprobacion == 0){
          esPrimo = false;
        }
      }
      if (esPrimo){
        esPrimo = true;
        suma += numero;
        contadorPrimos++;
      }
    }
    if (contadorPrimos > 0){
      media = suma / (double)contadorPrimos;
      System.out.println("La media de los primos es " + media);
    }else{
      System.out.print("No ha introducido ningún número primo, ");
      System.out.println("no puedo calcular la media");
    }
    System.out.println(contadorPrimos);
  }
}
