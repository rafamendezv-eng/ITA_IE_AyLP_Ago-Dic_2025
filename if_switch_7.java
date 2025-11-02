import java.util.Scanner;

public class if_switch_7 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double pesos;

        while (true) {
            System.out.println("Ingresa la cantidad en pesos mexicanos: ");
            if (scanner.hasNextDouble()) {
                pesos = scanner.nextDouble();
                if (pesos >= 0) {
                    break;
                } else {
                    System.out.println("Invalido - la cantidad no puede ser negativa.");
                }
            } else {
                System.out.println("Invalido - debes ingresar un número válido.");
                scanner.next();
            }
        }

        System.out.println("\nSelecciona la moneda a la que deseas convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath Tailandés (THB)");
        System.out.println("4. Yen Japonés (JPY)");
        System.out.println("5. Won Surcoreano (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol Peruano (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar Venezolano (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        int opcion;
        while (true) {
            System.out.println("\nIngresa el número de la moneda qeu quiere convertir (1-10): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 10) {
                    break;
                } else {
                    System.out.println("Solo puedes seleccionar un número entre 1 y 10.");
                }
            } else {
                System.out.println("Invalido - debes ingresar un número válido.");
                scanner.next();
            }
        }

        double resultado;
        String moneda;
        
        switch (opcion) {
            case 1: // USD
                resultado = pesos * 0.058;
                moneda = "USD";
                break;
            case 2: // EUR
                resultado = pesos * 0.054;
                moneda = "EUR";
                break;
            case 3: // THB
                resultado = pesos * 2.05;
                moneda = "THB";
                break;
            case 4: // JPY
                resultado = pesos * 8.70;
                moneda = "JPY";
                break;
            case 5: // KRW
                resultado = pesos * 76.27;
                moneda = "KRW";
                break;
            case 6: // AUD
                resultado = pesos * 0.090;
                moneda = "AUD";
                break;
            case 7: // PEN
                resultado = pesos * 0.22;
                moneda = "PEN";
                break;
            case 8: // CAD
                resultado = pesos * 0.080;
                moneda = "CAD";
                break;
            case 9: // VES
                resultado = pesos * 2.08;
                moneda = "VES";
                break;
            case 10: // ARS
                resultado = pesos * 20.45;
                moneda = "ARS";
                break;
            default:
                resultado = 0;
                moneda = "desconocida";
        }

        System.out.println("\n" + pesos + " MXN son: " + resultado + " " + moneda);

        scanner.close();
    }
}
