import java.util.Scanner;

/* 
O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. 
Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
Exemplos de entrada	        Exemplos de saída
105	                          1.8
50	                          0.45

*/

public class Uni4Exe07 {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int grama = user.nextInt();

    if (grama <= 50) {
        System.out.print("0.45");
    } else{
        double excesso = grama - 50;
        double unidades = Math.ceil(excesso / 20.0);
        double valormais = unidades * 0.45;

        System.out.print(valormais);

    }
    user.close();
  }  
}
