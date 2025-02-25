import java.util.Scanner;

public class Reto1 {

  public static String convertirBinario(int n){
      String binario=Integer.toBinaryString(n);
      return binario;
  }

    public static void main(String [] args) {
      Scanner sc=new Scanner(System.in);

      int numero=sc.nextInt();
      System.out.println(numero+" ----> "+convertirBinario(numero));
      // System.out.print("Hola Mundo"+numero);
      sc.close();
    
    }
}