package control;

import model.Ingresso;
import model.IngressoFamilia;
import model.MeiaEntrada;

import java.util.Scanner;

public class OptionMenu {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    IngressoFamilia ingressoFamilia = new IngressoFamilia();
    MeiaEntrada meiaEntrada = new MeiaEntrada();
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
                        menu.tipoDeIngresso();
                        optionStart = sc.nextInt();
                        switch (optionStart){
                            case 1 ->{
                                System.out.println("Filme: Duna: Parte 2");
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: Duna: Parte 2");
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
                               System.out.println("Ingreso Meia");
                               System.out.println("R$"+ meiaEntrada.getValor());
                           }
                           case 2 ->{
                               System.out.println("Para quantas pessoas?");
                               ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                               System.out.println("Filme: Ilha do Medo");
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
                               System.out.println("Ingreso Meia");
                               System.out.println("R$"+ meiaEntrada.getValor());
                           }
                           case 2 ->{
                               System.out.println("Para quantas pessoas?");
                               ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                               System.out.println("Filme: 100 Coisas Para Fazer Antes de Virar Um Zumbi");
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
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: Vidas Passadas");
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
                                System.out.println("Ingreso Meia");
                                System.out.println("R$"+ meiaEntrada.getValor());
                            }
                            case 2 ->{
                                System.out.println("Para quantas pessoas?");
                                ingressoFamilia.setQuatidadePessoas(sc.nextInt());
                                System.out.println("Filme: A Morte lhe Cai Bem");
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
            case 2 -> {
                menu.bomboniere();
                int optionBomboniere = sc.nextInt();
                switch (optionBomboniere){
                    case 1 ->{

                    }
                    case 2-> {

                    }
                }
            }
            default -> System.out.println("Opcao invalida!");
        }
    }
}
