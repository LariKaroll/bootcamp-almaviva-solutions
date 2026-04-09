package control;

public class Menu{
    public void startPrograma(){
        System.out.println("-----------------------------");
        System.out.println("1 - Lista de Filmes");
        System.out.println("2 - Bomboniere ");
        System.out.println("0 - Fim");
        System.out.println("-----------------------------");
    }

    public void bomboniere(){
        System.out.println("-----------------------------");
        System.out.println("1 - Pipoca Doce");
        System.out.println("2 - Pipoca Salgada");
        System.out.println("3 - Refrigerante");
        System.out.println("4 - Suco");
        System.out.println("5 - Doces");
        System.out.println("7 - voltar");
        System.out.println("-----------------------------");
    }

    public void listaDeFilmes(){
        System.out.println("-----------------------------");
        System.out.println("1 - Duna: Parte 2");
        System.out.println("2 - Ilha do Medo");
        System.out.println("3 - 100 Coisas Para Fazer Antes de Virar Um Zumbi ");
        System.out.println("4 - Vidas Passadas");
        System.out.println("5 - A Morte lhe Cai Bem");
        System.out.println("7 - voltar");
        System.out.println("-----------------------------");
    }

    public void tipoDeIngresso(){
        System.out.println("-----------------------------");
        System.out.println("Escolha o tipo do ingresso: ");
        System.out.println("1 - Meia");
        System.out.println("2 - Ingresso Familia");
        System.out.println("7 - voltar");
        System.out.println("-----------------------------");
    }

    public void audioFilme(){
        System.out.println("-----------------------------");
        System.out.println("1 - Dublado");
        System.out.println("2 - Legendado");
        System.out.println("7 - voltar");
        System.out.println("-----------------------------");
    }
}
