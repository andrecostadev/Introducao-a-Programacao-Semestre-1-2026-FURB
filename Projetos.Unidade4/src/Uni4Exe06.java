import java.util.Scanner;

/* 
Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”
. Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.
*/
public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String letra = leitor.next();
        letra = letra.toUpperCase();

        if (letra.equals("M")) {
            System.out.print("Masculino");  
        } 
        else if (letra.equals("F")) {
          System.out.print("Feminino");
        }
        else if (letra.equals("i")) {
            System.out.print("Não informado");
        } 
        else {
            System.out.print("Entrada Incorreta");
        }
        leitor.close();
    }
    
}
