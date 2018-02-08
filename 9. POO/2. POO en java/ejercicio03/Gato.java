package ejercicio03;
/**
 *
 * @author Lucía Flores
 */
public class Gato extends Mamifero {

  //Constructores
  
  public Gato(){
    
  }
  
  public Gato(String nombre) {
    super(nombre);
  }

  //Métodos
  
  public void maulla(){
    System.out.println("miauuuuuu");
  }
  
  public void ronronea(){
    System.out.println("rrrrrrrrrrr");
  }
  
  
}
