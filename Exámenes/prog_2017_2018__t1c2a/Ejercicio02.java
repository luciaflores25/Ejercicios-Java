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
    
    int tempMaxPrimavera;
    int tempMinPrimavera;
    int tempMaxVerano;
    int tempMinVerano;
    int tempMaxOtono;
    int tempMinOtono;
    int tempMaxInvierno;
    int tempMinInvierno;
    int porcentaje = (int)(Math.random()*10 + 1);
    
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
    
    System.out.println("\nPrevisión del tiempo para mañana");
    System.out.println("----------------------------------");
    
    switch(estacion){
      case 1: 
        do{
          tempMaxPrimavera = (int)(Math.random()*(tempMaxima[0]-tempMinima[0]) + tempMinima[0]);
          tempMinPrimavera = (int)(Math.random()*(tempMaxima[0]-tempMinima[0]) + tempMinima[0]);
        }while(tempMaxPrimavera < tempMinPrimavera);
        System.out.println("Temperatura mínima: " + tempMinPrimavera);
        System.out.println("Temperatura máxima: " + tempMaxPrimavera);
        switch(porcentaje){
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.println("Soleado");
            break;
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
            break;
        }
        break;
      case 2: 
        do{
          tempMaxVerano = (int)(Math.random()*(tempMaxima[1]-tempMinima[1]) + tempMinima[1]);
          tempMinVerano = (int)(Math.random()*(tempMaxima[1]-tempMinima[1]) + tempMinima[1]);
        }while(tempMaxVerano < tempMinVerano);
        System.out.println("Temperatura mínima: " + tempMinVerano);
        System.out.println("Temperatura máxima: " + tempMaxVerano);
        switch(porcentaje){
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
            System.out.println("Soleado");
            break;
          case 9:
          case 10:
            System.out.println("Nublado");
            break;
        }
        break;
      case 3: 
        do{
          tempMaxOtono = (int)(Math.random()*(tempMaxima[2]-tempMinima[2]) + tempMinima[2]);
          tempMinOtono = (int)(Math.random()*(tempMaxima[2]-tempMinima[2]) + tempMinima[2]);
        }while(tempMaxOtono < tempMinOtono);
        System.out.println("Temperatura mínima: " + tempMinOtono);
        System.out.println("Temperatura máxima: " + tempMaxOtono);
        switch(porcentaje){
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.println("Soleado");
            break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
            break;
        }
        break;
      case 4: 
        do{
          tempMaxInvierno = (int)(Math.random()*(tempMaxima[3]-tempMinima[3]) + tempMinima[3]);
          tempMinInvierno = (int)(Math.random()*(tempMaxima[3]-tempMinima[3]) + tempMinima[3]);
        }while(tempMaxInvierno < tempMinInvierno);
        System.out.println("Temperatura mínima: " + tempMinInvierno);
        System.out.println("Temperatura máxima: " + tempMaxInvierno);
        switch(porcentaje){
          case 1:
          case 2:
            System.out.println("Soleado");
            break;
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
            break;
        }
        break;
    }
  }
}
