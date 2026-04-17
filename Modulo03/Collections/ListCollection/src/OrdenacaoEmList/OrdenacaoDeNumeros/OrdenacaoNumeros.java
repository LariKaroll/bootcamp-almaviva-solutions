package OrdenacaoEmList.OrdenacaoDeNumeros;

import OrdenacaoEmList.OrdenacaoDePessoas.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Number> numberList;

    public OrdenacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number){
        numberList.add(new Number(number));
    }

    public List<Number> ordenarAscendente(){
        List<Number> numberAscendente = new ArrayList<>(numberList);
        Collections.sort(numberAscendente);
        return numberAscendente;
    }

    public List<Number> ordenarDescendente() {
        List<Number> numberDescendente = new ArrayList<>(numberList);
        Collections.reverse(numberDescendente);
        return numberDescendente;
    }

    public static void main(String[] args) {
        var ordenacaoNumerica = new OrdenacaoNumeros();

        ordenacaoNumerica.addNumber(1);
        ordenacaoNumerica.addNumber(2);
        ordenacaoNumerica.addNumber(3);
        ordenacaoNumerica.addNumber(4);
        ordenacaoNumerica.addNumber(5);
        ordenacaoNumerica.addNumber(6);

        System.out.println(ordenacaoNumerica.ordenarAscendente());
        System.out.println(ordenacaoNumerica.ordenarDescendente());
    }
}
