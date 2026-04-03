package controller;

public class CarroController {
    private String name;
    private boolean onOffCarro;
    private int velocidade;
    private int marcha;

    public CarroController(){

    }
    public CarroController(String name, boolean onOffCarro, int velocidade, int marcha) {
        this.name = name;
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
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(this.velocidade <= 120){
            if (velocidade == -1){
                this.velocidade -= 1;
            }else{
                this.velocidade += 1;
            }
        }else {
            this.velocidade = 120;
        }
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        if (velocidade == -1){
            this.marcha -= 1;
        }else{
            this.marcha += 1;
        }
    }
}
