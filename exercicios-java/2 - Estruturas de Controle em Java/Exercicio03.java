import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int firstNumber = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int secondNumber = sc.nextInt();

        System.out.println("1 - Par\n2 - Impar");
        int escolha = sc.nextInt();

        for(int i = secondNumber; i > firstNumber; i--){
            if(escolha == 1){
                if(i %2 == 0) {
                    System.out.println("Numero Par: " + i);
                }
            }else if(escolha == 2){
                if(i %2 != 0){
                    System.out.println("Numero Impar: " + i);
                }
            }
        }
    }
}
