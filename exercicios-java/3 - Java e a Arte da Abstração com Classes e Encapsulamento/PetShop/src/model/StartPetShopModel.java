package model;

import control.PetControl;

import java.util.Scanner;

public class StartPetShopModel {
    PetMachineModel machine = new PetMachineModel();
    Scanner sc = new Scanner(System.in);
    public StartPetShopModel(){
    }

    public void println(String mensage){
        System.out.println(mensage);
        return;
    }
    public void start(){
        println("---------------------------------");
        println("1 - Dar banho no pet");
        println("2 - Abastecer com água");
        println("3 - Abastecer com shampoo");
        println("4 - Verificar nivel de água");
        println("5 - Verificar nivel de shampoo");
        println("6 - Verificar se tem pet no banho");
        println("7 - Colocar pet na máquina");
        println("8 - Retirar pet da máquina");
        println("9 - Limpar maquina");
        println("0 - Finalizar");
        println("---------------------------------");
    }

    public void optionPetMachine(int option){
        switch (option){
            case 1 -> machine.bathingPet();
            case 2 -> machine.addWater();
            case 3 -> machine.addShampo();
            case 4 -> machine.verifyWater();
            case 5 -> machine.verifyShampoo();
            case 6 -> machine.takeAShower();
            case 7 -> machine.setPetInMachine();
            case 8 -> machine.removePet();
            case 9 -> machine.cleanMachine();
        }
    }


}
