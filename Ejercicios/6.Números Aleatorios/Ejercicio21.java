/*@author Lucía Flores Padilla
 * Fecha: 10 de mayo de 2017
 * Ejercicio 21 Números Aleatorios
 * Programación
 */
  
public class Ejercicio21 {

  public static void main(String[] args){
    
    int num;
    int num2;
    String moneda;
    moneda = "";
    
    
    for (int i = 0; i < 5; i++) {
      
      num = (int)(Math.random()*8);
      num2 = (int)(Math.random()*2);
      
      switch (num) {
        
        case 0:
          moneda = "1 centimo";
          break;
        case 1:
          moneda = "2 centimos";
          break;
        case 2:
          moneda = "5 centimos";
          break;
        case 3:
          moneda = "10 centimos";
          break;
        case 4:
          moneda = "20 centimos";
          break;
        case 5:
          moneda = "50 centimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
      }
      if (num2 == 0) {
        
        System.out.println(moneda + "  ha salido cara");
      } else {
        System.out.println(moneda + "  ha salido cruz");
      }
    }
  }
}
