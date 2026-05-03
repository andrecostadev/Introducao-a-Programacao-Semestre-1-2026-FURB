import java.util.Scanner;

/*
Saber quem é o caçula! 3 irmãos
*/
public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Idade de Marquinhos: ");
        int marq = id.nextInt();
        System.out.print("Idade de Zezinho: ");
        int ze = id.nextInt();
        System.out.print("Idade de Luluzinha: ");
        int lu = id.nextInt();
        
        if (marq < ze && marq < lu) {
            System.out.print("Marquinhos é o caçula");
        } else if (ze < marq && ze < lu) {
            System.out.print("Zezinho é o caçula");
        } else{
            System.out.print("Luluzinha é a caçula");
        }
        id.close();
    }
}
