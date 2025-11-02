import java.util.Scanner;

public class App4 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuántos números quieres ingresar?");
        int n = scanner.nextInt();
        
        
        double maximo = Double.NEGATIVE_INFINITY;
        double minimo = Double.POSITIVE_INFINITY;
        
    
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe el número " + (i + 1) + ":");
            double numero = scanner.nextDouble();
            
    
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        
        System.out.println("El número más grande es: " + maximo);
        System.out.println("El número más pequeño es: " + minimo);
        
        scanner.close();
    }
    
}
