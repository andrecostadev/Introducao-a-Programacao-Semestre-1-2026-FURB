import java.util.Scanner;


public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a distancia percorrida em km: ");
        double distancia = ler.nextDouble();
        System.out.print("Informe o tempo gasto em horas: ");
        double tempo = ler.nextDouble();

        double Vm = distancia / tempo;
        double combustivel = distancia / 12;

        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível gasto foi de %.2f litros. ", Vm, combustivel);
        ler.close();
    }
}
