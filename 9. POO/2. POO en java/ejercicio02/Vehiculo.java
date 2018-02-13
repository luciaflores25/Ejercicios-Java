package ejercicio02;
/**
 *
 * @author Lucía Flores
 */
public class Vehiculo {
  
  private static int kilometrosTotales = 0;
  private static int vehiculosTotales = 0;
  
  //Atributos
  private String marca;
  private String modelo;
  private String color;
  private int recorreKM;
  private int numRuedas;
  
  //Constructores

  public Vehiculo() {
  }
  
  public Vehiculo(String marca) {
    this.marca = marca;
  }

  public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }
  
  //Getter and setter

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getRecorreKM() {
    return recorreKM;
  }

  public void setRecorreKM(int recorreKM) {
    this.recorreKM = recorreKM;
  }

  public int getNumRuedas() {
    return numRuedas;
  }

  public void setNumRuedas(int numRuedas) {
    this.numRuedas = numRuedas;
  }

  public static int getVehiculosTotales() {
    return vehiculosTotales;
  }

  public static void setVehiculosTotales(int vehiculosTotales) {
    Vehiculo.vehiculosTotales = vehiculosTotales;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales += kilometrosTotales;
  }
  
  //Métodos
  
  public void cuentaVehiculos(int contador){
    Vehiculo nuevo = new Vehiculo();
    contador++;
  }
  
  public void hacerCaballito(){
    System.out.println("Que guay!! Estoy haciendo el caballito");
  }
  
  public void quemarRueda(){
    System.out.println("ffssssshhhhhhhhhhhhhhhhgggggggggrrrssssssss");
  }
  
}
