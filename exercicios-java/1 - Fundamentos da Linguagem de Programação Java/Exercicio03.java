import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite a base: ");
        double base = sc.nextDouble();
        double area = base*altura;

        System.out.println("Area = " +area);
    }
}
