package model;

import controller.CarroController;

import java.util.Scanner;

public class EntradaModel extends CarroController {
    Scanner sc = new Scanner(System.in);
    CarroModel modelCarro = new CarroModel();
    public EntradaModel() {
    }

    public EntradaModel(String name, boolean onOffCarro, int velocidade, int marcha) {
        super(name, onOffCarro, velocidade, marcha);
    }

    public void entradaPrograma(){
        System.out.println("-------------------------------------");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Desligar o carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir velocidade");
        System.out.println("5 - Virar para esquerda/direita");
        System.out.println("6 - Verificar velocidade");
        System.out.println("7 - Trocar a marcha");
        System.out.println("8 - FIM");
        System.out.println("-------------------------------------");
    }

    public int escolhaStart(int escolha){
        if(escolha == 1){
            System.out.println("Ligando o carro!");
            setOnOffCarro(true);
            System.out.println("Carro ligado!");
        } else if (escolha == 2) {
            System.out.println("Desligando o carro!");
            setOnOffCarro(false);
            setVelocidade(0);
            setMarcha(0);
            System.out.println("Carro desligado!");
        } else if (escolha == 3) {
            if(isOnOffCarro(true)){
                if(getMarcha()!=0){
                    setVelocidade(1);
                    System.out.println("Aumentando velocidade!\n "+ getVelocidade() +"km/s");
                }else {
                    System.out.println("Ponto morto");
                }
            }else{
                System.out.println("Carro desligado!");
            }
        } else if (escolha == 4) {
            if(getVelocidade() > 0){
                if(isOnOffCarro(true)){
                    setVelocidade(-1);
                    System.out.println("Diminuindo velocidade!\n "+ getVelocidade() +"km/s");
                }else{
                    System.out.println("Carro desligado!");
                }
            }else{
                setVelocidade(0);
                System.out.println(getVelocidade()+"km/s");
            }
        } else if (escolha == 5) {
            if(isOnOffCarro(true)){
                if(getVelocidade() >= 1 && getVelocidade() <=40){
                    System.out.println("1 - esquerda\n2 - direita");
                    int direcao = sc.nextInt();
                    if(direcao == 1){
                        System.out.println("Virando para esquerda!");
                    }else {
                        System.out.println("Virando para direita!");
                    }
                }else {
                    System.out.println("Velocidade excedida!");
                }
            }else{
                System.out.println("Carro desligado!");
            }
        } else if (escolha == 6) {
            if(isOnOffCarro(true)){
                System.out.println("Velocidade atual: \n" +getVelocidade()+ "km/s");
            }else{
                System.out.println("Carro desligado!");
            }
        } else if (escolha == 7) {
            if(isOnOffCarro(true)){
                modelCarro.condicaoMarcha(1);
                System.out.println("Trocando de machar!\n Marcha atual: "+ getMarcha());
            }else{
                System.out.println("Carro desligado!");
            }
        } else {
            System.out.println("FIM");
        }
        return escolha;
    }
}