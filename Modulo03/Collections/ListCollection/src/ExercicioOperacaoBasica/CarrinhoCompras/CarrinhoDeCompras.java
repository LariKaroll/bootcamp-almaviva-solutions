package ExercicioOperacaoBasica.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemsList;

    public CarrinhoDeCompras() {
        this.itemsList = new ArrayList<>();
    }

    public void adicionarItem(String name, double value, int amount){
        itemsList.add(new Item(name, value,amount));
    }

    public void removerItem(String name){
        List<Item> itemsParaRemover = new ArrayList<>();

        for(Item i : itemsList){
            if(i.getName().equalsIgnoreCase(name)){
                itemsParaRemover.add(i);
            }
        }

        itemsList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double valueTotal = 0;
        for (Item i : itemsList){
            valueTotal += i.getValue() * i.getAmount();
        }
        return valueTotal;
    }

    public void exibirItens(){
        System.out.println(itemsList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Nescau", 10.99, 4);
        carrinhoDeCompras.adicionarItem("Toddy", 15.99, 4);
        carrinhoDeCompras.adicionarItem("Leite", 5.99, 14);
        carrinhoDeCompras.adicionarItem("Arroz", 23.96, 2);

        carrinhoDeCompras.removerItem("Leite");


        carrinhoDeCompras.exibirItens();
        System.out.println("Valor Total = R$" + carrinhoDeCompras.calcularValorTotal());
    }

}
