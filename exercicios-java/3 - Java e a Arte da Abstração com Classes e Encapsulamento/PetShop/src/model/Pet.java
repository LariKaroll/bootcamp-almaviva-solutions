package model;

public class Pet {
    private String name;
    private boolean clean = true;

    public Pet(String name, boolean clean) {
        this.name = name;
        this.clean = clean;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
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
}
