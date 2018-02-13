package ejercicio04;

/**
 *
 * @author Lucía Flores
 */
public class Fraccion {

  private int num;
  private int den;
  private int signo;

  //Constructores
  public Fraccion() {
    num = 0;
    den = 1;
  }

  public Fraccion(int x, int y) {
    num = x;
    den = y;
  }

  //Getter and setter
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getDen() {
    return den;
  }

  public void setDen(int den) {
    this.den = den;
  }

  public int getSigno() {
    return signo;
  }

  public void setSigno(int signo) {
    this.signo = signo;
  }
  
  

  //To String
  @Override
  public String toString() {
    return "Fraccion: " + num + "/" + den;
  }

  //Métodos
  //Invertir una fracción
  public Fraccion invierte() {
    return new Fraccion(this.den, this.num);
  }

  //Simplificar una fracción
  public Fraccion simplifica() {
    int s = this.signo;
    int n = this.num;
    int d = this.den;

    for (int i = 2; i < Math.min(this.num, this.den); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
    return new Fraccion(n, d);
  }
  //Multiplicar fracciones
  public Fraccion multiplica(int num, int den) {
    int resultado1 = this.num * num;
    int resultado2 = this.num * den;
    return new Fraccion(resultado1, resultado2);
  }
  
  //Divide fracciones
  public Fraccion divide(int num, int den) {
    int resultado1 = this.num * den;
    int resultado2 = this.den * num;
    return new Fraccion(resultado1, resultado2);
  }

}
