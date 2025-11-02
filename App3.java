import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double radio, resultado;
        final double PI = 3.14159;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Calcular perímetro de un círculo");
        System.out.println("2. Calcular área de un círculo");
        
        int opcion = scanner.nextInt();

        System.out.println("Escribe el radio del círculo:");
        radio = scanner.nextDouble();

        switch (opcion) {
            case 1:
                
                resultado = 2 * PI * radio;
                System.out.println("El perímetro del círculo es: " + resultado);
                break;
            
            case 2:
                
                resultado = PI * (radio * radio);
                System.out.println("El área del círculo es: " + resultado);
                break;
            
            default:
                System.out.println("Escogiste una opción no válida.");
                break;
        }

        scanner.close();
    }
}
