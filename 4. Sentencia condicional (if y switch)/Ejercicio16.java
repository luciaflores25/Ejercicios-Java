/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 16
 * 19 de octubre de 2017
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
   nos está siendo infiel. El programa irá haciendo preguntas que el usuario
   contestará con verdadero o falso. Cada pregunta contestada como verdadero
   sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza
   el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
   del programa.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    
    int puntos= 0;
    
    System.out.println("TEST DE INFIDELIDAD");
    System.out.println("---------------------------");
    
    System.out.println("\nResponde verdadero (v) o falso (f) para saber si tu pareja es infiel");
    
    System.out.println("\n1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
    String r1 = System.console().readLine().toLowerCase();
    
    if (r1 .equals("v")){
          puntos +=3;
        }else{
        }
        
    
    System.out.println("\n2. Ha aumentado sus gastos de vestuario ");
    String r2 = System.console().readLine().toLowerCase();
    if (r2 .equals("v")){
          puntos +=3;
        }else{
        }
        
    System.out.println("\n3. Ha perdido el interés que mostraba anteriormente por ti ");
    String r3 = System.console().readLine().toLowerCase();
    if (r3 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.print("\n4. Ahora se afeita y se asea con más frecuencia (si es hombre)");
    System.out.print(" o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
    String r4 = System.console().readLine().toLowerCase();
    if (r4 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n5. No te deja que mires la agenda de su teléfono móvil ");
    String r5 = System.console().readLine().toLowerCase();
    if (r5 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
    String r6 = System.console().readLine().toLowerCase();
    if (r6 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
    String r7 = System.console().readLine().toLowerCase();
    if (r7 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
    String r8 = System.console().readLine().toLowerCase();
    if (r8 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n9. Has notado que últimamente se perfuma más ");
    String r9 = System.console().readLine().toLowerCase();
    if (r9 .equals("v")){
          puntos +=3;
        }else{
        }
    
    System.out.println("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
    String r10 = System.console().readLine().toLowerCase();
    if (r10 .equals("v")){
          puntos +=3;
        }else{
        }
        
      System.out.println("tu puntuación es " + puntos);
      
      if ((puntos >= 0) && (puntos <=10)){
        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel!");
      } else if ((puntos >= 11) && (puntos <=22)){
         System.out.print("Quizás exista el peligro de otra persona en su vida o ");
         System.out.print("en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      }else {
         System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo ");
         System.out.print("un romance con otra persona. Te aconsejamos que indagues un ");
         System.out.print("poco más y averigües que es lo que está pasando por su cabeza.");
      }
  }
}
