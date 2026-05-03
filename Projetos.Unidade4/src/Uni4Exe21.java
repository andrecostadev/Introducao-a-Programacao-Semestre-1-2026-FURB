import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Massa: ");
        double massa = sc.nextDouble();

        // Cálculo do imc
        double imc = massa / (altura * altura);

        // Classificação
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25.0) {
            System.out.println("Saudável");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        
        sc.close();
    }
}