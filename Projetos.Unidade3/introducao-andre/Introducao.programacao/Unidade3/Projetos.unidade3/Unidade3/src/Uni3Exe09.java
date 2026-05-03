 import java.util.Scanner;
 
 // considera o valor de pi sendo 3.14159265359
 
 public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Informe o raio da lata: ");
        double raio = user.nextDouble();
        System.out.print("Informe a altura da lata: ");
        double altura = user.nextDouble();
        
        double volume = 3.14159265359 * (raio * raio) * altura;
        
        System.out.printf("O volume da lata de óleo é %.2f ", volume);
        user.close();

    }
    
 }