package OperacoesBasicasComSet.ConjuntoDeConvidados;

public class Convidado {
    private String name;
    private int cod;

    public Convidado(String name, int cod) {
        this.name = name;
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "name = " + name +
                " | cod = " + cod + "\n";
    }
}
