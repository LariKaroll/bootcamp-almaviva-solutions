import model.Produtos;
import model.Tributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valueProduct = scanner.nextDouble();

        System.out.println("Escolha o tipo do produto: ");
        System.out.println("1 - Alimento");
        System.out.println("2 - Saude e bem estar");
        System.out.println("3 - Vestuário ");
        System.out.println("4 - Cultura ");

        int option = scanner.nextInt();

        switch (option){
            case 1 -> alimento(new Tributos(valueProduct));
            case 2 -> saudeEBemEstar(new Tributos(valueProduct));
            case 3 -> vestuario(new Tributos(valueProduct));
            case 4 -> cultura(new Tributos(valueProduct));
            default -> System.out.println("Option invalida!");
        }


    }

    public static void alimento(Produtos produtos){
        System.out.println("Alimento");
        System.out.println(produtos.alimento());
    }
    public static void saudeEBemEstar(Produtos produtos){
        System.out.println("Saude e bem estar ");
        System.out.println(produtos.saudeEBemEstar());
    }
    public static void vestuario(Produtos produtos){
        System.out.println("Vestuário ");
        System.out.println(produtos.vestuario());
    }
    public static void cultura(Produtos produtos){
        System.out.println("Cultura");
        System.out.println(produtos.vestuario());
    }
}