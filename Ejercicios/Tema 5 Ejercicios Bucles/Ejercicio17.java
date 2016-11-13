import java.util.Scanner;
public class Ejercicio17{
  public static void main (String[] args){
Scanner teclado = new Scanner(System.in);
    
  int numero=0;
  int suma=0;
  
    do{
      
    System.out.print("Introduce un numero y se le sumarán los siguientes 100 números: ");
    numero = teclado.nextInt();
    
    teclado.nextLine();
    
    if(numero < 0){
      
    System.out.println("El número tiene que ser entero y positivo, introduce otro número: ");
      
  }
    
    }while(numero < 0);
  
    
    
    for(int i=numero+1;i<numero+100;i++){
    
    suma+=i;
        
    }
    System.out.println(suma);
  }
  
}
