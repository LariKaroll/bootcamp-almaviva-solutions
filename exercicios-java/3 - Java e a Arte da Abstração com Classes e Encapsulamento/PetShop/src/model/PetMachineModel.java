package model;

import control.PetControl;

import java.util.Scanner;

public class PetMachineModel extends PetControl {
    Scanner sc = new Scanner(System.in);
    private PetControl pet;
    int shampoo = getShampoo();
    int water = getWater();

    public PetMachineModel(){
    }
    public PetMachineModel(PetControl pet){
        this.pet = pet;
    }
    public PetMachineModel(String name, int water, int shampoo, boolean empityMachine, boolean clear) {
        super(name, water, shampoo, empityMachine, clear);
    }

    public void namePet(){
        System.out.println("Infome o nome do Pet: ");
    }

    public void bathingPet(){
        if(isClean() && !isEmpityMachine() && getWater() >= 10 && getShampoo() >= 2){
            shampoo -= 2;
            water -= 10;
            setWater(water);
            setShampoo(shampoo);
            setClean(false);
            System.out.println( getName() + " tomou banho!");
        }else {
            System.out.println("Verifique a Maquina!");
        }
    }
    public void takeAShower(){
        if(!isEmpityMachine()){
            System.out.println("Tem pet na maquina!\nName: "+getName());
        }else {
            System.out.println("Nao tem pet na Maquina!");
        }
    }
    public void addWater(){
        if(getWater() == 30){
            setWater(30);
            System.out.println("Maquina esta com a capacidade maxima de agua!");
        }else {
            water += 2;
            setWater(water);
            System.out.println("Agua Adicionada!");
        }
    }

    public void verifyWater(){
        System.out.println(getWater()+ " Litros de agua!");
    }

    public void addShampo(){
        if(getShampoo() == 10){
            setShampoo(10);
            System.out.println("Maquina esta com a capacidade maxima de shampoo!");
        }else {
            shampoo += 2;
            setShampoo(shampoo);
            System.out.println("Shampoo Adicionado!");
        }
    }

    public void verifyShampoo(){
        System.out.println(getShampoo()+ " Litros de shampoo!");
    }

    public void setPetInMachine(){
        if(isClean() && isEmpityMachine()){
            setEmpityMachine(false);
            System.out.println("O pet " + getName() + " foi colocado na maquina!");
        }else if(!isEmpityMachine()){
            System.out.println("Maquina cheia!");
        }
    }

    public void removePet(){
        setEmpityMachine(true);
        System.out.println("O pet " + getName() + " foi removido!");
    }

    public void cleanMachine(){
        if(getWater() >= 3 && getShampoo() >= 1){
            shampoo -= 1;
            water -= 3;
            setShampoo(shampoo);
            setWater(water);
            setClean(true);
            System.out.println("Maquina limpa com Sucesso!");
        }else {
            System.out.println("Verifique a Agua!\nVerifique o Shampoo!");
        }
    }
}
