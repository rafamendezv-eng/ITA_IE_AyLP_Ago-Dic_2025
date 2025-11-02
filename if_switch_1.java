import java.util.Scanner;

public class if_switch_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de calificaciones finales");

        double cal_parciales;
        while (true) {
            System.out.println("Escribe la calificación de parciales (0-100): ");
            if (scanner.hasNextDouble()) {
                cal_parciales = scanner.nextDouble();
                if (cal_parciales >= 0 && cal_parciales <= 100) {
                    break;
                } else {
                    System.out.println("Ivalido - La calificación debe estar entre 0 y 100");
                }
            } else {
                System.out.println("Ivalido - Debes ingresar un número válido");
                scanner.next();
            }
        }

        double cal_proyecto;
        while (true) {
            System.out.println("Escribe la calificación del proyecto (0-100): ");
            if (scanner.hasNextDouble()) {
                cal_proyecto = scanner.nextDouble();
                if (cal_proyecto >= 0 && cal_proyecto <= 100) {
                    break;
                } else {
                    System.out.println("Ivalido - La calificación debe estar entre 0 y 100");
                }
            } else {
                System.out.println("Ivalido - Debes ingresar un número válido");
                scanner.next();
            }
        }

        double cal_examen;
        while (true) {
            System.out.println("Escribe la calificación del examen final (0-100): ");
            if (scanner.hasNextDouble()) {
                cal_examen = scanner.nextDouble();
                if (cal_examen >= 0 && cal_examen <= 100) {
                    break;
                } else {
                    System.out.println("Ivalido - La calificación debe estar entre 0 y 100");
                }
            } else {
                System.out.println("Ivalido - Debes ingresar un número válido");
                scanner.next();
            }
        }

        double cal_final = cal_parciales * 0.40 + cal_proyecto * 0.30 + cal_examen * 0.30;
        System.out.println("La calificación final es: " + cal_final);
        
        scanner.close();
    }
}