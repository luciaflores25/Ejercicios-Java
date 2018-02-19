package prog_2017_2018__t2c1a;

/**
 *
 * @author Lucía Flores
 * 
 * Examen 1 Trimestre 2 Ejercicio 2 
 * 
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de 
    forma aleatoria, que encajen bien y que estén bien colocadas según el juego
    del dominó. No hay que controlar que si se repiten o no las fichas.
    Ejemplo:
    
    [6|1][1|4][4|4][4| ][ |3][3|2][2|6][6|5]
 * 
 * 
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    int lado1 = 0;
    int lado2 = 0;
    
    FichaDomino f1 = new FichaDomino(lado1, lado2);
    FichaDomino f2 = new FichaDomino(lado1, lado2);
    FichaDomino f3 = new FichaDomino(lado1, lado2);
    FichaDomino f4 = new FichaDomino(lado1, lado2);
    FichaDomino f5 = new FichaDomino(lado1, lado2);
    FichaDomino f6 = new FichaDomino(lado1, lado2);
    FichaDomino f7 = new FichaDomino(lado1, lado2);
    FichaDomino f8 = new FichaDomino(lado1, lado2);
    
          ///////ficha1 y ficha2
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f1.setLado1(lado1);
        f1.setLado2(lado2);
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f2.setLado1(lado1);
        f2.setLado2(lado2);
      }while(f1.getLado2() != f2.getLado1());
      
      /////ficha3
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f3.setLado1(lado1);
        f3.setLado2(lado2);
      }while(f2.getLado2() != f3.getLado1());
      
      /////ficha4
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f4.setLado1(lado1);
        f4.setLado2(lado2);
      }while(f3.getLado2() != f4.getLado1());
      
      /////ficha5
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f5.setLado1(lado1);
        f5.setLado2(lado2);
      }while(f4.getLado2() != f5.getLado1());
      
      /////ficha6
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f6.setLado1(lado1);
        f6.setLado2(lado2);
      }while(f5.getLado2() != f6.getLado1());
      
      /////ficha7
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f7.setLado1(lado1);
        f7.setLado2(lado2);
      }while(f6.getLado2() != f7.getLado1());
      
      /////ficha8
      do{
        lado1 = (int)(Math.random()*7);
        lado2 = (int)(Math.random()*7);
        f8.setLado1(lado1);
        f8.setLado2(lado2);
      }while(f7.getLado2() != f8.getLado1());
        
    System.out.println();
    
    System.out.print(f1);
    System.out.print(f2);
    System.out.print(f3);
    System.out.print(f4);
    System.out.print(f5);
    System.out.print(f6);
    System.out.print(f7);
    System.out.print(f8);
  }
  
}
