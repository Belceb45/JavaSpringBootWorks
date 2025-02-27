import java.util.Scanner;

public class Reto1 {
    public static String convertirBinario(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");

        // Verifica si hay un número disponible
        int numero = sc.nextInt();
        System.out.println(numero + " ----> " + convertirBinario(numero));
         
        sc.close();
    }
}
