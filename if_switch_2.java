import java.util.Scanner;

public class if_switch_2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double cal;

        
        while (true) {
            System.out.println("Ingresa la calificación (0-100): ");
            if (scanner.hasNextDouble()) {
                cal = scanner.nextDouble();
                if (cal >= 0 && cal <= 100) {
                    break;
                } else {
                    System.out.println("Ivalido - La calificación debe estar entre 0 y 100");
                }
            } else {
                System.out.println("Ivalido - Debes ingresar un número válido");
                scanner.next();
            }
        }


        char letra;
        if (cal >= 90) {
              letra = 'A';
        } else if (cal >= 80) {
              letra = 'B';
        } else if (cal >= 70) {
              letra = 'C';
        } else if (cal >= 60) {
              letra = 'D';
        } else {
              letra = 'F';
        }

        System.out.println("La calificación en letra es: " + letra);

        scanner.close();
    }
}
