package control;

import model.Ingresso;
import model.IngressoFamilia;
import model.MeiaEntrada;

import java.util.Scanner;

public class OptionMenu {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    IngressoFamilia ingressoFamilia = new IngressoFamilia();
<<<<<<< HEAD
    Ingresso ingresoMeiaEntrada = new MeiaEntrada();
    private Ingresso ingresso;
=======
    MeiaEntrada meiaEntrada = new MeiaEntrada();
    Ingresso ingressoMeia = new MeiaEntrada();

>>>>>>> 128dbd68ecfb0f330deb05f054692e6c10fcb9e4

    public OptionMenu(){

    }

    public void startOption(int index){
        int optionStart = sc.nextInt();
        switch (optionStart){
            case 1 -> {
                menu.listaDeFilmes();
                int optionListaDeFilmes = sc.nextInt();
<<<<<<< HEAD
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
=======
                menu.audioFilme();
                int optionAudioFilme = sc.nextInt();
                switch (optionAudioFilme){
                    case 1 ->{
                        ingressoMeia.setAudioFilme("Dublado");
                    }
                    case 2 ->{
                        ingressoMeia.setAudioFilme("Legendado");
                    }
                    default -> System.out.println("Opcao invalida!");
                }
                switch (optionListaDeFilmes){
                    case 1 -> {
                        menu.tipoDeIngresso();
                        optionStart = sc.nextInt();
                        switch (optionStart){
                            case 1 ->{
                                System.out.println("Filme: Duna: Parte 2");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: Duna: Parte 2");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Familia");
                                System.out.println("Ingresso para "+ingressoFamilia.getQuatidadePessoas()+ " pessoas.");
                                System.out.println("R$"+ ingressoFamilia.getValor());
                            }

                        }
                    }
                   case 2 ->{
                       menu.tipoDeIngresso();
                       optionStart = sc.nextInt();
                       switch (optionStart){
                           case 1 ->{
                               System.out.println("Filme: Ilha do Medo");
                               System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                               System.out.println("Ingreso Meia");
                               System.out.println("R$"+ meiaEntrada.getValor());
                           }
                           case 2 ->{
                               System.out.println("Para quantas pessoas?");
                               ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                               System.out.println("Filme: Ilha do Medo");
                               System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                               System.out.println("Ingreso Familia");
                               System.out.println("Ingresso para "+ingressoFamilia.getQuatidadePessoas()+ " pessoas.");
                               System.out.println("R$"+ ingressoFamilia.getValor());
                           }

                       }
                   }
                   case 3 -> {
                       menu.tipoDeIngresso();
                       optionStart = sc.nextInt();
                       switch (optionStart){
                           case 1 ->{
                               System.out.println("Filme: 100 Coisas Para Fazer Antes de Virar Um Zumbi");
                               System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                               System.out.println("Ingreso Meia");
                               System.out.println("R$"+ meiaEntrada.getValor());
                           }
                           case 2 ->{
                               System.out.println("Para quantas pessoas?");
                               ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                               System.out.println("Filme: 100 Coisas Para Fazer Antes de Virar Um Zumbi");
                               System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                               System.out.println("Ingreso Familia");
                               System.out.println("Ingresso para "+ingressoFamilia.getQuatidadePessoas()+ " pessoas.");
                               System.out.println("R$"+ ingressoFamilia.getValor());
                           }

                       }
                   }
                    case 4 ->{
                        menu.tipoDeIngresso();
                        optionStart = sc.nextInt();
                        switch (optionStart){
                            case 1 ->{
                                System.out.println("Filme: Vidas Passadas");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: Vidas Passadas");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Familia");
                                System.out.println("Ingresso para "+ingressoFamilia.getQuatidadePessoas()+ " pessoas.");
                                System.out.println("R$"+ ingressoFamilia.getValor());
                            }

                        }
                    }
                    case 5 ->{
                        menu.tipoDeIngresso();
                        optionStart = sc.nextInt();
                        switch (optionStart){
                            case 1 ->{
                                System.out.println("Filme: A Morte lhe Cai Bem");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: A Morte lhe Cai Bem");
                                System.out.println("Audio: "+ ingressoMeia.getAudioFilme());
                                System.out.println("Ingreso Familia");
                                System.out.println("Ingresso para "+ingressoFamilia.getQuatidadePessoas()+ " pessoas.");
                                System.out.println("R$"+ ingressoFamilia.getValor());
                            }
                        }
                    }
                    case 7 -> {

                        break;
                    }
                    default -> System.out.println("Opcao invalida!");
                }
            }
            case 0 -> {
                System.out.println("finalizando...");
                index = 0;
            }
>>>>>>> 128dbd68ecfb0f330deb05f054692e6c10fcb9e4
            default -> System.out.println("Opcao invalida!");
        }
    }
}
