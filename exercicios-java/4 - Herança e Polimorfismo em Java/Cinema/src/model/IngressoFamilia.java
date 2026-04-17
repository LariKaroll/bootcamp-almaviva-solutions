package model;

public non-sealed class IngressoFamilia extends Ingresso{

    private int quatidadePessoas;

    public IngressoFamilia(double valor, String nomeDoFilme, int tipoIngresso, int quatidadePessoas, String audioFilme) {
        super(valor, nomeDoFilme, tipoIngresso, audioFilme);
        this.quatidadePessoas = quatidadePessoas;
    }

    public IngressoFamilia() {
    }

    @Override
    public double getValor() {
        if(getQuatidadePessoas() > 3){
<<<<<<< HEAD
            double valorTotal = (valor*getQuatidadePessoas())*0.05;
=======
            double valorTotal = (valor*getQuatidadePessoas())-((valor*getQuatidadePessoas())*0.05);
>>>>>>> 128dbd68ecfb0f330deb05f054692e6c10fcb9e4
            return valorTotal;
        }
        return valor*getQuatidadePessoas();
    }

    public int getQuatidadePessoas() {
        return quatidadePessoas;
    }

    public void setQuatidadePessoas(int quatidadePessoas) {
        this.quatidadePessoas = quatidadePessoas;
    }
}
