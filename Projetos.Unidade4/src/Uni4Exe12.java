import java.util.Scanner;


public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Digite os lados de um triângulo: ");

        double l1 = id.nextDouble(), l2 = id.nextDouble(), l3 = id.nextDouble();
        
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l2 + l1) {
            if (l1 == l2 && l2 == l3 && l1 ==l3) {
                System.out.print("É equilátero.");
            } else if(l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.print("É isóceles.");
            }  else {
                System.out.print("É escaleno.");
            }   
        } else{
            System.out.print("Não formam um triângulo.");
        } 

        id.close();
    }
}


