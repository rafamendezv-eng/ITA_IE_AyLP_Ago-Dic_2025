import java.util.Scanner;

public class while_1 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        while (true) {
            System.out.println("Ingresa un número para calcular su factorial: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 0) {
                    break;
                } else {
                    System.out.println("Invalido - el número no puede ser negativo.");
                }
            } else {
                System.out.println("Invalido - debes ingresar un número entero.");
                scanner.next();
            }
        }

        long factorial = 1;
        int i = 1;
        
        while (i <= numero) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
    
}
