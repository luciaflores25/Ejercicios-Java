import java.util.Scanner;
public class Ejercicio14{
  public static void main (String[] args){
Scanner teclado = new Scanner(System.in);
    
    int base=0;
    int exponente=0;
    int resultado =1;
    
    System.out.println("En este programa con una base y un exponente");
    System.out.println("(el exponente tiene que ser entero y positivo) se va a mostrar la potencia.");
    System.out.println("Introduce la base: ");
    base=teclado.nextInt();
    
    teclado.nextLine();
    
    System.out.println("Introduce el exponente");
    exponente=teclado.nextInt();
    
    teclado.nextLine();
    
    for(int i=0;i<exponente;i++){
        
        resultado = resultado*base;
        
    }
    
    System.out.println("El resultado es: " + resultado);
  }
} 
