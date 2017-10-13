/**
 * Programación
 * Tema 3 Lectura de datos desde teclado
 * Ejercicio 12
 * 12 de octubre de 2017
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
  examen de la asignatura Programación para obtener la media deseada. Hay
  que tener en cuenta que la nota del primer examen cuenta el 40% y la del
  segundo examen un 60%.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la nota del primer examen de programación: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Qué nota quieres sacar en el trimestre?  ");
    double notaEsperada = Double.parseDouble(System.console().readLine());
    
    double nota2 = (notaEsperada - (nota1 * 0.4)) / 0.6;
    
    System.out.print("Para sacar un " + notaEsperada + " en el trimestre,");
    System.out.print(" necesitas sacar un " + nota2 + " en el segundo examen.");

  }
}
