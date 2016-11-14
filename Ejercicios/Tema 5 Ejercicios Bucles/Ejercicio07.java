public class Ejercicio07 {
  public static void main(String[] args) {
     
   int intentos = 4;
   int combinacion;
   boolean acierto = false;
    
    do {
      
      System.out.print("Introduce la contraseña de 4 dígitos para abrir la caja fuerte: ");
      combinacion = Integer.parseInt(System.console().readLine());
      
          
      if (combinacion == 1997) {
        acierto = true;
      } else {
        System.out.println("La contraseña es incorrecta");
      }
        
        intentos--;
        
        } while ((intentos > 0) && (!acierto));
       
        if (acierto) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Lo siento, ya no quedan oportunidades, la caja fuerte se ha bloqueado.");
        
    }
  }
}
