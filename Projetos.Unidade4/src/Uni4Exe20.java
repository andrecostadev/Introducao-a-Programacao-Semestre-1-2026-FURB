import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double ne = sc.nextDouble();

        // Cálculo da média ponderada
        double media = (n1 + (n2 * 2) + (n3 * 3) + ne) / 7;

        String conceito;
        String situacao;

        // Definição do conceito
        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Situação do aluno
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %s. %s\n",
                media, conceito, situacao);
        sc.close();
    }
}