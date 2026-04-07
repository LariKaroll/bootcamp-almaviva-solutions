import model.Carro;
import controller.EntradaControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EntradaControl start = new EntradaControl();

        int index = -1;

        do{
            start.entradaPrograma();
            int option = sc.nextInt();
            start.escolhaStart(option);
            index = option;
        }while (index != 0);
    }
}