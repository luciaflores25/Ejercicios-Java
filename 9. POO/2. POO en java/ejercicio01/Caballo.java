package ejercicio01;
/**
 *
 * @author Lucía Flores
 */
public class Caballo {
  
  private static int numeroTotalDeCaballos;
  private static int kilometrajeTotal;
  
  private String nombre;
  private String sexo;
  private double peso;//peso en kg
  private int altura;//altura en cm
  private String color;
  private int velocidad = 0;
  private String raza;
  private String sillaDeMontar;
  private Persona jinete;
  
  public Caballo() {
    
  }

  public Caballo(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getSillaDeMontar() {
    return sillaDeMontar;
  }

  public void setSillaDeMontar(String sillaDeMontar) {
    this.sillaDeMontar = sillaDeMontar;
  }

  public Persona getJinete() {
    return jinete;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  
  
  
  public Caballo seApareaCon(Caballo pareja, String nombreSiEsMacho, String nombreSiEsHembra){
    if(this.sexo.equals(pareja.getSexo())){
      System.out.println("Lo siento, no podemos tener crías");
      return null;
    }else{
      System.out.println();
      Caballo cria = new Caballo();
      
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
  

  @Override
  public String toString() {
    return "Caballo\n --------\n" 
            + "nombre: " + nombre 
            + "\nsexo: " + sexo
            /*+ "\npeso: " + peso 
            + "\naltura: " + altura 
            + "\ncolor: " + color 
            + "\nvelocidad: " + velocidad 
            + "\nraza: " + raza 
             
            + "\nsillaDeMontar: " + sillaDeMontar*/;
  }
  
  
}


