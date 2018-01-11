/**
 * Este paquete contiene funciones de manejo de las matemáticas
 * 
 * @author Lucía Flores Padilla
 * 
 * Programacion 1º DAW Segundo trimestre
 * Tema 8 Funciones
 * Ejercicios 1-14
 * Jueves, 11 de enero de 2018
 */
 package matematicas;
 
 public class ManejoMatematicas{
   
   /**
    * Comprueba si un número es Capicúa o no
    * @param n es el número introducido por el usuario
    * @return <code>true</code> si el número introducido es capicúa 
    * @return <code>false</code> si el número introducido no es capicúa
    */
    public static boolean esCapicua(int n) {
      
      int aux = n;
      int volteado = 0;
      
      while (aux > 0) {
        volteado = volteado * 10 + aux % 10;
        aux /= 10;
      }
      
      return (n == volteado);
    }
    
  /**
   * Comprueba si un número es primo o no
   * @param n es el número introducido por el usuario
   * @return <code>true</code> si el número introducido es primo
   * @return <code>false</code> si el número introducido no es primo
   */
   public static boolean esPrimo(int n){
     for(int i = 2; i < n; i++){
       if((n % i) == 0){
         return false;
       }
     }
     return true;
   }
   
   /**
    * Devuelve el siguiente número primo al número que se ha introducido
    * @param n es el número introducido
    * @return <code>nextPrimo</code>
    */
    public static int siguientePrimo(int n){
      int nextPrimo = n;
      
      do{
        nextPrimo++;
      }while(!esPrimo(nextPrimo));
      return nextPrimo;
    } 
    
  /**
   * Dada la base y un exponente devuelve una potencia
   * @param b es la base introducida por teclado
   * @param e es el exponente introducido por teclado
   * @return <code>potencia</code> es el resultado de la potencia entre la base y el exponente 
   */
   public static int potencia(int b, int e){
     int potencia = 1;
     
     for (int i = 0; i < e; i++){
       potencia = potencia * b;
     }
     
     return potencia;
   }
   
   /**
    * Cuenta el número de dígitos de un número entero
    * @param n es el número entero introducido por teclado
    * @return <code>digitos</code> es donde se va almcenar el número de dígitos
    */
    public static int digitos(int n){
      if(n == 0){
        return 1;
      }else{
        int x = 0;
        while(n > 0){
          n = n / 10;
          x++;
        }
        return x;
      }
    }
  
  
  /**
   * Voltea un número introducido por teclado
   * @param n es el número introducido por teclado
   * @return <code>volteado</code> es el número volteado
   */
   public static int voltea(int n){
     int volteado = 0;
     
     while(n > 0){
       volteado = volteado * 10 + n % 10;
       n = n / 10;
     }
     
     return volteado;
   }
   
   /**
    */
   
 }
 
