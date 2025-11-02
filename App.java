public class App {
    public static void main(String[] args) throws Exception {
       
        int sumaimpares=0;

        for(int i=1;i<=100;i++){
            if(i%2 !=0){
                sumaimpares=sumaimpares+i;
            }
        }
        
        System.out.println("La suma de los números impares del 1 al 100 es: " + sumaimpares);
    }
}
