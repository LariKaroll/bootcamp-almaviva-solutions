package model;

public non-sealed class MeiaEntrada extends Ingresso{
    public MeiaEntrada() {
    }

    public MeiaEntrada(double valor, String nomeDoFilme, int tipoIngresso) {
        super(valor, nomeDoFilme, tipoIngresso);
    }
    @Override
    public double getValor(){
        return valor/2;
    }
}
