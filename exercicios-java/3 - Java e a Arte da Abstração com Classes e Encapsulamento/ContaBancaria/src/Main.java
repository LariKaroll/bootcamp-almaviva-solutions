import model.ContaBancaria;
import model.StartPrograma;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        StartPrograma programa = new StartPrograma();

        programa.startPrograma();

        int i = 0;
        do{
            int escolha = sc.nextInt();
            if(escolha > 0 && escolha <= 6){
                programa.escolha(escolha);
                programa.escolherContinuar();
                String escolherContinuar = sc.next();

                if(Objects.equals(escolherContinuar, "S") || Objects.equals(escolherContinuar, "s")){
                    programa.startPrograma();
                }else if((Objects.equals(escolherContinuar, "N") || Objects.equals(escolherContinuar, "n"))){
                    break;
                }else{
                    System.out.println("Valor invalido!");
                    break;
                }
            } else if (escolha == 7) {
                i = escolha;
                System.out.println("Sessão Finalizada!");
                break;
            } else {
                System.out.println("---------------------------------------------------------");
                System.out.println("Escolha uma opcao valida!");
                programa.startPrograma();
            }

        }while (i < 7);

    }
}