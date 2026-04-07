package controller;

import model.Carro;

import java.util.Scanner;

public class CarroControl {
    private Carro carro;
    Scanner sc = new Scanner(System.in);

    public CarroControl(){
        this.carro = new Carro();
    }


    public boolean condicaoParaLigarCarro(){
        if(!carro.isOnOffCarro()){
            System.out.println("O carro esta desligado!");
            return false;
        }else {
            return true;
        }
    }
    public void ligarCarro(){
        if(!carro.isOnOffCarro()){
            carro.setOnOffCarro(true);
            carro.setMarcha(0);
            carro.setVelocidade(0);
            System.out.println("Ligando carro");
        }else {
            System.out.println("Carro ja esta ligado!");;
        }
    }

    public void desligaCarro(){
        if (!condicaoParaLigarCarro()){
            carro.setOnOffCarro(false);
            System.out.println("Carro desligado!");
        }
    }

    public void aumentarVelocidade(){
        if (condicaoParaLigarCarro()){
            if(carro.getVelocidade() <= 120){
                carro.setVelocidade(carro.getVelocidade() + 1);
                System.out.println("Acelerando Carro!\n" + carro.getVelocidade() + "km/h");
                trocarMarcha();
            } else {
                carro.setVelocidade(120);
                System.out.println(carro.getVelocidade() + "km/h\nVelocidade Maxima!");
            }
        }
    }

    public void diminuirVelocidade(){
        if (condicaoParaLigarCarro()){
            if(carro.getVelocidade() >= 0){
                carro.setVelocidade(carro.getVelocidade() - 1);
                System.out.println("Diminuindo Velocidade do Carro!\n" + carro.getVelocidade() + "km/h");
                trocarMarcha();
            } else {
                carro.setVelocidade(0);
                System.out.println(carro.getVelocidade() + "km/h");
            }
        }
    }

    public void verifyVelocidade(){
        if(condicaoParaLigarCarro()){
            System.out.println("Velocidade atual: "+ carro.getVelocidade() + "km/h");
        }
    }

    public void trocarMarcha(){
        int v = carro.getVelocidade();
        int novaMarcha;

        if(v <= 20){
            novaMarcha = 1;
        }
        else if (v <= 40){
            novaMarcha = 2;
        }
        else if (v <= 60){
            novaMarcha = 3;
        }
        else if (v <= 80){
            novaMarcha = 4;
        }
        else if (v <= 100){
            novaMarcha = 5;
        }
        else novaMarcha = 6;

        if(novaMarcha != carro.getMarcha()){
            carro.setMarcha(novaMarcha);
            System.out.println("Marcha alterada para: "+ novaMarcha);
        }
    }

    public void trocarDirecao(){
        if (condicaoParaLigarCarro()){
            System.out.println("1 - Direita | 2 - Esquerda");
            int condicaoDeDirecao = sc.nextInt();
            System.out.println(condicaoDeDirecao == 1 ? "Virando à Direita" : "Virando à Esquerda");
        }
    }

    public void verifyMarcha(){
        System.out.println("Marcha atual: "+ carro.getMarcha());
    }
}
