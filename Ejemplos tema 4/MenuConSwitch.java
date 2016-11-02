public class MenuConSwitch {
  public static void main(String[] args) {
    
    System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" 1. Cuadrado");
    System.out.println(" 2. Rectángulo");
    System.out.println(" 3. Triánngulo");
    System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println("\n Elija una opción (1-3): ");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    double lado;
    double base;
    double altura;
    
    switch (opcion) {
      
      case 1: 
        System.out.print("\n Introduzca el lado del cuadrado en cm: ");
        lado = Double.parseDouble(System.console().readLine());
        System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
        break;
        
      case 2: 
        System.out.print("\n Introduzca la base del rectángulo en cm: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.print("\n Introduzca la altura del rectángulo en cm: ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("\nEl área del rectángulo es " + (base * altura) + " cm2");
        break;
        
      case 3: 
        System.out.print("\n Introduzca la base del triángulo en cm: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.print("\n Introduzca la altura del triángulo en cm: ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("\nEl área del triángulo es " + ((base * altura) / 2) + " cm2");
        break;
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    
    }
  }
}
