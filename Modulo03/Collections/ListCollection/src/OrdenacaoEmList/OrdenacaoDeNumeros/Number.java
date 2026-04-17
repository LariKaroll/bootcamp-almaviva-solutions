package OrdenacaoEmList.OrdenacaoDeNumeros;


public class Number implements Comparable<Number> {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Number n) {
        return Integer.compare(this.number, n.getNumber());
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
