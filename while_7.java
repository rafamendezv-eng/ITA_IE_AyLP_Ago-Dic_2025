import java.util.Scanner;
public class while_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe letras para idenitifcar su tipo o escribe un espacio para terminar.");

		while (true) {
			System.out.println("Escribe otra letra: ");
			String letra_in = scanner.nextLine();

			if (letra_in == null || letra_in.length() == 0) {
				System.out.println("No escribiste nada, escribe una letra o un espacio para salir.");
				continue;
			}

			if (letra_in.charAt(0) == ' ') {
				break;
			}

			char letra = letra_in.charAt(0);
			char letra_convertida = Character.toLowerCase(letra);

			if (!Character.isLetter(letra_convertida)) {
				System.out.println("No es una letra. Intenta de nuevo.");
				continue;
			}

			if ("aeiou".indexOf(letra_convertida) >= 0) {
				System.out.println("Es una vocal.");
			} else {
				System.out.println("Es una consonante.");
			}
		}

		scanner.close();
	}
}
