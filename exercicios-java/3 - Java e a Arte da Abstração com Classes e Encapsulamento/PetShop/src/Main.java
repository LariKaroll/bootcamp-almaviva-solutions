import control.StartPetShopControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartPetShopControl start = new StartPetShopControl();
        Scanner scanner = new Scanner(System.in);

        int option = -1;
        start.namePet();

        do{
            start.start();
            option = scanner.nextInt();
            start.optionPetMachine(option);
        }while (option != 0);
    }
}