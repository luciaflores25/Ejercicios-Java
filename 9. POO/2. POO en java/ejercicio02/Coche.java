package ejercicio02;

/**
 *
 * @author Lucía Flores
 */
public class Coche extends Vehiculo{
  
  private static int kilometrosRecorridos = 0;

  //Atributos
  private String numBastidor;
  private String matricula;
  private String numPuertas;
  private String combustible;
  
  //Constructores

  public Coche() {
  }
  
  public Coche(String marca) {
    super(marca);
  }
  
  //Getter and setter

  public String getNumBastidor() {
    return numBastidor;
  }

  public void setNumBastidor(String numBastidor) {
    this.numBastidor = numBastidor;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNumPuertas() {
    return numPuertas;
  }

  public void setNumPuertas(String numPuertas) {
    this.numPuertas = numPuertas;
  }

  public String getCombustible() {
    return combustible;
  }

  public void setCombustible(String combustible) {
    this.combustible = combustible;
  }

  public static int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public static void setKilometrosRecorridos(int kilometrosRecorridos) {
    Coche.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  //Métodos
  
  public void recorre(int km){
    Coche.kilometrosRecorridos += km;
    Vehiculo.setKilometrosTotales(km);
  }
  
  
  
  
}
