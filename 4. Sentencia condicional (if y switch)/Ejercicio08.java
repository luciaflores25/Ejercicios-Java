/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 8
 * 18 de octubre de 2017
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
   suficiente, bien, notable o sobresaliente). En el programa anterior
   había que hacer la media de tres notas.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.print("Este programa calcula la media de 3 notas ");
    System.out.print("Introduce la primera nota:  ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota:  ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota:  ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.printf("La media de las tres notas introducidas es %.2f", media);
    
    if (media <  5){
      System.out.println(", la nota final es un insuficiente");
    }else if (media < 6){
      System.out.println(", la nota final es un suficiente");
    }else if (media <7){
      System.out.println(", la nota final es un bien");
    }else if (media <9){
      System.out.println(", la nota final es un notable");
    }else{
      System.out.println(", la nota final es un sobresaliente");
    }
  }
}
