package ejercicio03;

/**
 *
 * @author Lucía Flores
 */
public class Animal {

  //Atributos
  
  private String nombre;
  private String raza;
  private String color;
  private String sexo;
  private int altrua;
  private double peso;

  //Constructores
  
  public Animal(){
    
  }
  
  public Animal(String nombre) {
    this.nombre = nombre;
  }

  //Setter and getter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getAltrua() {
    return altrua;
  }

  public void setAltrua(int altrua) {
    this.altrua = altrua;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  //Métodos
    
    //Crías de gatos
  public Gato seApareaCon(Gato pareja, String nombreSiEsMacho, String nombreSiEsHembra){
    if(this.sexo.equals(pareja.getSexo())){
      System.out.println("Lo siento, no podemos tener crías");
      return null;
    }else{
      System.out.println();
      Gato cria = new Gato();
      
      if((int)(Math.random()*2)==0){
        cria.setSexo("hembra");
        cria.setNombre(nombreSiEsHembra);
      }else{
        cria.setSexo("macho");
        cria.setNombre(nombreSiEsMacho);
      }
      return cria;
    }
  }
  
    //Crías de perros
  
  public Perro seApareaCon(Perro pareja, String nombreSiEsMacho, String nombreSiEsHembra){
    if(this.sexo.equals(pareja.getSexo())){
      System.out.println("Lo siento, no podemos tener crías");
      return null;
    }else{
      System.out.println();
      Perro cria = new Perro();
      
      if((int)(Math.random()*2)==0){
        cria.setSexo("hembra");
        cria.setNombre(nombreSiEsHembra);
      }else{
        cria.setSexo("macho");
        cria.setNombre(nombreSiEsMacho);
      }
      return cria;
    }
  }
  
  //Amamantar gatos
  
  public void amamanta(Gato gatito){
    if(this.sexo.equals("macho")){
      System.out.println("Lo siento, los machos no pueden amamantar a las crías");
      
    }else{
     System.out.println(this.nombre + " está amamantando a " + gatito.getNombre());
    }
  }
  
  //Amamantar perros
  
  public void amamanta(Perro perrito){
    if(this.sexo.equals("macho")){
      System.out.println("Lo siento, los machos no pueden amamantar a las crías");
      
    }else{
      System.out.println(this.nombre + " está amamantando a " + perrito.getNombre());
    }
  }

  //toString
  @Override
  public String toString() {
    return "Animal\n ---------\n"
            + "nombre=" + nombre
            + ", raza=" + raza
            + ", color=" + color
            + ", sexo=" + sexo
            + ", altrua=" + altrua
            + ", peso=" + peso + '}';
  }

}
