package ejercicio05;

/**
 *
 * @author Lucía Flores
 */
public class Pizza {

  //Atributos
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  private String tamano;
  private String tipo;
  private String estado;

  //Constructores
  public Pizza() {
  }

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.totalPedidas +=1;
  }

  //Getter and setter
  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  public String getTamano() {
    return tamano;
  }

  public void setTamano(String tamano) {
    this.tamano = tamano;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  //to String
  //Métodos
  @Override
  public String toString() {
    return "Pizza " + tipo + " " + tamano + ", " + estado;
  }

  //Métodos
  public void sirve() {
    if (this.estado.equals("servida")) {
      System.out.println("esa pizza ya se ha servido");
    } else {
      this.estado = "servida";
      Pizza.totalServidas +=1;
    }

  }

}
