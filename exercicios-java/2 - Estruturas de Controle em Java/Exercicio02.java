import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso:");
        double peso = sc.nextDouble();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.6 && imc < 25){
            System.out.println("Peso ideal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Levemente acima do peso");
        }else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade Grau I");
        }else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade Grau II (Severa)");
        }else{
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
