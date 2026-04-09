package control;

import model.Ingresso;

import java.util.Scanner;

public class OptionMenu {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
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
                switch (optionStart){
                    case 1 -> {
                        menu.tipoDeIngresso();
                        optionStart = sc.nextInt();
                        if(optionStart == 1) System.out.println("Filme: Duna: Parte 2");
                    }
                    case 2 ->
                    case 3 ->
                    case 4 ->
                    case 5 ->
                    case 6 ->
                    case 7 ->
                    default -> System.out.println("Opcao invalida!");
                }
            }
            case 2 -> menu.bomboniere();
            default -> System.out.println("Opcao invalida!");
        }
    }
}
