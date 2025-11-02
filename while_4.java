public class while_4 {
    public static void main(String[] args) throws Exception{
        System.out.println("Números entre 1 y 100 divisibles por 3 y por 5:");
        
        int numero = 1;
        int contador = 0;
        while (numero <= 100) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
        
    }
    
}
