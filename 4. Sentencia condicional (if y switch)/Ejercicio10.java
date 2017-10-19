/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 10
 * 18 de octubre de 2017
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
   nacimiento.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el día del mes en el que has nacido:  ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce el nº del mes: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1:
        if ((dia >=1) && (dia <=19)){
          System.out.println("\nTu horóscopo es Capricornio");
        }else {
          System.out.println("\nTu horóscopo es Acuario");
        }
        break;
      case 2:
        if ((dia >=1) && (dia <=18)){
          System.out.println("\nTu horóscopo es Acuario");
        }else {
          System.out.println("\nTu horóscopo es Piscis");
        }
        break;
      case 3:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Piscis");
        }else {
          System.out.println("\nTu horóscopo es Aries");
        }
        break;
      case 4:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Aries");
        }else {
          System.out.println("\nTu horóscopo es Tauro");
        }
        break;
      case 5:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Tauro");
        }else {
          System.out.println("\nTu horóscopo es Géminis");
        }
        break;
      case 6:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Géminis");
        }else {
          System.out.println("\nTu horóscopo es Cáncer");
        }
        break;
      case 7:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Cáncer");
        }else {
          System.out.println("\nTu horóscopo es Léo");
        }
        break;
      case 8:
        if ((dia >=1) && (dia <=21)){
          System.out.println("\nTu horóscopo es Léo");
        }else {
          System.out.println("\nTu horóscopo es Virgo");
        }
        break;
      case 9:
        if ((dia >=1) && (dia <=22)){
          System.out.println("\nTu horóscopo es Virgo");
        }else {
          System.out.println("\nTu horóscopo es Libra");
        }
        break;
      case 10:
        if ((dia >=1) && (dia <=22)){
          System.out.println("\nTu horóscopo es Libra");
        }else {
          System.out.println("\nTu horóscopo es Escorpio");
        }
        break;
      case 11:
        if ((dia >=1) && (dia <=22)){
          System.out.println("\nTu horóscopo es Escorpio");
        }else {
          System.out.println("\nTu horóscopo es Sagitario");
        }
        break;
      case 12:
        if ((dia >=1) && (dia <=20)){
          System.out.println("\nTu horóscopo es Sagitario");
        }else {
          System.out.println("\nTu horóscopo es Capricornio");
        }
        break;
      default:
        System.out.println("\nLa fecha introducida no es correcta");
      }
  }
}
