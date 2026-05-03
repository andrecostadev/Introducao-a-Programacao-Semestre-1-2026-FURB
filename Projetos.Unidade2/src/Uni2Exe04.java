import java.util.Scanner;

// A: 3.5  B: 7.5

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();

        double media = (valor1 * 3.5) + (valor2 * 7.5),
        mediap = media / 11;


        System.out.printf("A media é : %.2f", mediap);
        leitor.close();

    }
}
