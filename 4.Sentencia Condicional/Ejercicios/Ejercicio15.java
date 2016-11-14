public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a contruir una pirámide con asteriscos");
    System.out.println("Introduce uno de estos caracteres (*, +, -, $, &..etc para formar la piramide");
    String x = System.console().readLine();
    
    System.out.println("Elige el modelo de la piramide");
    System.out.println("1)  vértice hacia arriba");
		System.out.println("2)  vértice hacia abajo");
		System.out.println("3)  vértice hacia la izquierda");
		System.out.println("4)  vértice hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("   " + x );
        System.out.println("  " + x + x + x);
        System.out.println(" " + x + x + x+ x);
        System.out.println(x + x + x + x + x + x);
        break;
			case 2:
        System.out.println(x + x + x + x + x + x);
        System.out.println(" " + x + x + x + x);
        System.out.println("  " + x + x);
        System.out.println("   " + x);
        break;
			case 3:
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
        break;
			case 4:
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);
        break;
      default:
		}
	}
}
