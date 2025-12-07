import java.util.Scanner;

public class Func_Circulos {

    public static double area(double radio) {
        return Math.PI * radio * radio;
    }

    public static double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el radio del circulo para calcular su area y perimetro: ");
        String entrada = sc.nextLine().trim();

        double radio;
        try {
            radio = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Invalido debes escribir solo un numero.");
            sc.close();
            return;
        }

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
            sc.close();
            return;
        }

        System.out.printf("Area      : %.4f%n", area(radio));
        System.out.printf("Perimetro : %.4f%n", perimetro(radio));
        sc.close();
    }
}
