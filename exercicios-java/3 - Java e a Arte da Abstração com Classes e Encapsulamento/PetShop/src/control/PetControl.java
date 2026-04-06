package control;

public class PetControl {
    private String name;
    private int water;
    private int shampoo;
    private boolean empityMachine = true;
    private boolean clean = true;

    public PetControl(String name, int water, int shampoo, boolean empityMachine, boolean clean) {
        this.name = name;
        this.water = water;
        this.shampoo = shampoo;
        this.empityMachine = empityMachine;
        this.clean = clean;
    }

    public PetControl() {
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public void setName(String name) {
        this.name = name;
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
