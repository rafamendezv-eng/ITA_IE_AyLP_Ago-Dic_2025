import java.util.Random;
import java.util.Scanner;

public class while_6 {
	public static void main(String[] args) {
		Random num_random = new Random();
		int num_correcto = num_random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Adivina el número (entre 1 y 100)");

		while (true) {
			System.out.print("Escribe el numero que tu creas correcto: ");
			if (!scanner.hasNextInt()) {
				System.out.println("Invalido - por favor ingresa solo números enteros.");
				scanner.next();
				continue;
			}

			int intento = scanner.nextInt();

			if (intento < 1 || intento > 100) {
				System.out.println("Invalido - por favor ingresa solo números entre 1 y 100.");
				continue;
			}

			if (intento < num_correcto) {
				System.out.println("Demasiado bajo.");
			} else if (intento > num_correcto) {
				System.out.println("Demasiado alto.");
			} else {
				System.out.println("Adivinaste el número.");
				break;
			}
		}

		scanner.close();
	}
}
