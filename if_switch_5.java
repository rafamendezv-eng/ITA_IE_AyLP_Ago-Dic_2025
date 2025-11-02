import java.util.Scanner;

public class if_switch_5 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);

		int mes;
		while (true) {
			System.out.print("Ingresa el número de mes (1-12): ");
			if (scanner.hasNextInt()) {
				mes = scanner.nextInt();
				if (mes >= 1 && mes <= 12) {
					break;
				} else {
					System.out.println("Invalido - Ingresa un número entre 1 y 12.");
				}
			} else {
				System.out.println("Invalido - Ingresa un número entero.");
				scanner.next();
			}
		}

		String estacion;
		switch (mes) {
			case 12:
			case 1:
			case 2:
				estacion = "Invierno";
				break;
			case 3:
			case 4:
			case 5:
				estacion = "Primavera";
				break;
			case 6:
			case 7:
			case 8:
				estacion = "Verano";
				break;
			case 9:
			case 10:
			case 11:
				estacion = "Otoño";
				break;
			default:
				estacion = "nueva estacion";
		}

		System.out.println("El mes " + mes + " pertenece a la estacion: " + estacion);

		scanner.close();
	}
}
