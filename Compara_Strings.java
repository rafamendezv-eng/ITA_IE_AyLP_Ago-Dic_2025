import java.util.Scanner;

public class Compara_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un string: ");
        String string_1 = sc.nextLine();
        System.out.print("Ingresa otro string: ");
        String string_2 = sc.nextLine();

        if (string_1.length() == string_2.length()) {
            System.out.println("Los strings ienen la misma longitud " + string_1.length() + " chars");
        } else {
            System.out.println("Los strings no tienen la misma longitud el string 1 tiene " + string_1.length() + " chars y el 2 tiene " + string_2.length()+ " chars");
        }

        if (string_1.equals(string_2)) {
            System.out.println("Los strings SI son iguales tienen el mismo contenido.");
        } else {
            System.out.println("Los strings NO son iguales tienen contenido diferente.");
        }

        sc.close();
    }
}
