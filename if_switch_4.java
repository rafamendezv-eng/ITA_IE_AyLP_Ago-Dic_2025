import java.util.Scanner;

public class if_switch_4 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int edad;
        while (true) {
            System.out.print("Ingresa tu edad: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad >= 0) {
                    break;
                } else {
                    System.out.println("Edad no valida - no puede ser negativa.");
                }
            } else {
                System.out.println("Edad no valida - ingresa solo numero enteros.");
                scanner.next();
            }
        }

        if (edad >= 18) {
            System.out.println("SI puedes votar.");
        } else {
            System.out.println("Aun NO tienes edad para votar.");
        }

        scanner.close();
    }
}
