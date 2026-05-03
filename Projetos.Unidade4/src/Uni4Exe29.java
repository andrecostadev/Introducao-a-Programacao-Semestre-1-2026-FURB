import java.util.Scanner;

public class Uni4Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char op = sc.next().charAt(0);

        // Processamento
        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;

            case '-':
                System.out.println(n1 - n2);
                break;

            case '*':
                System.out.println(n1 * n2);
                break;

            case '/':
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;

            default:
                System.out.println("Operação inválida");
        }

        sc.close();
    }
}