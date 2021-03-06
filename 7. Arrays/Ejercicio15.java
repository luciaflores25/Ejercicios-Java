/**
 * Programación
 * Tema 7 Arrays
 * 11 de diciembre de 2017
 * Ejercicio 15
 * 
* 15.   Un restaurante nos ha encargado una aplicación para colocar a los clientes en
        sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
        (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
        el programa no está preparado para colocar a grupos mayores a 4, por tanto,
        si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
        mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
        personas como máximo e intente de nuevo”. Para el grupo que llega,
        se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
        libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
        grupo es de dos personas, se podrá colocar donde haya una o dos personas.
        Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
        vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
        Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
        funcionamiento del programa se ilustra a continuación:
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] mesas = new int[10];
    int clientes = 1;
    int mesaVacia = 0;
    boolean estaVacia = false;
    boolean hayHueco = false;
    int mesasConHueco = 0;
        
    //Primero se rellenan las 10 mesas con numeros aleatorios entre 0-4
    for(int i = 0; i < mesas.length; i++){
      mesas[i] = (int)(Math.random() * 5);
    }
    
    while(clientes != -1){
      estaVacia = false;
      
      //Se muestra el número de mesa
      System.out.print("Mesa nº:  ");
      for (int i = 0; i < 10; i++) {
        System.out.printf(" %-2d", i+1);
      }
      
      //se muestra el número de personas que hay en cada mesa
      System.out.print("\nOcupación: ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("%-2d ", mesas[i]);
      }
      
      //Se registra el número de clientes
      System.out.print("\n\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(System.console().readLine());
      
      //Aquí vuelve a hacer la pregunta si el número de clientes es superior a 4
      if((clientes > 4) || (clientes <= 0)){
        System.out.print("\nLo siento, no admitimos grupos de " + clientes);
        System.out.print("\nhaga grupos de 4 personas como máximo e intente de nuevo\n");
      
      //en caso contrario entraría aquí
      }else{
        
        //Aquí se busca si hay alguna mesa con 0 personas (vacía)
        for(int i = 9; i >= 0; i--) {
          if (mesas[i] == 0) {
            mesaVacia = i;
            estaVacia = true;
          }
        }
      }
      
      //Este if es para que se coloquen los clientes en la mesa donde haya 0 personas
      if (estaVacia) {
        mesas[mesaVacia] = clientes;
        System.out.print("Por favor, siéntense en la mesa número " + (mesaVacia + 1) + ".\n\n");
        
      //Si la mesa tiene 1, 2 ó 3 personas ha ce lo siguiente:
      }else{

        hayHueco = false;
        for(int i = 9; i >= 0; i--) {
          if (clientes <= (4 - mesas[i])) {
            mesasConHueco = i;
            hayHueco = true;
          }
        }
        
        //Aqui se meten a los clientes en las mesas ocupadas donde haya hueco
        //Tienen que compartir mesa
        if (hayHueco) {
          mesas[mesasConHueco] += clientes;
          System.out.print("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (mesasConHueco + 1) + ".\n\n");
          
        //Cuando todas las mesas tienen 4 aparecerá un mensaje diciendo que no hay sitio
        }else {
          System.out.print("\nLo siento, en estos momentos no queda sitio.\n");
        }
      }
    }//Cierra el while
  }
}
