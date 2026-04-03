package model;

import controller.CarroController;

public class CarroModel extends CarroController {
    EntradaModel escolha = new EntradaModel();
    public CarroModel() {
    }

    public CarroModel(String name, boolean onOffCarro, int velocidade, int marcha) {
        super(name, onOffCarro, velocidade, marcha);
    }


}
