/**
 *
 * @author Lucía Flores Padilla
 *
 */

public class ArbolDeNavidad {
  public static void main(String[] args) {
  
    System.out.print("Introduce altura del arbol: ");
    int altura = Integer.parseInt(System.console().readLine());
    int espacios= altura-2;
    int linea = 1;
    int aleatorio = 0;
    String caracter = "";
    //pintamos la cima
    while(espacios+2 > 0){ //pinta la primera estrella
      System.out.print(" ");
      espacios--;
    }
    espacios= altura-1;
    System.out.println("*");
    
    while(espacios+1 > 0){ //pinta la cima
      System.out.print(" ");
      espacios--;
    }
        aleatorio = ((int)(Math.random() * 9 + 1));
          switch(aleatorio){
            case 1: 
              caracter = "^";
              break;
            case 2: 
              caracter = "^";
              break;
            case 3: 
              caracter = "^";
              break;
            case 4: 
              caracter = "^";
              break;
            case 5: 
              caracter = "^";
              break;
            case 6: 
              caracter = "^";
              break;
            case 7: 
              caracter = "o";
              break;
            case 8: 
              caracter = "o";
              break;
            case 9: 
              caracter = "*";
              break;
            }
    System.out.println(caracter);
    espacios = altura-1;
    //empezamos a pintar la piramide
    for(int i = altura;i > 0; i--){ //pìnta el arbol
      
      for(int j=0; j<espacios; j++){
        System.out.print(" ");
      }
      
      for(int k=0; k < (linea*2)+1; k++){
        aleatorio = ((int)(Math.random() * 9 + 1));
          switch(aleatorio){
            case 1: 
              caracter = "^";
              break;
            case 2: 
              caracter = "^";
              break;
            case 3: 
              caracter = "^";
              break;
            case 4: 
              caracter = "^";
              break;
            case 5: 
              caracter = "^";
              break;
            case 6: 
              caracter = "^";
              break;
            case 7: 
              caracter = "o";
              break;
            case 8: 
              caracter = "o";
              break;
            case 9: 
              caracter = "*";
              break;
            }
        System.out.print(caracter);
      }
      espacios--;
      linea++;
      System.out.println();
    }
  }
}
