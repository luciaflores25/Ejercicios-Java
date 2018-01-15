/**
 * 
 * @author Lucía Flores Padilla
 * 
 */
 
import java.util.Scanner;
import matematicas.ManejoMatematicas;

public class PruebaMatematicas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ///////////////  PRUEBA EJERCICIO 1 /////////////////
    
    System.out.print("Introduce un número y te diré si es o no capicúa: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    if (matematicas.ManejoMatematicas.esCapicua(numeroIntroducido)) {
      System.out.println("El número que has introducido es capicúa.");
    }else{
      System.out.println("El número que has introducido no es capicúa");
    }
    System.out.println();
    
    ///////////////  PRUEBA EJERCICIO 2 /////////////////
    
    System.out.print("Introduce un número y te diré si es o no primo: ");
    int numeroIntroducido2 = Integer.parseInt(s.nextLine());
    
    if (matematicas.ManejoMatematicas.esPrimo(numeroIntroducido2)) {
      System.out.println("El número que has introducido es primo.");
    }else{
      System.out.println("El número que has introducido no es primo");
    }
    
    ///////////////  PRUEBA EJERCICIO 3 /////////////////
    
    System.out.println("\nIntroduce un número y te dire cuál es el siguiente primo: ");
    int numeroIntroducido3 = Integer.parseInt(s.nextLine());
    
    int siguiente = matematicas.ManejoMatematicas.siguientePrimo(numeroIntroducido3);
    
    System.out.println("El siguiente primo de " + numeroIntroducido3 + " es " + siguiente);
    
    ///////////////  PRUEBA EJERCICIO 4 /////////////////
    
    System.out.print("\nIntroduce un número (base): ");
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora Introduce otro número (exponente): ");
    int exponente = Integer.parseInt(s.nextLine());
    
    int potencia = matematicas.ManejoMatematicas.potencia(base, exponente);
    
    System.out.println("La potencia de " + base + " elevado a " + exponente + " es "  + potencia);
    
     ///////////////  PRUEBA EJERCICIO 5 /////////////////
     
     System.out.print("\nIntroduce un número y te diré cuantos dígitos tiene: ");
     int numeroIntroducido4 = Integer.parseInt(s.nextLine());
     
     int cuentaDigito = matematicas.ManejoMatematicas.digitos(numeroIntroducido4);
     
     System.out.println("El " + numeroIntroducido4 + " tiene " + cuentaDigito + " dígitos");
     
     ///////////////  PRUEBA EJERCICIO 6 /////////////////
     
     System.out.print("\nIntroducé un número y te lo voltearé: ");
     int numeroIntroducido5 = Integer.parseInt(s.nextLine());
     
     int volteado = matematicas.ManejoMatematicas.voltea(numeroIntroducido5);
     
     System.out.println("Tu número volteado es " + volteado);
     
     ///////////////  PRUEBA EJERCICIO 7 /////////////////
     
     System.out.print("\nIntroduce un número (mínimo 2 cifras): ");
     int numeroIntroducido6 = Integer.parseInt(s.nextLine());
     
     System.out.print("Ahora introduce una posición de ese número y te diré qué número está ahi: ");
     int posicion = Integer.parseInt(s.nextLine());
     
     int posicionDelDigito = matematicas.ManejoMatematicas.digitoN(numeroIntroducido6, posicion);
     
     System.out.println("En esa posición está el " + posicionDelDigito);
     
     ///////////////  PRUEBA EJERCICIO 8 /////////////////
     
     System.out.print("\nIntroduce un número: ");
     int numeroIntroducido7 = Integer.parseInt(s.nextLine());
     
     System.out.print("Ahora introduce un número (1 cifra): ");
     int cifra = Integer.parseInt(s.nextLine());
     
     int ocurrencia = matematicas.ManejoMatematicas.posicionDeDigito(numeroIntroducido7, cifra);
     
     if(ocurrencia == -1){
       System.out.println("El número " + cifra + " no se encuentra");
     }else{
       System.out.println("El número " + cifra + " aparece primero en la posición " + ocurrencia);
     }
     
     ///////////////  PRUEBA EJERCICIO 9 /////////////////
     
     System.out.print("\nIntroduce un número largo: ");
     long numeroIntroducido8 = Long.parseLong(s.nextLine());
     
     System.out.print("¿Cuántos dígitos le quieres quitar al número por detrás?: ");
     long quitarDetras = Long.parseLong(s.nextLine());
     
     long resultadoDetras = matematicas.ManejoMatematicas.quitarPorDetras(numeroIntroducido8, quitarDetras);
     
     System.out.println("Este es tu número acortado: " + resultadoDetras);
     
     ///////////////  PRUEBA EJERCICIO 10  /////////////////
     
     System.out.print("\nIntroduce un número largo: ");
     int numeroIntroducido9 = Integer.parseInt(s.nextLine());
     
     System.out.print("¿Cuántos dígitos le quieres quitar al número por delante?: ");
     int quitarDelante = Integer.parseInt(s.nextLine());
     
     int resultadoDelante = matematicas.ManejoMatematicas.quitarPorDelante(numeroIntroducido9, quitarDelante);
     
     System.out.println("Este es tu número acortado: " + resultadoDelante);
    
  }
}

