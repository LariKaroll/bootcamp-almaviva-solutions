package model;

public record Retangulo(int base, int altura) implements FiguraGeometrica {
    @Override
    public double area() {
        return base*altura;
    }
}
