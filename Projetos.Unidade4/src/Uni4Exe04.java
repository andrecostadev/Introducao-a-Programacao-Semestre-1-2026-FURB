import java.util.Scanner;

/*
Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.
*/

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float num = leitor.nextFloat();

        if(num % 1 != 0){
        System.out.print("Casas decimais foram digitadas");
        } else {
        System.out.print("Casas decimais não foram digitadas");
        }
        leitor.close();

    }
}
