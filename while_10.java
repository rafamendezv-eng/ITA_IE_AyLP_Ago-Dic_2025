import java.util.Scanner;

public class while_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Escribe un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalido - debes escribir solo un numero entero.");
                System.out.print("Escribe un número entero positivo: ");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Invalido - el número debe ser positivo.");
            }
        } while (numero <= 0);

        System.out.println("\nNúmeros impares desde 1 hasta " + numero + ": ");
        
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= numero);

        scanner.close();
    }
    
}
