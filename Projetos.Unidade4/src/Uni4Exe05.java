import java.util.Scanner;

/*
Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/


public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("A cor é azul? ");
        boolean resp = leitor.nextBoolean();

        if (resp == true) {
            System.out.print("Sim");
        } else{
            System.out.print("Não");
        }
        leitor.close();
    
    }

}
