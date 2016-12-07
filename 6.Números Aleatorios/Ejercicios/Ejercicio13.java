/**
 *
 * @author Lucía Flores Padilla
 *
 */
  
public class Ejercicio13 {

  public static void main(String[] args){
    
    System.out.println("En este programa se tirarán dos dados y no parará ");
    System.out.println("hasta que los dados tengan el mismo valor");
    
    System.out.println("-----------------------------------------------------");
    
    int contador = 1;
    
    boolean valor = false;
    
    int dadoUno = 0;
    int dadoDos = 0;
    
    while (valor == false) {
      System.out.println("\nTirada " + contador);
      dadoUno = (int)((Math.random() * 6) + 1);
      dadoDos = (int)((Math.random() * 6) + 1);
      
      System.out.println("\nDado 1 = " + dadoUno);
      System.out.println("Dado 2 = " + dadoDos);
      
      if (dadoUno == dadoDos) {
        valor = true;
      }
      contador++;
    }
  }
}
