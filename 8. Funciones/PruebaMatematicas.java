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
    
    System.out.println("Introduce el número del ejercicio que quieres corregir (1-14)");
    int pruebas = Integer.parseInt(System.console().readLine());
    
    switch(pruebas) {
      case 1:
        ///////////////  PRUEBA EJERCICIO 1 /////////////////
        
        System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 1\n");
        
        System.out.print("Introduce un número y te diré si es o no capicúa: ");
        int numeroIntroducido = Integer.parseInt(s.nextLine());
        
        if (ManejoMatematicas.esCapicua(numeroIntroducido)) {
          System.out.println("El número que has introducido es capicúa.");
        }else{
          System.out.println("El número que has introducido no es capicúa");
        }
        break;
      case 2:
        ///////////////  PRUEBA EJERCICIO 2 /////////////////
    
        System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 2\n");
        
        System.out.print("Introduce un número y te diré si es o no primo: ");
        int numeroIntroducido2 = Integer.parseInt(s.nextLine());
        
        if (ManejoMatematicas.esPrimo(numeroIntroducido2)) {
          System.out.println("El número que has introducido es primo.");
        }else{
          System.out.println("El número que has introducido no es primo");
        }
        break;
      case 3:
        ///////////////  PRUEBA EJERCICIO 3 /////////////////
    
        System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 3\n");
        
        System.out.println("\nIntroduce un número y te dire cuál es el siguiente primo: ");
        int numeroIntroducido3 = Integer.parseInt(s.nextLine());
        
        int siguiente = ManejoMatematicas.siguientePrimo(numeroIntroducido3);
        
        System.out.println("El siguiente primo de " + numeroIntroducido3 + " es " + siguiente);
        break;
      case 4:
        ///////////////  PRUEBA EJERCICIO 4 /////////////////
    
        System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 4\n");
        
        System.out.print("\nIntroduce un número (base): ");
        int base = Integer.parseInt(s.nextLine());
        
        System.out.print("Ahora Introduce otro número (exponente): ");
        int exponente = Integer.parseInt(s.nextLine());
        
        int potencia = ManejoMatematicas.potencia(base, exponente);
        
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es "  + potencia);
        break;
      case 5:
        ///////////////  PRUEBA EJERCICIO 5 /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 5\n");
         
         System.out.print("\nIntroduce un número y te diré cuantos dígitos tiene: ");
         int numeroIntroducido4 = Integer.parseInt(s.nextLine());
         
         int cuentaDigito = ManejoMatematicas.digitos(numeroIntroducido4);
         
         System.out.println("El " + numeroIntroducido4 + " tiene " + cuentaDigito + " dígitos");
        break;
      case 6:
        ///////////////  PRUEBA EJERCICIO 6 /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 6\n");
         
         System.out.print("\nIntroducé un número y te lo voltearé: ");
         int numeroIntroducido5 = Integer.parseInt(s.nextLine());
         
         int volteado = ManejoMatematicas.voltea(numeroIntroducido5);
         
         System.out.println("Tu número volteado es " + volteado);
        break;
      case 7:
        ///////////////  PRUEBA EJERCICIO 7 /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 7\n");
         
         System.out.print("\nIntroduce un número (mínimo 2 cifras): ");
         int numeroIntroducido6 = Integer.parseInt(s.nextLine());
         
         System.out.print("Ahora introduce una posición de ese número y te diré qué número está ahi: ");
         int posicion = Integer.parseInt(s.nextLine());
         
         int posicionDelDigito = ManejoMatematicas.digitoN(numeroIntroducido6, posicion);
         
         System.out.println("En esa posición está el " + posicionDelDigito);
        break;
      case 8:
        ///////////////  PRUEBA EJERCICIO 8 /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 8\n");
         
         System.out.print("\nIntroduce un número: ");
         int numeroIntroducido7 = Integer.parseInt(s.nextLine());
         
         System.out.print("Ahora introduce un número (1 cifra): ");
         int cifra = Integer.parseInt(s.nextLine());
         
         int ocurrencia = ManejoMatematicas.posicionDeDigito(numeroIntroducido7, cifra);
         
         if(ocurrencia == -1){
           System.out.println("El número " + cifra + " no se encuentra");
         }else{
           System.out.println("El número " + cifra + " aparece primero en la posición " + ocurrencia);
         }
        break;
      case 9:
        ///////////////  PRUEBA EJERCICIO 9 /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 9\n");
         
         System.out.print("\nIntroduce un número largo: ");
         long numeroIntroducido8 = Long.parseLong(s.nextLine());
         
         System.out.print("¿Cuántos dígitos le quieres quitar al número por detrás?: ");
         long quitarDetras = Long.parseLong(s.nextLine());
         
         long resultadoDetras = ManejoMatematicas.quitarPorDetras(numeroIntroducido8, quitarDetras);
         
         System.out.println("Este es tu número acortado: " + resultadoDetras);
        break;
      case 10:
        ///////////////  PRUEBA EJERCICIO 10  /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 10\n");
         
         System.out.print("\nIntroduce un número largo: ");
         int numeroIntroducido9 = Integer.parseInt(s.nextLine());
         
         System.out.print("¿Cuántos dígitos le quieres quitar al número por delante?: ");
         int quitarDelante = Integer.parseInt(s.nextLine());
         
         int resultadoDelante = ManejoMatematicas.quitarPorDelante(numeroIntroducido9, quitarDelante);
         
         System.out.println("Este es tu número acortado: " + resultadoDelante);
        break;
      case 11:
        ///////////////  PRUEBA EJERCICIO 11  /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 11\n");
         
         System.out.print("\nIntroduce un número largo: ");
         int numeroIntroducido10 = Integer.parseInt(s.nextLine());
         
         System.out.print("Escribe un dígito para pegarselo por detrás al número: ");
         int pegarDetras = Integer.parseInt(s.nextLine());
         
         int resultadoPegaDetras = ManejoMatematicas.pegaPorDetras(numeroIntroducido10, pegarDetras);
         
         System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDetras);
        break;
      case 12:
        ///////////////  PRUEBA EJERCICIO 12  /////////////////
     
         System.out.println("HAS ELEGIDO LA PRUEBA DEL EJERCICIO 12\n");
         
         System.out.print("\nIntroduce un número largo: ");
         int numeroIntroducido11 = Integer.parseInt(s.nextLine());
         
         System.out.print("Escribe un dígito para pegarselo por delante al número: ");
         int pegarDelante = Integer.parseInt(s.nextLine());
         
         int resultadoPegaDelante = ManejoMatematicas.pegaPorDelante(numeroIntroducido11, pegarDelante);
         
         System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDelante);
        break;
      case 13:
        
        break;
      case 14:
        
        break;
      default:
      System.out.println("El ejercicio que has elegido no es correcto.");
    }
     
     
     
     
     
     
     
     
     
    
  }
}

