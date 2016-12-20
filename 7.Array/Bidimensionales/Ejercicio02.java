/**
 *
 * @author Lucía Flores Padilla
 *
 */

import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Introduzca los números del array en cuatro filas y dos columnas:");
           int [] [] num = new int [4] [5];
           Scanner s = new Scanner (System.in);
           int sumatotal = 0;
           
           for (int x = 0;  x < 4; x++) { //Este for es para que se introduxcan los números
                for(int i = 0; i < 5; i++) {
                    System.out.print("Fila " + x + " y columna " + i + ": ");
                    num [x] [i] = Integer.parseInt(s.nextLine());
                }
            }
           
           
        System.out.print("         |");  
        for (int  x = 0; x < 6; x++) {
           if (x < 5) {
            System.out.print("Columna " + x + "|");
           } else {
            System.out.print("Sumatorio|"); 
           }
        }
          
        System.out.println();
          
        int sumafila = 0;
        for(int i = 0;  i < 4; i++) {
            for (int x = 0; x < 7; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else if ((x >= 1) && (x < 6)){
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                    sumafila = sumafila + num[i][x - 1];
                } else{
                    System.out.print("   " +sumafila);
                }
            }
            System.out.println();
            sumafila = 0;
        }
       
        
        System.out.print("Sumatorio|"); 
        for(int x = 0; x < 5; x++) {
            int sumacolumnas = 0;
            for(int i = 0; i < 4; i++){
                sumacolumnas = sumacolumnas + num[i][x];
            }
            sumatotal = sumacolumnas + sumatotal;
            System.out.print("    " + sumacolumnas + "    "); 
        } 
       
        System.out.print("   " + sumatotal + "    ");
       
    }     
}
