package control;

import model.Machine;
import model.Pet;

import java.util.Scanner;

public class PetMachineModel extends Pet {
    Scanner sc = new Scanner(System.in);
    Machine machine = new Machine();

    public PetMachineModel(){
    }
    public PetMachineModel(String name, boolean clear) {
        super(name, clear);
    }


    public void bathingPet(){
        if(isClean() && !machine.isEmpityMachine() && machine.getWater() >= 10 && machine.getShampoo() >= 2){
            machine.setWater(machine.getWater() - 2);
            machine.setShampoo(machine.getShampoo() - 10);
            setClean(false);
            System.out.println( getName() + " tomou banho!");
        }else {
            System.out.println("Verifique a Maquina!");
        }
    }
    public void verifyEmpity(){
        if(!machine.isEmpityMachine()){
            System.out.println("Tem pet na maquina!\nName: "+getName());
        }else {
            System.out.println("Nao tem pet na Maquina!");
        }
    }
    public void addWater(){
        if(machine.getWater() == 30){
            machine.setWater(30);
            System.out.println("Maquina esta com a capacidade maxima de agua!");
        }else {
            machine.setWater(machine.getWater() + 2);
            System.out.println("Agua Adicionada!");
        }
    }

    public void verifyWater(){
        System.out.println(machine.getWater()+ " Litros de agua!");
    }

    public void addShampo(){
        if(machine.getShampoo() == 10){
            machine.setShampoo(10);
            System.out.println("Maquina esta com a capacidade maxima de shampoo!");
        }else {
            machine.setShampoo(machine.getShampoo() + 2);
            System.out.println("Shampoo Adicionado!");
        }
    }

    public void verifyShampoo(){
        System.out.println(machine.getShampoo()+ " Litros de shampoo!");
    }

    public void setPetInMachine(){
        if(isClean() && machine.isEmpityMachine()){
            machine.setEmpityMachine(false);
            System.out.println("O pet " + getName() + " foi colocado na maquina!");
        }else if(!machine.isEmpityMachine()){
            System.out.println("Maquina cheia!");
        }
    }

    public void removePet(){
        machine.setEmpityMachine(true);
        System.out.println("O pet " + getName() + " foi removido!");
    }

    public void cleanMachine(){
        if(machine.getWater() >= 3 && machine.getShampoo() >= 1){
            machine.setShampoo(machine.getShampoo() - 1);
            machine.setWater(machine.getWater() - 3);
            setClean(true);
            System.out.println("Maquina limpa com Sucesso!");
        }else {
            System.out.println("Verifique a Agua!\nVerifique o Shampoo!");
        }
    }
}
