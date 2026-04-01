import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numberMultiplicador = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Digite o numero que deseja a tabuada: ");
        int number = sc.nextInt();

        for(int i = 0; i < numberMultiplicador.length; i++){
            int produtoMultiplicacao = (numberMultiplicador[i]*number);
            System.out.println(number + " X " + numberMultiplicador[i] +" = "+ produtoMultiplicacao);
        }
    }
}
