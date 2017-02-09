/* Nombre: Lucía Flores Padilla
 * Fecha: 9 de febrero de 2017
 * Ejercicio 20 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio20 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int numero;
		System.out.println("Introduce un número como máximo de 5 dígitos para saber si es capicúa o no: ");
		numero = s.nextInt();
		
		if (numero < 10){
        System.out.println("El número es capicúo");
        
      } else if ((numero >= 10) && (numero < 100)) {
        if((numero %10) == (numero /10)) {
         System.out.println("El número es capicúo");
      
        } else {
         System.out.println("El número no es capicúo");
        }
        } else if ((numero >= 100) && (numero < 1000)) {
        if ((numero %10) == (numero /100)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        }
         
      } else if ((numero >= 1000) && (numero < 10000)) {
        if ((numero %10) == (numero /1000)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        }
        
      } else if ((numero >= 10000) && (numero < 100000)) {
        if ((numero %10) == (numero /10000)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        } 
        
      } else {
         System.out.println("El número es superior a 5 cifras");
        }

		
		
		
	}//Cierra el public static
	
}//Cierra el public class
