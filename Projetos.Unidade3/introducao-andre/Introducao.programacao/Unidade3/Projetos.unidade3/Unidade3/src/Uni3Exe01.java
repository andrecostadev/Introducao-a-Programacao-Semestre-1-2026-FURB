import java.util.Scanner;


public class Uni3Exe01 {

    //Análise: sera considerado metros
    //Entrada: Largura e comprimento
    //Saída: area do terreno
    //Processo: area = multiplicação da largura pelo comprimento
    //Fluxograma:


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Ativação do Scanner
        System.out.print("Digite a largura: "); //Pede a largura
        float largura = teclado.nextFloat(); //guardado na variável
        System.out.print("Digite o comprimento: "); //Pede o comprimento
        float comprimento = teclado.nextFloat(); //guardado na variável
        float area = largura * comprimento; //Processo
        System.out.print("Área: " + area + "m²"); //Saída
        teclado.close(); //Fechar a variável

    }
}
