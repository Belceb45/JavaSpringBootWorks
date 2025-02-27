
public class Reto2{
    public static void imprimir(){
        int n=0;
        for (int i = 1; i <= 100; i++) {
            n+=i;
            System.out.print(n+",");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.println("Imprimir los primeros 100 numeros\n\n");
        imprimir();
    }
}
