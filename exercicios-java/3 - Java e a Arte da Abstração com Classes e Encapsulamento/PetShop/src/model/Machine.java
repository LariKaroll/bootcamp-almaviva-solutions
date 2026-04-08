package model;

public class Machine {
    private int water;
    private int shampoo;
    private boolean empityMachine = true;


    public Machine(){

    }

    public Machine(int water, int shampoo, boolean empityMachine) {
        this.water = water;
        this.shampoo = shampoo;
        this.empityMachine = empityMachine;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public boolean isEmpityMachine() {
        return empityMachine;
    }

    public void setEmpityMachine(boolean empityMachine) {
        this.empityMachine = empityMachine;
    }
}
