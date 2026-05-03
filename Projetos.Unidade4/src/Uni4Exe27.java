import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hC = sc.nextInt();
        int mC = sc.nextInt();
        int hS = sc.nextInt();
        int mS = sc.nextInt();


        if (hC < 0 || hC > 23 || hS < 0 || hS > 23 ||
            mC < 0 || mC > 59 || mS < 0 || mS > 59 ||
            (hS * 60 + mS) < (hC * 60 + mC)) {

            System.out.println("Horário inválido");

        } else {

            int totalMin = (hS * 60 + mS) - (hC * 60 + mC);
            int horas;

            if (totalMin < 30) {
                horas = 1;
            } else {
                horas = totalMin / 60;
                if (totalMin % 60 >= 30) {
                    horas++;
                }
            }

            double preco = 0;

            for (int i = 1; i <= horas; i++) {
                switch (i) {
                    case 1:
                    case 2:
                        preco += 5.0;
                        break;
                    case 3:
                    case 4:
                        preco += 7.5;
                        break;
                    default:
                        preco += 10.0;
                }
            }

            System.out.printf("Preço cobrado = R$%.2f\n", preco);
        }

        sc.close();
    }
}