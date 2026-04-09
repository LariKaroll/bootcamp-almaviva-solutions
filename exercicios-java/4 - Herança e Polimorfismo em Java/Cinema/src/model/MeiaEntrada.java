package model;

public non-sealed class MeiaEntrada extends Ingresso{
    public MeiaEntrada() {
    }

    public MeiaEntrada(double valor, String nomeDoFilme, int tipoIngresso, String audioFilme) {
        super(valor, nomeDoFilme, tipoIngresso, audioFilme);
    }
    @Override
    public double getValor(){
        return valor/2;
    }
}
