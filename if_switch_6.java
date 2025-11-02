import java.util.Scanner;

public class if_switch_6 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.print("Ingresa la temperatura en grados Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                break;
            } else {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.next();
            }
        }

        System.out.println("Selecciona la conversión deseada:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");

        int opcion;
        while (true) {
            System.out.print("\nQue opción quieres escoger (1 o 2): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion == 1 || opcion == 2) {
                    break;
                } else {
                    System.out.println("Solo puedes seleccionar 1 o 2.");
                }
            } else {
                System.out.println("Ivaldico - Debes ingresar un número válido.");
                scanner.next();
            }
        }

        double resultado;
        String unidad;
        
        switch (opcion) {
            case 1:
                resultado = (celsius * 9.0/5.0) + 32;
                unidad = "Fahrenheit";
                break;
            case 2:
                resultado = celsius + 273.15;
                unidad = "Kelvin";
                break;
            default:
                resultado = 0;
                unidad = "desconocida";
        }

        System.out.println(celsius + " grados celsius son " + resultado + " "+ unidad);

        scanner.close();
    }
}
