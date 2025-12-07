import java.util.Scanner;

public class Palindromo {


    public static boolean esPalindromo(String s) {
        if (s == null) return false;
        String t = s.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}]", "").toLowerCase();
        int i = 0, j = t.length() - 1;
        while (i < j) {
            if (t.charAt(i) != t.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Escribe un string para ver si es palindromo o no: ");
        String entrada = sc.nextLine();
        System.out.println(esPalindromo(entrada) ? "Es un palindromo" : "No es un palindromo");
        sc.close();
    }
}
