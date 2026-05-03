import java.util.Scanner;

/*
Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
 Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.
*/

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Digite a idade 1: ");
        int id1 = user.nextInt();
        System.out.print("Digite a idade 2: ");
        int id2 = user.nextInt();
        System.out.print("Digite a idade 3: ");
        int id3 = user.nextInt();

        if (id1 == id2 && id2 == id3 && id1 == id3) {
            System.out.print("TRIGÊMEOS");
        } else if(id1 == id2 || id2 == id3 || id1 == id3) {
            System.out.print("GÊMEOS");
        } else {
            System.out.print("APENAS IRMÃOS");
        }
        user.close();
    }
}
