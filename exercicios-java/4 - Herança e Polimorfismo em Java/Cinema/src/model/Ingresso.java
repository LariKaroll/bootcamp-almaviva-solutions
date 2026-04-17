package model;

public sealed abstract class Ingresso permits IngressoFamilia, MeiaEntrada {
    protected double valor = 40;
    private String nomeDoFilme;
    private int tipoIngresso;
    private String audioFilme;

    public Ingresso(double valor, String nomeDoFilme, int tipoIngresso, String audioFilme) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.tipoIngresso = tipoIngresso;
        this.audioFilme = audioFilme;
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

    public String getAudioFilme() {
        return audioFilme;
    }

    public void setAudioFilme(String audioFilme) {
        this.audioFilme = audioFilme;
    }
}
