package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author Lucía Flores
 * Programación
 * Tema 9 POO
 * Ejercicio 1
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
public class Ejercicio01 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
        
        Caballo rocinante=new Caballo("Rocinante");
        Caballo bucefalo=new Caballo("Bucefalo");
        Caballo princesa=new Caballo("Princesa");
        Persona pepe =new Persona("Pepe", "Pérez");
        /*
        rocinante.setRaza("flaco");
        rocinante.setColor("blanco");
        rocinante.setJinete(pepe);
        
        System.out.println(pepe);
        
        pepe.espolea("cariñosa");
        
        System.out.println(rocinante + "\n");
        */
        
        System.out.println("Es la hora de aparearse!!!\n");
        
        Caballo cria1 = rocinante.seApareaCon(princesa, "Rosa", "Perdigón");
        Caballo cria2 = rocinante.seApareaCon(bucefalo, "Kate", "Snoopy");
        
        System.out.println(cria1);
        System.out.println(cria2);
                
        
    }

}
