import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int number = sc.nextInt();
        int numeroResto;
        int resto;

        do{
            System.out.println("Informe um numero maior:");
            int numberMaior = sc.nextInt();

            if(numberMaior < number){
                System.out.println("Numero ignorado: " + numberMaior);
                resto = 0;
                continue;
            }

            resto = numberMaior % number;

            if(resto == 0){
            System.out.println("Divisao exata!");
            }else{
                System.out.println("Resto e "+ resto +".\nFIM");
            }

        }while (resto == 0);
    }
}
