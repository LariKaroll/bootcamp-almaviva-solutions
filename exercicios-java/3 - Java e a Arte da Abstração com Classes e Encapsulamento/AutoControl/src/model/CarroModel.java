package model;

import controller.CarroController;

public class CarroModel extends CarroController {

    public CarroModel() {
    }

    public CarroModel(String name, boolean onOffCarro, int velocidade, int marcha) {
        super(name, onOffCarro, velocidade, marcha);
    }

    public void velocidadeAtual(){
        System.out.println(getVelocidade()  + "km/s");
    }

    public void condicaoMarcha(int marcha){
        if(marcha == 0){
            System.out.println("ponto morto!\nNao pode acelerar!");
        }else if (marcha == 1){
            if(getVelocidade() >= 0 && getVelocidade() <= 20){
                setMarcha(1);
                velocidadeAtual();
            } else if (getVelocidade() >= 21 && getVelocidade() <= 40) {
                setMarcha(2);
                velocidadeAtual();
            } else if (getVelocidade() >= 41 && getVelocidade() <= 60) {
                setMarcha(3);
                velocidadeAtual();
            } else if (getVelocidade() >= 61 && getVelocidade() <= 80) {
                setMarcha(4);
                velocidadeAtual();
            }else if (getVelocidade() >= 81 && getVelocidade() <= 100) {
                setMarcha(5);
                velocidadeAtual();
            }else if (getVelocidade() >= 101 && getVelocidade() <= 120) {
                setMarcha(6);
                velocidadeAtual();
            }
        }
    }

    public boolean carroLigado(boolean carroLigado){
        return carroLigado;
    }

}
