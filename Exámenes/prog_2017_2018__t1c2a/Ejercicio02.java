/**
 * Programación
 * Primer Trimestre, Exámen 2, Desarrollo de Aplicaciones Multiplataforma (DAM)
 * 7 de diciembre de 2017
 * Ejercicio 2
 * 
 * 2. Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas
      máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos
      absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado o
      nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá
      ser menor o igual que la temperatura máxima.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(s.nextLine());
    
    int[] tempMinima = new int[4];
    tempMinima[0] = 15;
    tempMinima[1] = 25;
    tempMinima[2] = 20;
    tempMinima[3] = 0;
    
    int[] tempMaxima = new int[4];
    tempMaxima[0] = 30;
    tempMaxima[1] = 45;
    tempMaxima[2] = 30;
    tempMaxima[3] = 25;
    
    switch(estacion){
      case 1: 
      break;
    }
  }
}
