public class Contar_Par_Impar {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            while (true) {
                System.out.print("Numero " + (i + 1) + " de 10: ");
                String linea = sc.nextLine().trim();
                try {
                    nums[i] = Integer.parseInt(linea);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inavlido - escribe solo un numero entero.");
                }
            }
        }

        int pares = 0, impares = 0;
        for (int v : nums) {
            if (v % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        sc.close();
    }
}