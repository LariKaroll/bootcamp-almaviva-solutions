package model;

public non-sealed class Gerente extends Employees{


    public Gerente(String name, String email, String password, boolean administrador) {
        super(name, email, password, administrador);
    }

    @Override
    public boolean isAdministrador(){
        return true;
    }
}
