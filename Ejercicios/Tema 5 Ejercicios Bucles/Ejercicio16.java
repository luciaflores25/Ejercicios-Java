import java.util.Scanner;
public class Ejercicio16{
  public static void main (String[] args){
Scanner teclado = new Scanner(System.in);
    
  boolean es=true;
  int numero;
  int modulo;
  
  System.out.println("Introduce un número para saber si es primo o no:");
  numero = teclado.nextInt();
  
  teclado.nextLine();
  
  for(int i=2;i<numero-1;i++){
    modulo = numero % i;
    if(modulo==0){
      es=false;
    }
  }
    if(es){
      System.out.println("El numero es primo");
    }else
      System.out.println("El numero no es primo");

  }
}
