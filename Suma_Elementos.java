public class Suma_Elementos {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + " de 5: ");
                String linea = sc.nextLine().trim();
                try {
                    nums[i] = Integer.parseInt(linea);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalido - escribe solo un número entero.");
                }
            }
        }

        int suma = 0;
        for (int v : nums) {
            suma += v;
        }

        System.out.println("\nSuma de los elementos: " + suma);
        sc.close();
    }
}
