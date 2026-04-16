package PesquisaEmList.SomaDeNumeros;

public class Numero implements Comparable<Numero>{
    private int number;

    public Numero(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public int compareTo(Numero outroNumber) {
        return Integer.compare(this.number, outroNumber.getNumber());
    }
}
