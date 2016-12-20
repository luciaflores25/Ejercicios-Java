/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class BarajarArray {
  public static void main(String[] args) {
    
    //Este programa crea aleatoriamente un array y luego lo baraja aleatoriamente
  
  //declaramos arrays
    int[] posOcup = new int[15];
    int[] arrayAleatorio = new int[15];
    int[] arrayBarajado = new int[15];
    //declaramos booleanas
    boolean ocupado=false;
    boolean newPostOk=false;
    //variables
    int newPost;
    int j=0;
    int k=0;
    //generamos el array aleatorio
    for(int i=0; i < arrayAleatorio.length;i++){
      arrayAleatorio[i] = ((int)(Math.random()*101));
    }
    
    //Mostramos por pantalla
    System.out.println("Array Original");
    System.out.println("---------------");
    System.out.print("Indice ");
    for (int i = 1;i < 16;i++) {
      int m = i;
      System.out.printf("%4d  ", m);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (int i=0;i < 10;i++) {
      int n=arrayAleatorio[i];
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    
    //barajamos el array
    for(int i = 0; i < arrayAleatorio.length; i++) {
      while(!newPostOk){
        newPost = ((int)(Math.random()*10));
        if(newPost == i){
          ocupado=true;
        }
        j=0;
        while(ocupado | j < posOcup.length){
          if(newPost == posOcup[j]){
            ocupado = true;
          }
          j++;

        }
      if(!ocupado){
        newPostOk=true;
      }
      arrayBarajado[newPost] = arrayAleatorio[i];
      posOcup[k++]= newPost;
    }
   


  }
   System.out.println("---------------");
      //Dibujamos el segundo array
    System.out.println("Array Barajado");
    System.out.println("---------------");
    System.out.print("Indice ");
    for (int o = 1;o < 11;o++) {
      int z = o;
      System.out.printf("%4d  ", z);
    }
    System.out.println();
     System.out.println("       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    for (int o=0;o < 10;o++) {
      int l=arrayBarajado[o];
      System.out.printf("║%3d  ", l);
    }
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
}
}
