import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado*lado;

        System.out.println("Area: " + area);
    }
}
