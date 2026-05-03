import java.util.Scanner;

/*
jornada de trabalho semanal de um funcionário é de 40 horas
hora extra:  valor da hora regular com um acréscimo de 50%
- leia o número de horas trabalhadas em um mês, o valor por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras

ex:
- Horas trabalhadas no mês: 180	
Valor pago por hora: 35	O salário total é: 6650,00
*/

public class Uni4Exe01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Número de horas trabalhadas: ");
        double horas = leitor.nextDouble();
        
        System.out.print("Valor hora: ");
        double valorhora = leitor.nextDouble();
        
         // Limita o salário base a no máximo 160 horas
        double horasBase = Math.min(horas, 160),
        salariobase = horasBase * valorhora;

         
        if (horas > 0 && horas <= 160) {
            System.out.printf("O salário total é: " + salariobase);
        } else {
            double extra = horas - 160,
            salarioextra = 1.5 * valorhora * extra,
            salTotal = salariobase + salarioextra;

            System.out.printf("O salário total é: " + salTotal);

        }

        leitor.close();
    }
}