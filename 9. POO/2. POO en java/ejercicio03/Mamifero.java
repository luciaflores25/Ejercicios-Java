package ejercicio03;
/**
 *
 * @author Lucía Flores
 */
public class Mamifero extends Animal {
  int numMamas;
  int tiempoGestacion;

  public Mamifero(int numMamas, int tiempoGestacion, String nombre) {
    super(nombre);
    this.numMamas = numMamas;
    this.tiempoGestacion = tiempoGestacion;
  }
  
  public Mamifero(String nombre) {
    super(nombre);
  }

  public void amamanta(Gato gatito){
    System.out.println(this.nombre + " está amamantando a " + gatito.nombre);
  }
}
