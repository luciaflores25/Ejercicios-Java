public class Ejercicio13 {
  public static void main(String[] args) {
    
    int a;
    int b;
    int c;
    
    System.out.print("Vamos a ordenar 3 números que introduciremos a continuacion por teclado. ");
    System.out.print("Introduce el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Y por último el tercer número: ");
    c = Integer.parseInt(System.console().readLine());
    
    if (a<b && a<c) {
      if (b<c) {
        System.out.print( a + " < " + b + " < " + c);
      } else {
        System.out.print( a + " < " + c + " < " + b);
      }  
      
       } else if(b<a && b<c) {
        if (a<c) {
         System.out.print( b + " < " + a + " < " + c);
        } else {
          System.out.print( b + " < " + c + " < " + a);
        }  
       } else if(c<a && c<b) {
        if (a<b) {
         System.out.print( c + " < " + a + " < " + b);
        } else {
          System.out.print( c + " < " + b + " < " + a);
         }
      }
      
   }   
}
