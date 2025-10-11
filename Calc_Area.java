import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuanto mide la base del rectangulo? ");
        double b= scanner.nextDouble();
        
        System.out.print("Cuanto mide la altura del rectangulo? ");
        double a = scanner.nextDouble();
        
        double area_calc = b * a;
        
        System.out.println("El área del rectángulo es: " + area_calc);
        
        scanner.close();
    }
}