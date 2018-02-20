package ex14lfp;

/**
 *
 * @author Lucía Flores
 */
public class Terminal {
  
  //Atributos
  private int tiempoConversacion = 0;
  private int tiempoConversacionTotal = 0;
  private String numero;
  
  //Constructor
  public Terminal(String numero) {
    this.numero = numero;
  }
  
  //setter 

  public void setTiempoConversacionTotal(int tiempoConversacionTotal) {
    this.tiempoConversacionTotal = tiempoConversacionTotal;
  }
  

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }
  
  //getter

  public int getTiempoConversacionTotal() {
    return tiempoConversacionTotal;
  }
  
  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public String getNumero() {
    return numero;
  }
  
  //toString

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacionTotal + "s de conversación";
  }

  void llama(Terminal otroTerminal, int tiempo) {
    this.tiempoConversacion += tiempo;
    this.tiempoConversacionTotal += tiempo;
    otroTerminal.tiempoConversacionTotal += tiempo;
  }
  
  
  
}
