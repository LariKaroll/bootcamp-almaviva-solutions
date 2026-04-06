import model.StartPetShopModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartPetShopModel start = new StartPetShopModel();
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        do{
            start.start();
            option = scanner.nextInt();

        }while (option != 0);
        start.start();
    }
}