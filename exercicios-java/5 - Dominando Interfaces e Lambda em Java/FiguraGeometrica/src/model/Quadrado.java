package model;

public record Quadrado(int lado) implements FiguraGeometrica {
    @Override
    public double area() {
        return (lado * lado);
    }
}
