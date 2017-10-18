/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 12
 * 18 de octubre de 2017
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
   que se imparten en el curso. Cada pregunta acertada sumará un punto. El
   programa mostrará al final la calificación obtenida. Pásale el minicuestionario
   a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
   en las diferentes asignaturas del curso.
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int puntos = 0;
    
    System.out.println("CUESTIONARIO SOBRE 1ºDAW");
    System.out.println("---------------------------");
    
    System.out.println("\na) ¿Cuál de estas opciones no es un lenguaje de programación? ");
    System.out.println("\n1. Java \n2. C \n3. X");
    int r1 = Integer.parseInt(System.console().readLine());
    
    if (r1 == 3){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nb) ¿Cuál es una de las asignaturas del curso? ");
    System.out.println("\n1. Inglés \n2. FOL \n3. Matemáticas ");
    int r2 = Integer.parseInt(System.console().readLine());
    
    if (r2 == 2){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nc) ¿A qué hora es el recreo? ");
    System.out.println("\n1. 11:00 \n2. 11:30 \n3. 11:15");
    int r3 = Integer.parseInt(System.console().readLine());
    
    if (r3 == 3){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nd) ¿En qué asignatura se da HTML? ");
    System.out.println("\n1. LM \n2. ED \n3. SINF");
    int r4 = Integer.parseInt(System.console().readLine());
    
    if (r4 == 1){
          puntos +=1;
        }else{
        }
    
    System.out.println("\ne) ¿1+1 en números binarios cuanto es? ");
    System.out.println("\n1. 0, y acarreo 1 \n2. 1, y acarreo 1 \n3. 0, y no acarreo nada");
    int r5 = Integer.parseInt(System.console().readLine());
    
    if (r5 == 1){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nf) ¿Los miércoles a última hora qué asignatura toca? ");
    System.out.println("\n1. BBDD \n2. ED \n3. LM");
    int r6 = Integer.parseInt(System.console().readLine());
    
    if (r6 == 3){
          puntos +=1;
        }else{
        }
    
    System.out.println("\ng) ¿Cuántas horas de BBDD hay a la semana? ");
    System.out.println("\n1. 6h \n2. 8h \n3. 9h");
    int r7 = Integer.parseInt(System.console().readLine());
    
    if (r7 == 1){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nh) ¿En el módulo se hacen aplicaciones para android? ");
    System.out.println("\n1. no, solo para WEB \n2. sí, tambíen para WEB \n3. sí");
    int r8 = Integer.parseInt(System.console().readLine());
    
    if (r8 == 1){
          puntos +=1;
        }else{
        }
    
    System.out.println("\ni) ¿Qué sistema operativo uilizamos para programación? ");
    System.out.println("\n1. Windows \n2. Linux \n3. Android");
    int r9 = Integer.parseInt(System.console().readLine());
    
    if (r9 == 2){
          puntos +=1;
        }else{
        }
    
    System.out.println("\nj) ¿Qué conjunto de teclas sirve para pegar algo? ");
    System.out.println("\n1. ctro+v \n2. ctrl+c \n3. ctrl+x");
    int r10 = Integer.parseInt(System.console().readLine());
    
    if (r10 == 1){
          puntos +=1;
        }else{
        }
    
    System.out.println("Ha obtenido en el cuestionario " + puntos + " puntos");
  }
}
