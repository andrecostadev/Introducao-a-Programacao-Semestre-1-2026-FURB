import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().toUpperCase().charAt(0);
        double area;

        switch (op) {
            case 'T':
                double bT = sc.nextDouble();
                double hT = sc.nextDouble();
                area = (bT * hT) / 2;
                System.out.println(area);
                break;

            case 'Q':
                double l = sc.nextDouble();
                area = l * l;
                System.out.println(area);
                break;

            case 'R':
                double bR = sc.nextDouble();
                double hR = sc.nextDouble();
                area = bR * hR;
                System.out.println(area);
                break;

            case 'C':
                double r = sc.nextDouble();
                area = Math.PI * r * r;
                System.out.printf("%.2f\n", area);
                break;

            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}