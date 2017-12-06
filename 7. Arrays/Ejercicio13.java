/**
 * Programación
 * Tema 7 Arrays
 * 6 de diciembre de 2017
 * Ejercicio 13
 * 
 * 13  Escribe un programa que rellene un array de 100 elementos con números ente-
       ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
       el programa mostrará el array y preguntará si el usuario quiere destacar el
       máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
       el número destacado entre dobles asteriscos.
       
       Ejemplo:
       
       459 447 251 426 262 204 20 250 178 90 353 32 229 357 224 454 260 310 
       140 249 332 426 423 413 96 465 298 459 411 118 480 302 417 42 82 126 
       82 474 362 76 190 104 21 257 88 21 6 383 47 78 392 394 244 494 87 253
       376 379 98 364 237 13 299 228 409 402 225 267 330 243 209 426 435 309 
       356 173 130 416 15 477 34 28 377 193 481 368 466 422 275 384 399 397 
       87 218 84 312 480 207 68 108
       
       ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
       
       459 447 251 225 466 204 20 250 178 90 353 32 229 357 224 454 260 310 
       140 249 332 426 423 413 96 465 298 459 411 118 480 302 417 42 82 126 
       82 474 362 76 190 104 21 257 88 21 **6** 383 47 78 392 394 244 494 87 
       253 376 379 98 364 237 13 299 228 409 402 426 267 330 243 209 426 435 
       309 356 173 130 416 15 477 34 28 377 193 481 368 262 422 275 384 399 
       397 87 218 84 312 480 207 68 108
       
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num;
    int[] inicial = new int[100];
    int maximo = 0;
    int minimo = 501;
    int eleccion = 0;
    
    
    for(int i = 0; i <= 99; i++){//lee por teclado los datos del array
      num = (int)(Math.random()*501);
      inicial[i] = num;
      System.out.print(inicial[i] + " ");
      
      if (num > maximo){
        maximo = num;
      }
      if (num < minimo){
        minimo = num;
      }
    }
    
    System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    eleccion = Integer.parseInt(s.nextLine());
      
    if(eleccion == 1){
      for (int i = 0; i < 99; i++) {
        if (inicial[i] == minimo) {
          System.out.print("**" + inicial[i] + "** ");
        } else {
          System.out.print(inicial[i] + " ");
        }
      }
      
    }else if (eleccion == 2){
      for (int i = 0; i < 99; i++) {
        if (inicial[i] == maximo) {
          System.out.print("**" + inicial[i] + "** ");
        } else {
          System.out.print(inicial[i] + " ");
        }
      }
    }else{
      System.out.println("\nLa opción que has elegido no es correcta. ");
    }
    
  }
}
