import java.util.Scanner;

// m² = R$112.50

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o comprimento em metros: ");
        double comprimento = leitor.nextDouble();
        System.out.print("Informe a altura em metros: ");
        double altura = leitor.nextDouble();

        double area = comprimento * altura;
        double valorfinal = area * 112.50;

        System.out.printf("O valor final é R$%.2f ", valorfinal );
        leitor.close();
    }
}
