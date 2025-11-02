import java.util.Scanner;

public class while_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidad;
        while (true) {
            System.out.println("¿Cuántos números quieres ingresar? ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                if (cantidad > 0) {
                    break;
                } else {
                    System.out.println("Invalido - debes ingresar un número positivo.");
                }
            } else {
                System.out.println("Invalido - debes ingresar un número entero.");
                scanner.next();
            }
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        int numeros_ingresados = 0;
        while (numeros_ingresados < cantidad) {
            System.out.println("Ingresa el número: " + (numeros_ingresados + 1) + " de " + cantidad);
            
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
                
                numeros_ingresados++;
            } else {
                System.out.println("Invalido - debes ingresar un número válido.");
                scanner.next();
            }
        }

        System.out.println("\nResultados del conteo:");
        System.out.println("Números mayores que 0: " + positivos);
        System.out.println("Números menores que 0: " + negativos);
        System.out.println("Números iguales a 0: " + ceros);
        
        scanner.close();
    }
    
}
