/* Nombre: Lucía Flores Padilla
 * Fecha: 6 de febrero de 2017
 * Ejercicio 12 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int puntos = 0;
		String respuesta;
    
	System.out.println("Resuelve este tipo test sobre 1º DAW");
	System.out.println("Responde con 'si' o 'no'");
  
	System.out.println("1ª Pregunta: ¿linux es un sistema operativo de código cerrado?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}

	System.out.println("2ª Pregunta: ¿en lenguaje de marcas hemos dado html?");
	respuesta = System.console().readLine(); 

	if(respuesta.equalsIgnoreCase("si")){
	puntos++;
	}
	
	System.out.println("3ª Pregunta: ¿en bases de datos hemos dado las DED?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("Si")){
		puntos++;
	}
  
	System.out.println("4ª Pregunta: ¿en sistemas informáticos se da html?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}
  
	System.out.println("5ª Pregunta: ¿en FOL se dan los riesgos en el trabajo?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
  
	System.out.println("6ª Pregunta: ¿linux es un programa de editor de vídeos?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("no")){
	puntos++;
	}
  
	System.out.println("7ªPregunta: ¿subimos los ejercicios de programación a facebook?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("no")){
	puntos++;
	}
  
	System.out.println("8ª Pregunta: ¿subimos los ejercicios de programación a Github?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("si")){
	puntos++;
	}
  
	System.out.println("9ª Pregunta: ¿SQL es el lenguaje para hacer consultas en la base de datos?");
	respuesta = System.console().readLine(); 
  
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
  
	System.out.println("10ª Pregunta: ¿en el directorio de cd se encuentran los archivos de configraación de linux?");
	respuesta = System.console().readLine(); 
	
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}
  
  
	System.out.println("Has sacado un " + puntos);
		
	}//Cierra el public static
	
}//Cierra el public class
