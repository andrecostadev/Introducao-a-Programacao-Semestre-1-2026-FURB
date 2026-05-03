import java.util.Scanner;

/*
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes).
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
*/

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Informe a idade do primeiro homem: ");
        int id1 = id.nextInt();
        System.out.print("Informe a idade do segundo homem: ");
        int id2 = id.nextInt();
        System.out.print("Informe a idade da primeira mulher: ");
        int id3 = id.nextInt();
        System.out.print("Informe a idade da segunda mulher: ");
        int id4 = id.nextInt();
        
        if (id1 > id2) {
            if (id3 > id4) {
                int soma = id1 + id4;
                int produto = id2 * id3;
                System.out.print("Soma: " + soma + " Produto: " + produto);
            } else if (id4 > id3) {
                int soma = id1 + id3;
                int produto = id2 * id4;
                System.out.print("Soma: " + soma + " Produto: " + produto);
            }
        } else if (id2 > id1) {
            if (id3 > id4) {
                int soma = id2 + id4;
                int produto = id1 * id3;
                System.out.print("Soma: " + soma + " Produto: " + produto);
            } else if (id4 > id3) {
                int soma = id2 + id3;
                int produto = id1 * id4;
                System.out.print("Soma: " + soma + " Produto: " + produto);
            }
        } 
    id.close();
    }    
}
