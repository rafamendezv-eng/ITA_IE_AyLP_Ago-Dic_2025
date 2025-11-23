public class ExamenP2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[] vocales = new char[10];
        int llenadas = 0;

        while (llenadas < vocales.length) {
            System.out.print("Escribe una vocal (" + (llenadas + 1) + "/" + vocales.length + "): ");
            String entrada = sc.nextLine().trim();

            if (entrada.length() != 1) {
                System.out.println("Debe escribir solo una sola letra vocal.");
                continue;
            }

            char c = entrada.charAt(0);
            char lc = Character.toLowerCase(c);
            if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') {
                vocales[llenadas++] = c;
            } else {
                System.out.println("No es una vocal, escribe solo vocales.");
            }
        }

        System.out.println("\nVocales guardadas en orden:");
        for (int i = 0; i < vocales.length; i++) {
            System.out.println((i + 1) + ": " + vocales[i]);
        }

        sc.close();
    }
}