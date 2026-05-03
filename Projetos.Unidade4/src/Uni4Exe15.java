import java.util.Scanner;

/* 
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste
*/

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Quantidade de meses que o funcionário foi admitido: ");
        int meses = id.nextInt();

        if (meses <= 12) {
            System.out.print("O funcionário irá receber 5% de reajuste"); 
        } else if ( meses >= 13 && meses <= 48) {
             System.out.print("O funcionário irá receber 7% de reajuste"); 
        } else {
            System.out.print("Reajuste não informado");
        }
        id.close();
    }    
}
