import java.util.Scanner;

public class while_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalido - debes ingresar un número entero válido.");
            System.out.println("Escribe un número entero: ");
            scanner.next();
        }
        
        int numero = scanner.nextInt();
        int valor_absoluto = Math.abs(numero);
        int contador = 0;
        if (valor_absoluto == 0) {
            contador = 1;
        } 
        else {
            while (valor_absoluto > 0) {
                contador++;
                valor_absoluto /= 10;
            }
        }

        System.out.println("El número escrito tiene: " + contador + " dígitos.");
        
        scanner.close();
    }
}
