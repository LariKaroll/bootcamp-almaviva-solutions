package ExercicioOperacaoBasica.CarrinhoCompras;

public class Item {
    private String name;
    private double value;
    private int amount;

    public Item(String name, double value, int amount) {
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return
                "\nname = " + name +
                " | value = R$" + value +
                " | amount = " + amount ;
    }
}
