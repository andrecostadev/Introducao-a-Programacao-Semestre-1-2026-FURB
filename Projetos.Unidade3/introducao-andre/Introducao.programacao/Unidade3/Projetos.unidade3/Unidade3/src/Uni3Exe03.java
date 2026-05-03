import java.util.Scanner;

//Analise: o valor será em litros;
//Entrada: Valor em Reais;
//Processo: litros = valor / preço da gasolina;
//Saída: Retornar valor dos litros;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); // ativar o scanner;
        System.out.print("Digite o valor pago: "); //Ler o valor pago;
        Float valorpag = valor.nextFloat(); //atribuir o valor pago para a variável;
        Float litros = valorpag / 5.75f; // realizar o processo de divisão pelo valor da gasolina;
        System.out.printf("O motorista conseguiu colocar: %.2f litros", litros); // Executa a saída em litros, limitando a duas casas decimais 
        valor.close();
    }
}
