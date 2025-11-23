public class Encontrar_Mayor_Menor {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) {
            while (true) {
                System.out.print("Numero " + (i + 1) + " de 8: ");
                String linea = sc.nextLine().trim();
                try {
                    nums[i] = Integer.parseInt(linea);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalido - sscribe solo un numero entero.");
                }
            }
        }

        int mayor = nums[0];
        int menor = nums[0];
        for (int v : nums) {
            if (v > mayor) mayor = v;
            if (v < menor) menor = v;
        }

        System.out.println("\nMayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
