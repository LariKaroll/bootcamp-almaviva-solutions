package model;

public non-sealed class IngressoFamilia extends Ingresso{

    private int quatidadePessoas;

    public IngressoFamilia(double valor, String nomeDoFilme, int tipoIngresso, int quatidadePessoas) {
        super(valor, nomeDoFilme, tipoIngresso);
        this.quatidadePessoas = quatidadePessoas;
    }

    public IngressoFamilia() {
    }

    @Override
    public double getValor() {
        if(getQuatidadePessoas() > 3){
            double valorTotal = (valor*getQuatidadePessoas())*0.05;
            return valorTotal;
        }
        return getQuatidadePessoas()*getQuatidadePessoas();
    }

    public int getQuatidadePessoas() {
        return quatidadePessoas;
    }

    public void setQuatidadePessoas(int quatidadePessoas) {
        this.quatidadePessoas = quatidadePessoas;
    }
}
