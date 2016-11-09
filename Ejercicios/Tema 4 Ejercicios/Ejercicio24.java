public class Ejercicio24 {
  public static void main(String[] args) {
   
    System.out.println("1 - Programador junior");
    System.out.println("2 - Programador senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduce el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuántos días has estado de viaje visitando a los clientes? ");
    int visitas = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce tu estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;

    switch(cargo) {
      case 1: 
        sueldoBase = 950;
        break;
      case 2: 
        sueldoBase = 1200;
        break;
      case 3: 
        sueldoBase = 1600;
        break;
      default:
        System.out.println("El sueldo base elegido no es el correcto.");
    }

    double sueldoDietas = visitas * 30;

    double sueldoBruto = sueldoBase + sueldoDietas;

    double irpf = 0;

    if (estadoCivil == 1) { 
      irpf = 25;
    } else if (estadoCivil == 2) { 
      irpf = 20;
    } else {
      System.out.println("El estado civil eleegido no es el correcto.");
    }

    System.out.println("_________________________________");
    System.out.printf("Sueldo base            %7.2f \n", sueldoBase);
    System.out.printf("Dietas (%2d viajes)     %7.2f \n", visitas, sueldoDietas);
    System.out.println("_________________________________");
    System.out.printf("Sueldo bruto           %7.2f \n", sueldoBruto);
    System.out.printf("Retención IRPF (%.0f%%)   %7.2f \n", irpf, (sueldoBruto * irpf) / 100);
    System.out.println("_________________________________");
    System.out.printf("Sueldo neto            %7.2f |\n", sueldoBruto - irpf);
    System.out.println("_________________________________");    
  }
}
