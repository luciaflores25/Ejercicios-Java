package prog_2017_2018__t2c1a;

/**
 *
 * @author Lucía Flores
 */
public class FichaDomino {

  //Atributos
  private int lado1;
  private int lado2;

  //Constructor
  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  //Getter and setter
  public int getLado1() {
    return lado1;
  }

  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  public int getLado2() {
    return lado2;
  }

  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }

  //toString
  @Override
  public String toString() {
    
    //Hacer que no salga el 0 cuando
    
    String lado = " ";
    if(lado1== 0){
      return "[" + lado + "|" + lado2 + "]";
    } else if (lado2 == 0){
      return "[" + lado1 + "|" + lado + "]";
    }else{
      return "[" + lado1 + "|" + lado2 + "]";
    }
  }

  //Métodos
  public FichaDomino voltea() {
    return new FichaDomino(this.lado2, this.lado1);

  }
  
  public boolean encaja(FichaDomino f){
    
    if(this.lado1 == (f.getLado1()) || (this.lado2 == (f.getLado2()))){
      return true;
    }else{
      return false;
    }//Cierra el if
  }
  
  public void generarSecuencia(){
    
  }

}
