package model;

public record Tributos(double value) implements Produtos {

    @Override
    public String alimento() {
        double tributo = value*0.01;

        return ("Valor do tributo pago: R$ "+ tributo + "\nValor do produto: R$" + value);
    }

    @Override
    public String saudeEBemEstar() {
        double tributo = value*0.015;

        return ("Valor do tributo pago: R$ "+ tributo + "\nValor do produto: R$" + value);
    }

    @Override
    public String vestuario() {
        double tributo = value*0.025;

        return ("Valor do tributo pago: R$ "+ tributo + "\nValor do produto: R$" + value);
    }

    @Override
    public String cultura() {
        double tributo = value*0.04;

        return ("Valor do tributo pago: R$ "+ tributo + "\nValor do produto: R$" + value);
    }
}
