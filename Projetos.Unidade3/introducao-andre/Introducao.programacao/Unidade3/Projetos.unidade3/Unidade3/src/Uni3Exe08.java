//considerando a cotação do dólar em R$5,65

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor em dólares: ");
        double dolar = leitor.nextDouble();
        double reais = dolar * 5.65;
        System.out.printf("O atendente deve devolver R$%.2f para o cliente.", reais);
        leitor.close();
    }
}
