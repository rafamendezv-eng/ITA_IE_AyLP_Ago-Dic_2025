public class Invertir_elementos {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[6];

        for (int i = 0; i < nums.length; i++) {
            while (true) {
                System.out.print("Numero " + (i + 1) + " de 6: ");
                String linea = sc.nextLine().trim();
                try {
                    nums[i] = Integer.parseInt(linea);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalido - escribe solo un numero entero.");
                }
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = tmp;
        }

        System.out.println("\nArray invertido:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println((i + 1) + ": " + nums[i]);
        }

        sc.close();
    }
}
