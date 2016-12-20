/**
 *
 * @author Lucía Flores Padilla
 *
 */
public class Ejercicio01 {
  public static void main(String[] args) {
  
    int [] [] num = new int [3] [6];
            num [0] [0] = 0;
            num [1] [0]  = 75;
            num [0] [1] = 30;
            num [0] [2] = 2;
            num [2] [2] = -2;
            num [2] [3] = 9;
            num [1] [4] = 0;
            num [0] [5] = 5;
            num [2] [5] = 11;
            
        System.out.print("Número: ");

        for (int  x = 0; x <= 5; x++) {
          System.out.print("Columna:" + x + "  ");
         }
          System.out.println();

       for(int i = 0;  i <= 2; i++) {
          for (int  x = 0; x <= 6; x++) {
           if (x == 0) {
              System.out.print("Fila:" + i + "  ");
           } else {
               System.out.print("    " +   num[i][x - 1]  + "     ");
           }
         }
          System.out.println();
       }
    }  
}
