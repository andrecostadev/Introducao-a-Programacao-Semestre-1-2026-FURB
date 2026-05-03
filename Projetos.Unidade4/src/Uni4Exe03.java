import java.util.Scanner;
/*
Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
*/

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();

        if (n1 > n2) {
            System.out.printf("O valor %d é maior do que o valor %d ", n1, n2);
        } 
        else if(n2 > n1) {
            System.out.printf("O valor %d é maior do que o valor %d ", n2, n1);
        } else {
            System.out.printf("Os valores são iguais! ");
        }
        leitor.close();

    }
}
