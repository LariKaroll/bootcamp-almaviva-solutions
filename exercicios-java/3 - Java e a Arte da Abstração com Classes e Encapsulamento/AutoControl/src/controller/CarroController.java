package controller;

public class CarroController {
    private boolean onOffCarro;
    private int velocidade;
    private int marcha;

    public CarroController(){

    }
    public CarroController(boolean onOffCarro, int velocidade, int marcha) {
        this.onOffCarro = onOffCarro;
        this.velocidade = velocidade;
        this.marcha = marcha;
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
