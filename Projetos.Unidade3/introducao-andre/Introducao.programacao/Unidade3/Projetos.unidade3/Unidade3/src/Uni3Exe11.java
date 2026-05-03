import java.util.Scanner;;


public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner grau = new Scanner(System.in);
        System.out.print("Informe o grau em °C: ");
        double grauC = grau.nextDouble();
        
        double f = (grauC * 9) / 5 + 32;
        System.out.printf("Em °F: %.2f ", f);
        grau.close();
    }
}
