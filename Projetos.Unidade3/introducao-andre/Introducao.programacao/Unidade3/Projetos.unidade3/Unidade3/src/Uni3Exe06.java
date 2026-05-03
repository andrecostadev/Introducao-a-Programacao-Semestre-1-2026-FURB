import java.util.Scanner;


public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Peso do prato em kg: ");
        Double peso = teclado.nextDouble();
        Double valortotal = (peso - 0.75) * 25 ;
        System.out.printf("O valor do prato do cliente é: R$%.2f " , valortotal);
        teclado.close();
    }    
}
