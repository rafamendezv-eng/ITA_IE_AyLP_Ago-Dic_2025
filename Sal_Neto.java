
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cual es tu salario bruto? ");
        double sal_bruto = scanner.nextDouble();

        System.out.print("Cual es tu porcentaje de impuestos? ");   
        double por_imp = scanner.nextDouble();

        System.err.println("Cuales son tus deducciones adicionales? ");
        double deducciones = scanner.nextDouble();

        double sal_neto = sal_bruto - (sal_bruto * por_imp / 100) - deducciones;
        System.out.println("Tu salario neto es: " + sal_neto);

        scanner.close();
    }
}
