import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        
        
        double raio = value.nextDouble(),
        area = Math.pow(raio, 2) * Math.PI;
        
        System.out.printf ("A área é %.1f ", area);
        value.close();
        

    }

}
