package control;

public class PetControl {
    private final String name;
    private int water;
    private int shampoo;
    private boolean empityMachine;

    public PetControl(String name, int water, int shampoo, boolean empityMachine) {
        this.name = name;
        this.water = water;
        this.shampoo = shampoo;
        this.empityMachine = empityMachine;
    }

    public String getName() {
        return name;
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
