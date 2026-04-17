package model;

public record Circulo(int raio) implements FiguraGeometrica {
    @Override
    public double area() {
        double pi = 3.14;
        return pi*(raio*raio);
    }
}
