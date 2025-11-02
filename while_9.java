import java.util.Scanner;

public class while_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;


		while (continuar) {
			System.out.println("Selecciona una operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.print("Opción (1-4): ");

			if (!scanner.hasNextInt()) {
				System.out.println("Invalido - por favor escribe un número entre 1 y 4.");
				scanner.next();
				continue;
			}

			int opcion = scanner.nextInt();
			if (opcion < 1 || opcion > 4) {
				System.out.println("Invalido - por favor escribe un número entre 1 y 4.");
				continue;
			}

			// Leer los dos operandos
			double a, b;
			System.out.print("Ingresa el primer número: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalido por favor ingresa solo números.");
				scanner.next();
				System.out.print("Ingresa el primer número: ");
			}
			a = scanner.nextDouble();

			System.out.print("Ingresa el segundo número: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalido por favor ingresa solo números.");
				scanner.next();
				System.out.print("Ingresa el segundo número: ");
			}
			b = scanner.nextDouble();

			double resultado = 0;
			boolean calculado = true;

			switch (opcion) {
				case 1:
					resultado = a + b;
					break;
				case 2:
					resultado = a - b;
					break;
				case 3:
					resultado = a * b;
					break;
				case 4:
					if (b == 0) {
						System.out.println("Error: división por cero no permitida.");
						calculado = false;
					} else {
						resultado = a / b;
					}
					break;
			}

				System.out.println("Resultado: " + resultado);

			System.out.print("¿Quieres hacer otra operación? (s/n): ");
			String respuesta = scanner.next();
			if (!respuesta.trim().toLowerCase().startsWith("s")) {
				continuar = false;
			}
		}

		scanner.close();
	}
}

