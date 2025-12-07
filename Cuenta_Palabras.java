import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cuenta_Palabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Escribe un texto, para terminar presiona ENTER 2 veces:");

        StringBuilder sb = new StringBuilder();
        while (true) {
            String texto = sc.nextLine();
            if (texto.isEmpty()) break;
            sb.append(texto).append(' ');
        }

        String texto = sb.toString();
        if (texto.isEmpty()) {
            System.out.println("El texto esta vacio, escribe algo.");
            sc.close();
            return;
        }

        Pattern p = Pattern.compile("\\bingenieria\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher m = p.matcher(texto);
        int contador = 0;
        while (m.find()) contador++;

        System.out.println("La palabra \"ingenieria\" aparece " + contador + " veces.");
        sc.close();
    }
}
