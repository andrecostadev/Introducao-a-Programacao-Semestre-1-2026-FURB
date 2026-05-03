import java.util.Scanner;

// Entrada: Informar Nome, numero de horas trabalhadas mensais, num dependentes.



public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = leitor.next();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double horastrab = leitor.nextDouble();
        System.out.print("Digite a quantidade de dependetes: ");
        double dependentes = leitor.nextDouble();
        
        
        double salariotrab = horastrab * 10;
        double salariofamilia = dependentes * 60;
        double salariobruto = salariotrab + salariofamilia;
    
        double descontoinss = salariotrab * 0.085;
        double descontoir =  salariotrab * 0.05;

        double salarioliq = salariobruto - (descontoinss + descontoir);

        System.out.printf("O funcionário %s possui um salário bruto de R$%.2f um salário líquido de R$%.2f ", nome, salariobruto, salarioliq);
        leitor.close();
    }
}


