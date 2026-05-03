import java.util.Scanner;



public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //ativar Scanner
        System.out.print("Informe a quantidade de frangos: "); //Pegar o valor de frango 
        int quantfrango = leitor.nextInt(); //atribuir valor a variável
        int valortotal = quantfrango * 11; //Processo: multiplicar a quantidade de frangos pelo preço total de marcar um frango;
        System.out.print("O gasto total para marcar " + quantfrango + " frangos é de: R$" + valortotal); //Saída do valor total;
        leitor.close(); // fechar scanner
    }
}
