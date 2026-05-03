import java.util.Scanner;

public class Uni4Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        int op;

        do {
            // Menu
            System.out.println("\nMenu");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("Saldo: R$%.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Valor para depósito: ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;

                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = sc.nextDouble();

                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 4);

        sc.close();
    }
}
