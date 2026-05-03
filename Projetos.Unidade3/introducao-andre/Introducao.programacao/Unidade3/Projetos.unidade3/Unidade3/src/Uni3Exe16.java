import java.util.Scanner;


public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Valor total da compra: ");
        int valortotal = leitor.nextInt();
        System.out.print("Valor pago: ");
        int valorpago = leitor.nextInt();

        // valor pago - valor total
        int troco = valorpago - valortotal;
        int nota100 = troco / 100;
        int nota10 = (troco % 100) / 10;
        int nota1 = (troco % 100 )% 10;

        int notastroco = nota100 + nota10 + nota1;

        System.out.printf("O número mínimo de notas de troco é: %d \n", Math.abs(notastroco));
        System.out.printf("Quantidade de notas de 100 necessárias é: %d%nQuantidade de notas de 10 necessárias é: %d%nQuantidade de notas de 1 necessárias é: %d", Math.abs(nota100), Math.abs(nota10), Math.abs(nota1));   
        leitor.close();
    }
}
