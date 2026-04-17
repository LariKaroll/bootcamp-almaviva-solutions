package PesquisaEmList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    private void adicionarNumero(int number){
        numeroList.add(new Numero(number));
    }

    public int calcularSoma(){
        int total = 0;
        if(!numeroList.isEmpty()){
            for(Numero n : numeroList){
                total += n.getNumber();
            }
        }
        return total;
    }

    public void encontrarMenorNumero(){
        numeroList.sort(null);
        System.out.println("Menor numero: " + numeroList.getFirst());
    }

    public void encontrarMaiorNumero(){

        numeroList.sort(null);

        System.out.println("Maior numero: " + numeroList.getLast());
    }

    public void listarNumeros(){
        System.out.println(numeroList);
    }

    public static void main(String[] args) {
        var somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(21);
        somaNumeros.adicionarNumero(500);
        somaNumeros.adicionarNumero(-12);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(200);

        somaNumeros.listarNumeros();
        System.out.println("Total da Soma: "+somaNumeros.calcularSoma());

        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
