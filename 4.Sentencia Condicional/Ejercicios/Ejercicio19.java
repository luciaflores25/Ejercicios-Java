public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número igual o inferior a 5 (negativo o positivo) para saber cuantos digitos tiene: ");
    int n = Integer.parseInt(System.console().readLine());
      
      if (n<10 && n>-10){
        System.out.println("El número que se a introducido tiene 1 dígito");
      
      } else if ((n>=10 && n<100) || (n<=-10 && n>-100)) {
         System.out.println("El número que se  introducido tiene 2 digitos");
      
      } else if ((n>=100 && n<1000) || (n<=-100 && n>-1000)) { 
         System.out.println("El número que se a introducido tiene 3 dígitos");
      
      } else if ((n>=1000 && n<10000) || (n<=-1000 && n>-10000)) {
         System.out.println("El número que se a introducido tiene 4 dígitos");
      
      } else if ((n>=10000 && n<100000) || (n<=-10000 && n>-100000)) {
         System.out.println("El número que se a introducido tiene 5 dígitos");
        
        } else {
          System.out.println("Ha introducido un número mayor de 5 cifras");
        }
  }      
} 
