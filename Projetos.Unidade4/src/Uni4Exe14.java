import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = id.nextInt();
        System.out.print("Digite o mês: ");
        int mes = id.nextInt();
        System.out.print("Digite o mês: ");
        int ano = id.nextInt();
    
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            if (mes >= 1 && mes <= 12) {
                if ((mes == 2) && dia <= 29)  {
                    System.out.print("Válida");
                } else {
                    System.out.print("Não Válida");
                }

            } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
                System.out.print("Válida");     
            } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
                System.out.print("Válida");
            } else {
                System.out.print("Não Válida");
            }

        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
            System.out.print("Válida");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
            System.out.print("Válida");
        } else {
            System.out.print("Não Válida");
        }
        id.close();
    } 

}
  

