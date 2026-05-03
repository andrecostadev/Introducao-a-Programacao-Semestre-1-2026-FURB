import java.util.Scanner;


public class Uni3Exe02 {

    //Entrada: valor do produto;
    //Processo: calcular o deconto(12%);
    //Saída: Devolver o valor com o desconto;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // ativar scanner
        System.out.print("Digite o valor do produto: R$"); // pegar valor
        float produto = leitor.nextFloat(); // atribuir valor a uma variável
        Float desconto = (12 * produto) / 100; //Processo = calculo do desconto
        Float valorfinal = produto - desconto;  // Processo = preço - desconto
        System.out.printf("O valor do desconto é: %.2f R$", desconto); //Saída do desconto
        System.out.printf("O preço do par de sapatos com desconto é: %.2f R$", valorfinal); //Saída do valor total
        leitor.close(); // fechar variável
    }
    
}
