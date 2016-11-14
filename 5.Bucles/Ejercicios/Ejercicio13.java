import java.util.Scanner;
public class Ejercicio13{
	public static void main (String[] args){
Scanner teclado = new Scanner(System.in);

    int contadorpositivo = 0;
    int contadornegativo = 0;
    int numero;
    
    for(int i=0;i<11;i++){
    
    numero = 0;
    
    System.out.print("Introduce un número entero positivo o negativo: ");
    numero=teclado.nextInt();
    
    teclado.nextLine();
    
    if(numero > 0){
        contadorpositivo++;
    }else if(numero < 0){
        contadornegativo++;
    }
    
    } System.out.println("               ");
      System.out.println("------------------------------------------------");
      System.out.println("               ");
    
    System.out.println("Has introducido " + contadorpositivo + " números positivos y " + contadornegativo + " números negativos");
  }
}
