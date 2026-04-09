package control;

import model.Ingresso;
import model.IngressoFamilia;
import model.MeiaEntrada;

import java.util.Scanner;

public class OptionMenu {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    IngressoFamilia ingressoFamilia = new IngressoFamilia();
    Ingresso ingresoMeiaEntrada = new MeiaEntrada();
    private Ingresso ingresso;

    public OptionMenu(){

    }

    public OptionMenu(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public void startOption(){
        int optionStart = sc.nextInt();
        switch (optionStart){
            case 1 -> {
                menu.listaDeFilmes();
                int optionListaDeFilmes = sc.nextInt();
                switch (optionListaDeFilmes){
                    case 1 -> {
                        menu.audioFilme();
                        int optionAudio = sc.nextInt();
                        if(optionAudio == 1 || optionAudio == 2){
                            menu.tipoDeIngresso();
                            optionStart = sc.nextInt();
                            switch (optionStart){
                                case 1 -> System.out.println("Filme: Duna: Parte 2\nAudio: Dublado\nValor ingresso Meia Entrada: \nR$"+ingresoMeiaEntrada.getValor());
                                case 2 -> {
                                    System.out.println("Quantas pessoas?");
                                    ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                    System.out.println("Filme: Duna: Parte 2\nAudio: Dublado\nValor Ingresso Familia: \nR$"+ingresoMeiaEntrada.getValor());

                                }
                            }
                            if(optionStart == 1){

                            }
                        }
                    }
//                    case 2 ->
//                    case 3 ->
//                    case 4 ->
//                    case 5 ->
//                    case 6 ->
//                    case 7 ->
                    default -> System.out.println("Opcao invalida!");
                }
            }
            case 2 -> menu.bomboniere();
            case 0 -> System.out.println("Finalizando...");
            default -> System.out.println("Opcao invalida!");
        }
    }
}
