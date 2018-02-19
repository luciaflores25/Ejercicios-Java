package prog_2017_2018__t2c1a;

/**
 *
 * @author Lucía Flores
 * 
 * Examen 1 Trimestre 2 Ejercicio 1 
 * 
 * Implementa la clase FichaDomino. Una ficha de dominó tiene dos lados y en cada 
    lado hay un número del 1 al 6 o bien ningún número (blanco). Cuando se crea 
    una ficha, se proporcionan ambos valores. Dos fichas encajan si se pueden 
    colocar una al lado de la otra según el juego del dominó, por ejemplo, las 
    fichas [ 2 | 5 ] y [ 4 | 5 ] encajan porque se pueden colocar de la forma 
    [ 2 | 5 ] [ 5 | 4 ]. A continuación se proporciona el contenido del main 
    y el resultado que debe aparecer por pantalla.
    
    FichaDomino f1 = new FichaDomino(6, 1);
    FichaDomino f2 = new FichaDomino(0, 4);
    FichaDomino f3 = new FichaDomino(3, 3);
    FichaDomino f4 = new FichaDomino(0, 1);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f2.voltea());
    System.out.println(f2.encaja(f4));
    System.out.println(f1.encaja(f4));
    System.out.println(f1.encaja(f3));
    System.out.println(f1.encaja(f2));
    
    [6|1]
    [ |4]
    [3|3]
    [ |1]
    [4| ]
    true
    true
    false
    false
 * 
 * 
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    FichaDomino f1 = new FichaDomino(6, 1);
    FichaDomino f2 = new FichaDomino(0, 4);
    FichaDomino f3 = new FichaDomino(3, 3);
    FichaDomino f4 = new FichaDomino(0, 1);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f2.voltea());
    System.out.println(f2.encaja(f4));
    System.out.println(f1.encaja(f4));
    System.out.println(f1.encaja(f3));
    System.out.println(f1.encaja(f2));
  }
  
}
