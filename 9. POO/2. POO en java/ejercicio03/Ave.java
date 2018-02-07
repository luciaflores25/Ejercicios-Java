package ejercicio03;

/**
 *
 * @author Usuario
 */
public class Ave extends Animal {
  int numHuevos;

  public Ave(String nombre) {
    super(nombre);
  }
  
  
  public void vuela(){
    System.out.println("yuhuuu, estoy volando");
  }
  
  public void pia(){
    System.out.println("pio pio pio pio");
  }
}
