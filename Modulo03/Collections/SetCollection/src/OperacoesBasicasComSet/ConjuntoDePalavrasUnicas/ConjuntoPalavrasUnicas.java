package OperacoesBasicasComSet.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavraUnic> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(new PalavraUnic(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavraUnic palavraParaRemover = null;

        if(!palavrasUnicasSet.isEmpty()){
            for (PalavraUnic p : palavrasUnicasSet) {
                if(p.getPalavraUnica() == palavra){
                    palavraParaRemover = p;
                }
            }
        }

        palavrasUnicasSet.remove(palavraParaRemover);
    }

    //public void verificarPalavra(String palavra) {

    //}

    public void exibirPalavrasUnicas() {
        palavrasUnicasSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        var conjuntoDePalavras = new ConjuntoPalavrasUnicas();

        conjuntoDePalavras.adicionarPalavra("Litro");
        conjuntoDePalavras.adicionarPalavra("Palavra");
        conjuntoDePalavras.adicionarPalavra("Martelo");
        conjuntoDePalavras.adicionarPalavra("Vassoura");

        conjuntoDePalavras.exibirPalavrasUnicas();

        conjuntoDePalavras.removerPalavra("Litro");
        conjuntoDePalavras.exibirPalavrasUnicas();



    }
}
