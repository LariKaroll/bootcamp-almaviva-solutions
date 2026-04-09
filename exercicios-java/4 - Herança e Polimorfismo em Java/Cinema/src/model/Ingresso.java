package model;

public sealed abstract class Ingresso permits IngressoFamilia, MeiaEntrada {
    protected double valor = 40;
    private String nomeDoFilme;
    private int tipoIngresso;

    public Ingresso(double valor, String nomeDoFilme, int tipoIngresso) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.tipoIngresso = tipoIngresso;
    }

    public Ingresso() {
    }

    public abstract double getValor();

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(int tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
