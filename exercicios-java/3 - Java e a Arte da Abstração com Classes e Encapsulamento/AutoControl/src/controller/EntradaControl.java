package controller;

import model.Carro;

import java.util.Scanner;

public class EntradaControl {
    Scanner sc = new Scanner(System.in);
    CarroControl controle = new CarroControl();
    public EntradaControl() {
    }


    public void entradaPrograma(){
        System.out.println("-------------------------------------");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Desligar o carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir velocidade");
        System.out.println("5 - Virar para esquerda/direita");
        System.out.println("6 - Verificar velocidade");
        System.out.println("7 - Verificar a marcha");
        System.out.println("0 - FIM");
        System.out.println("-------------------------------------");
    }

    public void escolhaStart(int escolha){
        switch (escolha){
            case 1 -> controle.ligarCarro();
            case 2 -> controle.desligaCarro();
            case 3 -> controle.aumentarVelocidade();
            case 4 -> controle.diminuirVelocidade();
            case 5 -> controle.trocarDirecao();
            case 6 -> controle.verifyVelocidade();
            case 7 -> controle.verifyMarcha();
        }
    }
}