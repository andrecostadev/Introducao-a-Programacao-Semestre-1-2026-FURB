import java.util.Scanner;


public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner un = new Scanner(System.in);
        System.out.print("Escreva dois números inteiros: ");
        int num1 = un.nextInt(), 
        num2 = un.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0 ) {
            System.out.print("Os valores são multiplos");
        } else{
            System.out.print("Os valores não são multiplos");
        }
        un.close();
    }    
}
