public class Burbuja {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Escribe el tamaño del arreglo: ");
            String linea = sc.nextLine().trim();
            try {
                n = Integer.parseInt(linea);
                if (n <= 0) {
                    System.out.println("El numero debe ser mayor que cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inavlido - escribe solo un numero entero.");
            }
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                String entrada = sc.nextLine().trim();
                try {
                    arr[i] = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inavlido - escribe solo un numero entero.");
                }
            }
        }

        
        for (int i = 0; i < n - 1; i++) {
            boolean intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    intercambio = true;
                }
            }
            if (!intercambio) break; 
        }

        System.out.println("\nArreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + arr[i]);
        }

        sc.close();
    }
}