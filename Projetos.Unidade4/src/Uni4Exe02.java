import java.util.Scanner;

/*
Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

Exemplos de entrada	    Exemplos de saída
625              	    Número é ímpar
84	                    Número é par

*/

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        if (valor > 0 && valor % 2 == 0) {
            System.out.print("Número é par");
        } else {
            System.out.print("Número é ímpar");
        }
        leitor.close();
    }
    
}
