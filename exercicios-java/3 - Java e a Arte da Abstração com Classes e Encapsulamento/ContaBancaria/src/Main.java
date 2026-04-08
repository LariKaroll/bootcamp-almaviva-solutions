import control.Start;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start programa = new Start();

        int escolha = -1;

        do{
            programa.startPrograma();
            escolha = sc.nextInt();
            programa.escolha(escolha);
        }while (escolha != 0);
    }
}