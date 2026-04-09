package model;

public class Carro {
    private String name;
    private boolean onOffCarro = false;
    private int velocidade;
    private int marcha;

    public Carro(){

    }
    public Carro(String name, boolean onOffCarro, int velocidade, int marcha) {
        this.name = name;
        this.onOffCarro = onOffCarro;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnOffCarro() {
        return onOffCarro;
    }

    public void setOnOffCarro(boolean onOffCarro) {
        this.onOffCarro = onOffCarro;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
