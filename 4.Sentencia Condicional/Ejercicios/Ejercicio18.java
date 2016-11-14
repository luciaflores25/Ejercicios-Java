public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número igual o inferior a 5 para saber cual es la primera cifra: ");
    int n = Integer.parseInt(System.console().readLine());
    
      if (n<10){
        System.out.println("La primera cifra del número es: " + n );
      
        } else if (n<100) {
          System.out.println("La primera cifra del número es: " + (n/10));
        } else if (n<1000) {
          System.out.println("La primera cifra del número es: " + (n/100));
        } else if (n<10000) {
          System.out.println("La primera cifra del número es: " + (n/1000));
        } else if (n<100000) {
          System.out.println("La primera cifra del número es: " + (n/10000));
        } else {
          System.out.println("El número introducido es superior a 5 cifras");
        } 
  }  
}      
