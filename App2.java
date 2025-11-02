import java.util.*;

public class App2 {
    public static void main(String[] args) throws Exception {
    
        ArrayList<String> lista_cantantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String cantante;
        
        while (true) { 
            System.out.println("Escribe un nombre de tus cantantes favoritos: ");
            cantante = scanner.nextLine();
            
            if(cantante.equals("pato")){
                break;
            }
            
            lista_cantantes.add(cantante);
        }

        System.out.println("\nLista de cantantes que ingresaste:");
        for (String lista_cantante : lista_cantantes) {
            System.out.println("- " + lista_cantante);
        }

        scanner.close();
    }
        
}
