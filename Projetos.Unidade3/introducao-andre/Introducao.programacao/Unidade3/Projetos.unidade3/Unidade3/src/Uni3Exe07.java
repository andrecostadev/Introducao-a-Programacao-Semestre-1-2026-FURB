import java.util.Scanner;


// Entrada: quantidade de cada refrigerante
//Processo: multiplicar pela quantidade de litros de cada lata

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int ml350, ml600, lt2; 
        double litros; //variaveis

        System.out.print("Quantidade de 350ml: ");
        ml350 = leitor.nextInt();
        System.out.print("Quantidade de 600ml: ");
        ml600 = leitor.nextInt();
        System.out.print("Quantidade de 2lt: ");
        lt2 = leitor.nextInt();

        litros = (ml350 * 0.35) + (ml600 * 0.60) + (lt2 * 2);
        System.out.printf("O cliente comprou ao total %.2f litros", litros);
        leitor.close();
    }
}
