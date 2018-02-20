package ex14lfp;

/**
 *
 * @author Lucía Flores
 */
public class Movil extends Terminal{
  
  //Atributos
  private String tarifa;
  private double coste;
  
  //Constructor

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
  }
  
  //setter

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }

  public void setCoste(double coste) {
    this.coste = coste;
  }
  
  //getter

  public String getTarifa() {
    return tarifa;
  }

  public double getCoste() {
    return coste;
  }
  
  //toString
  @Override
  public String toString() {
    
    if(this.tarifa.equals("rata")){
      this.coste = 0.001 * getTiempoConversacion();
    }
    
    if(this.tarifa.equals("mono")){
      this.coste = 0.002 * getTiempoConversacion();
    }
    
    if(this.tarifa.equals("bisonte")){
      this.coste = 0.005 * getTiempoConversacion();
    }
    
    return "Nº " + getNumero() + " - " + getTiempoConversacionTotal() + "s de conversación"
            + " - tarificados " + coste + " euros" ;
  }
  
}
