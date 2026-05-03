import java.util.Scanner;
 


public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o cateto oposto: ");
        double cateto1 = leitor.nextDouble();
        System.out.print("Informe o cateto adjacente: ");
        double cateto2 = leitor.nextDouble();

        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);

        System.out.printf("A hipotenusa é: %.2f", hipotenusa);
        leitor.close();
    }
}
