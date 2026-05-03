import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Valor 1: ");
        double v1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double v2 = sc.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números");

        int op = sc.nextInt();

        // Processamento com switch
        switch (op) {
            case 1:
                System.out.println(v1 + v2);
                break;

            case 2:
                System.out.println(v1 - v2);
                break;

            case 3:
                System.out.println(v1 * v2);
                break;

            case 4:
                if (v2 != 0) {
                    System.out.println(v1 / v2);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;

            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}