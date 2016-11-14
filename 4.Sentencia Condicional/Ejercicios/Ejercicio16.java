public class Ejercicio16 {
  public static void main(String[] args) {
    
     int puntos = 0;
      String respuesta;
      System.out.println("TEST DE INFIDELIDAD");
      System.out.println("------------------------------------------------------------------------------");
      
      System.out.println("Para relizar dicho cuestionario debe responder con Verdadero(V)/Falso(F)");
      
      System.out.println("1º ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      System.out.println("2º ¿Ha aumentado sus gastos de vestuario?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      System.out.println("3º ¿Ha perdido el interés que mostraba anteriormente por ti?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      System.out.println("4º ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      System.out.println("5º ¿No te deja que mires la agenda de su teléfono móvil?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      
      System.out.println("6º ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      
      System.out.println("7º ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      
      System.out.println("8º ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      
      System.out.println("9º ¿Has notado que últimamente se perfuma más?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      
      System.out.println("10º ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
      respuesta = System.console().readLine();
       if (respuesta.equals("V")) {
        puntos+=3;
      }
      
      if (puntos>=0 && puntos<=10) {
        System.out.println("Puntuación entre 0 y 10:¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      } 
      
      if (puntos>10 && puntos<=22) {
        System.out.println("Puntuación entre 10 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      }
      
      if (puntos>22 && puntos<=30) {
        System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
      
     }
}
