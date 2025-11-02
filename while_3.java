import java.util.Scanner;

public class while_3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        if (palabra.isEmpty()) {
            System.out.println("No escribiste nada.");
            scanner.close();
            return;
        }

        int contador = 0;
        int indice = 0;
        while (indice < palabra.length()) {
            char letra = palabra.toLowerCase().charAt(indice);
            if (letra == 'a') {
                contador++;
            }
            indice++;
        }

        if (contador == 0) {
            System.out.println("La palabra '" + palabra + "' no contiene ninguna letra 'a'.");
        } 
        else {
            System.out.println("La palabra '" + palabra + "' contiene " + contador + " letras 'a'.");
        }
        
        scanner.close();
    }
    
}
