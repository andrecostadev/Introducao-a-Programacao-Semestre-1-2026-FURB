import java.util.Scanner;



public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 999: ");
        int number = leitor.nextInt();

        if (number >= 0 && number <= 999) {
            int centena = number / 100;
            int dezena = (number % 100) /10;
            int unidade = number % 10;

            System.out.printf("%d centena(s)   %d dezena(s)    %d unidade(s)", centena, dezena, unidade);
        } else {
            System.out.print("Número inválido!");
        }

        leitor.close();
    }    
}
