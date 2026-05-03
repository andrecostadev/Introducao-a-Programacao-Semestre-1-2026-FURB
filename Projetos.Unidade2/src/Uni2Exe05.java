import java.util.Scanner;


public class Uni2Exe05 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Informe um valor inteiro natural: ");
        int A = user.nextInt();
        System.out.print("Informe um valor inteiro natural: ");
        int B = user.nextInt();
        System.out.print("Informe um valor inteiro natural: ");
        int C = user.nextInt();
        System.out.print("Informe um valor inteiro natural: ");
        int D = user.nextInt();

        int DIFERENCA = A * B - C * D;

        System.out.printf("O resultado de %d * %d - %d * %d é: %d", A, B, C, D, DIFERENCA);
        user.close();

    }    
}
