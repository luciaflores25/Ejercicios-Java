package ex14lfp;

/**
 *
 * Exámen Programación 20/02/2018 
 * Ejercicio 2
 * 
 * @author Lucía Flores
 * 
 */
public class Ex14lfp02 {

  public static void main(String[] args) {
    Movil m1 = new Movil("678 11 22 33", "rata");
    Movil m2 = new Movil("644 74 44 69", "mono");
    Movil m3 = new Movil("622 32 89 09", "bisonte");
    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
  
}
