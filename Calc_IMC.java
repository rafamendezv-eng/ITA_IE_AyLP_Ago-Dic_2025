import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cual es tu altura?");
        double alt = scanner.nextDouble();

        System.out.println("Cual es tu peso?");
        double peso = scanner.nextDouble();

        double IMC = peso / (alt * alt);

        System.out.println("Tu IMC es: " + IMC);
        
        scanner.close();
    }
}
