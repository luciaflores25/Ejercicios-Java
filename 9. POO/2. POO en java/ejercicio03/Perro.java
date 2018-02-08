package ejercicio03;
/**
 *
 * @author Lucía Flores
 */
public class Perro extends Mamifero {

  //Constructores
  
  public Perro(){
    
  }
  
  public Perro(int numMamas, int tiempoGestacion, String nombre) {
    super(numMamas, tiempoGestacion, nombre);
  }

  //Métodos
  
  public void ladra(){
    System.out.println("guauu guauu");
  }
  
  public void aulla(){
    System.out.println("auuuuu");
  }
}
