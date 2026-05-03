import java.util.Scanner;

    //Entrada: Notas do aluno
    //Processo: Calcular a media ponderada 
    //Saída: Valor da nota final

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in); //ativar scanner
        System.out.print("Digite o valor da nota 1: "); //pegar o valor da nota 1
        float nota1 = nota.nextFloat(); // atribuir para uma variável
        System.out.print("Digite o valor da nota 2: "); //pegar o valor da nota 2
        float nota2 = nota.nextFloat(); // atribuir para uma variável
        System.out.print("Digite o valor da nota 3: "); //pegar o valor da nota 3
        float nota3 = nota.nextFloat(); // atribuir para uma variável
        float mediapond = ((nota1 * 5)+(nota2* 3)+(nota3 * 2))/ 10; // processo seguindo a fórmula de média ponderada
        System.out.print("Valor da media pomderada: " + mediapond); // saída de valor da média
        nota.close(); //fechar Scanner
    }
}
