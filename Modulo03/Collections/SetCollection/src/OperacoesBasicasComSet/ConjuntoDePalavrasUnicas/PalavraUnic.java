package OperacoesBasicasComSet.ConjuntoDePalavrasUnicas;

public class PalavraUnic {
    private String palavraUnica;

    public PalavraUnic(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public String toString() {
        return "Palavra Unica = " + palavraUnica ;
    }
}
