/**
 * Programación
 * Tema 1 Salida de datos por  pantalla
 * Ejercicio 5
 * 2 de octubre de 2017
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
  de un color diferente
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println(" \033[32m_______________________________________________________________________");
    System.out.println("\033[32m|   HORARIO   |  Lunes  |  Martes  |  Miércoles  |  Jueves  |  Viernes  |");
    System.out.println("\033[32m|-------------|---------------------------------------------------------|");
    System.out.println("\033[34m|8:15 -  9:15 |  SINF   |   PRO    |    SINF     |   PRO    |    PRO    |");
    System.out.println("\033[34m|9:15 - 10:15 |  SINF   |   PRO    |    SINF     |   PRO    |    PRO    |");
    System.out.println("\033[34m|10:15 - 11:15|  SINF   |   PRO    |    SINF     |   PRO    |     ED    |");
    System.out.println("\033[31m|-------------|---------|----------|-------------|----------|-----------|");
    System.out.println("\033[31m|11:15 - 11:45|  RECREO |  RECREO  |   RECREO    |  RECREO  |  RECREO   |");
    System.out.println("\033[31m|-------------|---------|----------|-------------|----------|-----------|");
    System.out.println("\033[34m|11:45 - 12:45|   FOL   |    BD    |      ED     |    BD    |    LM     |");
    System.out.println("\033[34m|12:45 - 13:45|   FOL   |    BD    |      ED     |    BD    |    LM     |");
    System.out.println("\033[34m|13:45 - 14:45|   FOL   |    BD    |      LM     |    BD    |    LM     |");
    System.out.println("\033[32m|_____________|_________|__________|_____________|__________|___________|");
  }
}
