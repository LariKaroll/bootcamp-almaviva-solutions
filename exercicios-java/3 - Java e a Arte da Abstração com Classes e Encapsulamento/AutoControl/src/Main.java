import controller.CarroController;
import model.EntradaModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EntradaModel start = new EntradaModel();
        CarroController carro1 = new CarroController("Sandero",false, 0,0);

        int index = 0;
        start.entradaPrograma();
        do{
            int option = sc.nextInt();
            start.escolhaStart(option);
            index = option;
        }while (index < 8);
    }
}