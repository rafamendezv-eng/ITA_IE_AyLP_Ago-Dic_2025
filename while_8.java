import java.util.Scanner;

public class while_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe números positivos para calcular su media o escribe un número negativo para terminar.");

		double suma = 0.0;
		int contador = 0;

		while (true) {
			System.out.print("Ingresa otro número: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Invalido - por favor ingresa un número.");
				scanner.next();
				continue;
			}

			double numero = scanner.nextDouble();

			if (numero < 0) {
				break;
			}

			suma += numero;
			contador++;
		}
 
			double media = suma / contador;
			System.out.printf("La media de tus numeros es: " + media);


		scanner.close();
	}
}

