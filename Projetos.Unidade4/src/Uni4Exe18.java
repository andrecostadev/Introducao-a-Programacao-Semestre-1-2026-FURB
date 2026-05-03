import java.util.Scanner;

/* 
. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens.
 Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
*/

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Dia do pagamento: ");
        int dia = id.nextInt();
        System.out.print("Valor da prestação: ");
        int valor = id.nextInt();

        if (dia <= 10) {
            double desconto = (valor * 10) / 100;
            double total = valor - desconto;
            System.out.print("Dia do vencimento: 10" + " Dia do pagamento: " + dia + " O pagamento está em dia. O valor da prestação = R$" + total); 
        } else if (dia > 10 && dia <= 15) {
            System.out.print("Dia do vencimento: 10" + " Dia do pagamento: " + dia + " O pagamento está em dia. O valor da prestação = R$" + valor); 
        } else {
            double multa = (valor * 2) / 100;
            double total = valor + (multa * (dia - 10));
            System.out.print("Dia do vencimento: 10" + " Dia do pagamento: " + dia + " O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" + total);
        }
        id.close();
    }
}
