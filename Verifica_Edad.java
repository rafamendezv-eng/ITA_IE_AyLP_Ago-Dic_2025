import java.util.Scanner;

public class Verifica_Edad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad:");
        String linea = sc.nextLine().trim();
        int edad = Integer.parseInt(linea);
        System.out.println("Puedes votar? " + Puedes_Votar(edad));
      
        sc.close();
    }

    public static boolean Puedes_Votar(int edad) {
        if(edad>=18) {
            return true;
        } else {
            return false;
        }
    }
}
