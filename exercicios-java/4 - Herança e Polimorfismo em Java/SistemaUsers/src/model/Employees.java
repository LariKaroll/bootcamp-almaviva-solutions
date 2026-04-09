package model;

public sealed abstract class Employees permits Gerente,Vendedor,Atendente {
    private String name;
    private String email;
    private String password;
    private boolean administrador;

    public Employees(String name, String email, String password, boolean administrador) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.administrador = administrador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract boolean isAdministrador();

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
