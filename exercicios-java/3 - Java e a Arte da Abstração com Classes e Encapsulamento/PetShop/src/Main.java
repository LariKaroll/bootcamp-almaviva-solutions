import control.PetControl;
import model.PetMachineModel;
import model.StartPetShopModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartPetShopModel petShopModel = new StartPetShopModel();
        PetMachineModel machine = new PetMachineModel();
        PetControl pet = new PetControl();
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        machine.namePet();
        pet.setName(scanner.next());
        do{
            petShopModel.start();
            option = scanner.nextInt();
            petShopModel.optionPetMachine(option);
        }while (option != 0);
    }
}