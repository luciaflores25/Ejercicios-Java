public class Ejercicio19 {
  public static void main (String[] args) {
    
    System.out.println("Vamos a dibujar una pirámide\n");
  
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaTotal = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter que se va a usar para dibujarla: ");
    char caracter = (System.console().readLine()).charAt(0);
    
    System.out.print("\n");
    
    for (int nivelActual = 1; nivelActual <= alturaTotal; nivelActual++) {
      
      for (int espacios = 1; espacios <= alturaTotal - nivelActual; espacios++) {
        System.out.print(" ");
      }
      
      for (int caracteres = 1; caracteres < 2 * nivelActual; caracteres++) {
        System.out.print(caracter);
      }
      
      System.out.print("\n");
    }
  }
}
