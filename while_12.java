import java.util.Scanner;

public class while_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primer_termino;
		int diferencia;
		int maximo;

		System.out.println("Escribe el primer numero de la secuencia: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Invalido - debes ingresar solo un número entero.");
			System.out.println("Escribe el primer numero de la secuencia: ");
			scanner.next();
		}
		primer_termino = scanner.nextInt();

		System.out.println("Escribe el valor de la diferencia entre términos: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Invalido - debes ingresar solo un número entero.");
			System.out.println("Escribe el valor de la diferencia entre términos: ");
			scanner.next();
		}
		diferencia = scanner.nextInt();

		System.out.println("Escreibe el número máximo hasta donde debe llegar la secuencia: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Imvalido - debes ingresar solo un número entero.");
			System.out.print("Escribe el numero maximo hasra donde debe llegar la secuencia: ");
			scanner.next();
		}
		maximo = scanner.nextInt();

		if (diferencia == 0) {
			if ((primer_termino <= maximo && diferencia == 0) || (primer_termino >= maximo && diferencia == 0)) {
				System.out.println("Secuencia: " + primer_termino);
			}
			scanner.close();
			return;
		}

		if (diferencia > 0 && primer_termino > maximo) {
			System.out.println();
			System.out.println("El primer término no puede ser mayor que el máximo cuando la diferencuia es positiva.");
			scanner.close();
			return;
		}

		if (diferencia < 0 && primer_termino < maximo) {
			System.out.println();
			System.out.println("El primer términon no puede ser menor que el máximo cuando la diferencia es negativa.");
			scanner.close();
			return;
		}

		System.out.println();
		System.out.println("Secuencia aritmética de " + primer_termino + " con diferencia " + diferencia + " hasta " + maximo + ":");

		int actual = primer_termino;
		boolean primero = true;

		if (diferencia > 0) {
			do {
				System.out.println(actual);
				primero = false;
				actual += diferencia;
			} while (actual <= maximo);
		} else { 
			do {
				System.out.println(actual);
				primero = false;
				actual += diferencia;
			} while (actual >= maximo);
		}

		System.out.println();
		scanner.close();
	}
}
