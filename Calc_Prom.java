import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cual es el primer numero? ");
        double n_01 = scanner.nextDouble();

        System.out.print("Cual es el segundo numero? ");
        double n_02 = scanner.nextDouble();

        System.out.print("Cual es el tercer numero? ");
        double n_03 = scanner.nextDouble();

        double prom = (n_01 + n_02 + n_03) / 3;

        System.out.println("El promedio es: " + prom);

        scanner.close();
    }
}
