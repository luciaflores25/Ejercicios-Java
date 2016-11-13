import java.util.Scanner;
public class Ejercicio12{
  public static void main (String[] args){
Scanner teclado = new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    int aux;
    int secuencia;
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("                           ");
    System.out.print("Introduzca n: ");
    secuencia=teclado.nextInt();
    
    teclado.nextLine();
    
    if(secuencia == 1){
      System.out.println("0");
    }else if(secuencia == 2){
      System.out.println("0 1");
    }else {
      System.out.print("0 1");
         primerNumero = 0;
         segundoNumero = 1;
         
        while(secuencia > 2) {
            aux = primerNumero;
        primerNumero = segundoNumero;
            segundoNumero = aux + segundoNumero;
            System.out.print(" " + segundoNumero);
            secuencia--;
      }
    }
  }
}
