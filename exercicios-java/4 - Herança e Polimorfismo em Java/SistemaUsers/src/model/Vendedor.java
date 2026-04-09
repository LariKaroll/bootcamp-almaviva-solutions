package model;

public non-sealed class Vendedor extends Employees{

    private int quantidadeDeVendas;

    public Vendedor(String name, String email, String password, boolean administrador, int quantidadeDeVendas) {
        super(name, email, password, administrador);
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    @Override
    public boolean isAdministrador(){
        return false;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
