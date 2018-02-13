package ejercicio02;
/**
 *
 * @author Lucia Flores
 */
public class Bicicleta extends Vehiculo {
  
  private static int kilometrosRecorridos = 0;
  
  //Atributos
  private int tamanoRueda; //Tamaño de las ruedas en pulgadas
  private int numPiñones;
  private int numMarchas;
  private String tipoBicicleta; //Montaña, carretera, carrera
  
  //Constructores

  public Bicicleta() {
  }

  public Bicicleta(String tipoBicicleta) {
    this.tipoBicicleta = tipoBicicleta;
  }
  
  //Getter and setter

  public int getTamanoRueda() {
    return tamanoRueda;
  }

  public void setTamanoRueda(int tamanoRueda) {
    this.tamanoRueda = tamanoRueda;
  }

  public int getNumPiñones() {
    return numPiñones;
  }

  public void setNumPiñones(int numPiñones) {
    this.numPiñones = numPiñones;
  }

  public int getNumMarchas() {
    return numMarchas;
  }

  public void setNumMarchas(int numMarchas) {
    this.numMarchas = numMarchas;
  }

  public String getTipoBicicleta() {
    return tipoBicicleta;
  }

  public void setTipoBicicleta(String tipoBicicleta) {
    this.tipoBicicleta = tipoBicicleta;
  }

  public static int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public static void setKilometrosRecorridos(int kilometrosRecorridos) {
    Bicicleta.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  
  
  public void recorre(int km){
    Bicicleta.kilometrosRecorridos += km;
    Vehiculo.setKilometrosTotales(km);
  }
  
}
