import model.Circulo;
import model.FiguraGeometrica;
import model.Quadrado;
import model.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Escolha a figura geometrica: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Circulor");

        int option = scanner.nextInt();


        switch (option){
            case 1 -> {
                System.out.println("Digite o valor do lado: ");
                int lado = scanner.nextInt();
                figuraGeometrica(new Quadrado(lado));
            }
            case 2 -> {
                System.out.println("Digite o valor da base: ");
                int base = scanner.nextInt();

                System.out.println("Digite o valor da altura: ");
                int altura = scanner.nextInt();

                figuraGeometrica(new Retangulo(base,altura));
            }
            case 3 -> {
                System.out.println("Digite o valor do raio: ");
                int raio = scanner.nextInt();
                figuraGeometrica(new Circulo(raio));
            }
            default -> System.out.println("Option invalido!");
        }


    }

    public static void figuraGeometrica(FiguraGeometrica figuraGeometrica){
        System.out.println("Area: "+ figuraGeometrica.area());
    }
}