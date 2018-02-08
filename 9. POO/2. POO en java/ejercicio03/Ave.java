package ejercicio03;
/**
 *
 * @author Lucía Flores
 */
public class Ave extends Animal {
  
  private static int numeroHuevos = 0;
  private static int numeroTotalHuevos = 0;

  
  //Constructores
  
  public Ave(){
    
  }
  
  public Ave(String nombre) {
    super(nombre);
  }

  //Getter and setter
  
  public static int getNumeroHuevos() {
    return numeroHuevos;
  }

  public static void setNumeroHuevos(int numeroHuevos) {
    Ave.numeroHuevos = numeroHuevos;
  }

  public static int getNumeroTotalHuevos() {
    return numeroTotalHuevos;
  }

  public static void setNumeroTotalHuevos(int numeroTotalHuevos) {
    Ave.numeroTotalHuevos = numeroTotalHuevos;
  }
  
  
  
  //Métodos
  
  public void vuela(){
    System.out.println("yuhuuu, estoy volando");
  }
  
  public void pia(){
    System.out.println("pio pio pio pio");
  }
}
