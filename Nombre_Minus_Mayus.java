import java.util.Scanner;

public class Nombre_Minus_Mayus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        while (true) {
            System.out.print("Escribe un nombre completo en minúsculas o escribe 'salir' para terminar): ");
            String entrada = sc.nextLine().trim();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            if (entrada.isEmpty()) {
                System.out.println("Invalidco, escribe un nombe cualquiera.");
                continue;
            }
            System.out.println("Nombre en mayusculas: " + entrada.toUpperCase());
        }
        sc.close();
    }
}
