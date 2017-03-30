/* Nombre: Lucía Flores Padilla
 * Fecha: 25 de marzo de 2017
 * Ejercicio 29 bucles
 * Programación
 */
public class Ejercicio32 {
  public static void main (String[] args) {
    
    System.out.print("Introduzca un número entero que sea grande y positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Aquí se le da la vueta al número y se calcula su longitud
    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }

    System.out.print("Los dígitos pares del número que has introducido son los siguientes: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    // Aqui se muestra la suma de los dígitos pares
    System.out.println(", y la suma de estos números pares es: " + sumaPares);
  }
}
