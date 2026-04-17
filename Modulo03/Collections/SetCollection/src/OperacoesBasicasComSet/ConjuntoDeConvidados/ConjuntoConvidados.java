package OperacoesBasicasComSet.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String name, int cod) {
        convidadoSet.add(new Convidado(name, cod));
    }

    public void removerConvidadoPorCodigoConvite(int cod) {
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c: convidadoSet){
                if(c.getCod() == cod){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        var conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Larissa", 1);
        conjuntoConvidados.adicionarConvidado("Gabriel", 2);
        conjuntoConvidados.adicionarConvidado("Marcos", 3);
        conjuntoConvidados.adicionarConvidado("Angelica", 4);
        conjuntoConvidados.adicionarConvidado("Julio", 5);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: "+conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: "+conjuntoConvidados.contarConvidados());
    }
}
