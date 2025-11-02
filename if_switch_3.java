import java.util.Scanner;

public class if_switch_3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        double precio;
        while (true) {
            System.out.print("Ingresa el precio del producto: ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                if (precio >= 0) {
                    break;
                } else {
                    System.out.println("Ivalido - El precio no puede ser negativo.");
                }
            } else {
                System.out.println("Ivalido - Debes ingresar un precio válido");
                scanner.next();
            }
        }

        double porcentaje_descuento;
        if (precio <= 100) {
            porcentaje_descuento = 0.0;
        } else if (precio <= 200) {
            porcentaje_descuento = 0.10;
        } else if (precio <= 500) {
            porcentaje_descuento = 0.20;
        } else {
            porcentaje_descuento = 0.25;
        }

        double descuento = precio * porcentaje_descuento;
        double precio_final = precio - descuento;
        System.out.println("Precio final es: " + precio_final);

        scanner.close();
    }
}
