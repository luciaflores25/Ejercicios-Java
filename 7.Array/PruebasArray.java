/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class PruebasArray {
  public static void main(String[] args) {
  
  //Este programa comprueba que un array no se repita
  
    int[] num = new int[20];
    int metidos = 0; //variable que va a calcular las veces que han entrado en el array
    int compara=0;//esta variable hara
    int entra = 0;
    
    while(metidos < 20){ //Este while es el que va a mirar numero por numero
      int aux = (int)((Math.random() * 100)+1); //genera el numero aleatorio
      compara=0; //se pone el compara a 0 para que se borre el 20
      for(int i=0; i < 20;i++){ //compara con todos los numeros del array
        if(aux == num[i]){ //comprueba el aux al numero del array
        }else{ 
          compara++;//suma cada vez que no sea igual
        } 
        if(compara == 20){//si se ha sumado 20 veces es que no hay ninguno igual
          num[metidos] = aux;//aqui escribe en el array
          metidos++;//aqui lo suma para que no lo vuelva a meter en el mismo array
        }
      }
    }
    for(int i=0; i < 20; i++){//te enseña el array
      System.out.println(num[i]);
    }
  }
}
