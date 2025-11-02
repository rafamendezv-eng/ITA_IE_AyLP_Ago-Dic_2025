import java.util.Scanner;

public class if_switch_8 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe el nombre de un artista, película, serie u otra cosa que prefieras:");
		System.out.println("Opciones disponibles: Clint Eastwood, Kevin Bacon, Natalie Portman, Al Pacino, Val Kilmer\n ");
		
        String entrada = scanner.nextLine();
        if (entrada == null || entrada.trim().isEmpty()) {
			System.out.println("No escribiste nada.");
			scanner.close();
			return;
		}

		String caso_sel = entrada.trim().toLowerCase();

		System.out.println();
		switch (caso_sel) {
			case "clint eastwood":
				System.out.println("Actor estadounidense conocido por sus papeles en películas del oeste y de acción, así como por su trabajo como director. Algunas de sus películas más famosas son: El bueno, el feo y el malo y Gran Torino.");
				break;

			case "kevin bacon":
				System.out.println("Es un actor y músico estadounidense conocido por su versatilidad en el cine y la televisión. Ha protagonizado películas como Footloose, y Apollo 13.");
				break;

			case "natalie portman":
				System.out.println("Es una actris estadounidense famosa por peliculas como: Fuego contra fueg y los 3 primeros episodios de Star Wars.");
				break;

			case "al pacino":
				System.out.println("Al Pacino es un actor y director estadounidense, conocido por sus papeles en películas icónicas como: El Padrino, Scarface y Perfume de mujer. Ha ganado múltiples premios, incluyendo un Oscar.");
				break;

			case "val kilmer":
				System.out.println("Es un actor estadounidense conocido por sus papeles en películas como Top Gun, Batman Forever y The Doors.");
				break;
        }

		scanner.close();
	}
}
