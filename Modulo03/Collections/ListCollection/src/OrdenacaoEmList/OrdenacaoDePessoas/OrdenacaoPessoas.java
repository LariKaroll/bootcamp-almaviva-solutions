package OrdenacaoEmList.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String name, int age, double height){
        pessoaList.add(new Pessoa(name,age,height));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPessoas());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        var ordenarPorPessoa = new OrdenacaoPessoas();

        ordenarPorPessoa.addPessoa("Lari", 40, 1.72);
        ordenarPorPessoa.addPessoa("Davi", 27, 1.88);
        ordenarPorPessoa.addPessoa("Miguel", 21, 1.52);
        ordenarPorPessoa.addPessoa("Fernanda", 34, 1.63);
        ordenarPorPessoa.addPessoa("Tony", 12, 1.77);

        System.out.println(ordenarPorPessoa.ordenarPorIdade());
        System.out.println(ordenarPorPessoa.ordenarPorAltura());

    }
}
