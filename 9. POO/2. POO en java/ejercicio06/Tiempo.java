package ejercicio06;

/**
 *
 * @author Lucía Flores
 */
public class Tiempo {

  //Atributos
  private int horas;
  private int minutos;
  private int segundos;

  //Constructores
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  //Getter and setter
  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  //to String
  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }

  //Método suma de tiempo
  public Tiempo suma(Tiempo otroTiempo) {

    int segundos = this.segundos + otroTiempo.getSegundos();
    int minuutos = this.minutos;
    int horas = this.horas;
    if (segundos > 59) {
      segundos -= 60;
      minutos++;
    }
    minutos += otroTiempo.getMinutos();
    if (minutos > 59) {
      minutos -= 60;
      horas++;
    }
    horas += otroTiempo.getHoras();
    return new Tiempo(horas, minutos, segundos);
  }

  //Método resta de tiempo
  public Tiempo resta(Tiempo otroTiempo) {

    if (this.horas < otroTiempo.getHoras()) {
      System.out.println("Lo siento, no se puede quitar más otroTiempo");
      return new Tiempo(0, 0, 0);
    } else {

      int segundos = this.segundos;
      int minutos = this.minutos;
      int horas = this.horas - otroTiempo.getHoras();

      if (minutos < otroTiempo.getMinutos()) {
        horas--;
        minutos = otroTiempo.getMinutos() - minutos;
      } else {
        minutos -= otroTiempo.getMinutos();
      }
      if (segundos < otroTiempo.getSegundos()) {
        minutos--;
        segundos = otroTiempo.getSegundos() - segundos;
      } else {
        segundos -= otroTiempo.getSegundos();
      }

      return new Tiempo(horas, minutos, segundos);
    }
  }
}
