public class Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número de hasta 5 cifras para saber si es capicúo o no: ");
     int numero = Integer.parseInt(System.console().readLine());
      if (numero<10){
        System.out.println("El número es capicúo");
        
      } else if ((numero>=10) && (numero<100)) {
        if((numero%10) == (numero/10)) {
         System.out.println("El número es capicúo");
      
        } else {
         System.out.println("El número no es capicúo");
        }

      } else if ((numero>=100) && (numero<1000)) {
        if ((numero%10) == (numero/100)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        }
         
      } else if ((numero>=1000) && (numero<10000)) {
        if ((numero%10) == (numero/1000)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        }
        
      } else if ((numero>=10000) && (numero<100000)) {
        if ((numero%10) == (numero/10000)) {
         System.out.println("El número es capicúo");
         
        } else {
           System.out.println("El número no es capicúo");
        } 
        
      } else {
         System.out.println("El número es superior a 5 cifras");
        }
        
    }
} 
