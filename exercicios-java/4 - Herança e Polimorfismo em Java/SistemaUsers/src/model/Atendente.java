package model;

public non-sealed class Atendente extends Employees{

    private double valueInBox;

    public Atendente(String name, String email, String password, boolean administrador, double valueInBox) {
        super(name, email, password, administrador);
        this.valueInBox = valueInBox;
    }

    @Override
    public boolean isAdministrador(){
        return false;
    }

    public double getValueInBox() {
        return valueInBox;
    }

    public void setValueInBox(double valueInBox) {
        this.valueInBox = valueInBox;
    }
}
