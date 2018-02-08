package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Lucía Flores Programación Tema 9 POO Ejercicio 1
 *
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Caballo rocinante = new Caballo("Rocinante");
    rocinante.setSexo("macho");
    Caballo bucefalo = new Caballo("Bucefalo");
    bucefalo.setSexo("macho");
    Caballo princesa = new Caballo("Princesa");
    princesa.setSexo("hembra");
    Persona pepe = new Persona("Pepe", "Pérez");
    
        rocinante.setRaza("flaco");
        rocinante.setColor("blanco");
        rocinante.setJinete(pepe);
        
        System.out.println(pepe);
        
        pepe.espolea("cariñosa");
        
        System.out.println(rocinante + "\n");
     

    System.out.println("Es la hora de aparearse!!!");

    Caballo cria1 = rocinante.seApareaCon(princesa, "Perdigón", "rosa");
    Caballo cria2 = rocinante.seApareaCon(bucefalo, "snoopy", "kate");

    System.out.println(cria1);
    System.out.print(cria2);

  }

}
