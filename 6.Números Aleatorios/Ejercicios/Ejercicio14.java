/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio14 {

  public static void main(String[] args){
    
    System.out.println("Piensa en un número a ver si lo adivino.....");
    System.out.println("El número tiene que ser entre 0 y 100: ");
    
    int numero = (int)(Math.random() * 101);
    int menor = 0;
    int mayor = 100;
    
    boolean acierto = false;
    
    int intentos = 5;
    
    while (acierto == false && intentos > 0) {

    System.out.println("Tengo " + intentos + " intentos... vamos ayá!");
    
    System.out.println("\n¿Estás pensando en el " + numero + "?");
    
    String respuesta = System.console().readLine();
    
    switch (respuesta) {
      case "si":
        System.out.println("Bien, lo he acertado");
        acierto = true;
        break;
      case "no":
        System.out.println("¿Es menor o mayor?");
        
        String respuesta2 = System.console().readLine();
        
          switch (respuesta2) {
            case "menor":
            mayor = numero;
              numero = (int)(Math.random() * ((mayor - 1) - menor) + menor + 1);
              break;
            case "mayor":
            menor = numero;
              numero = (int)(Math.random() * ((mayor - 1) - menor) + menor + 1);
              break;
            }
        break;
      }
      intentos--;
      
      if (intentos == 0 && acierto == false) {
        System.out.println("Vaya.... no he conseguido acertarlo ;(");
      }
      System.out.println();
    }
        
      
  }
}
