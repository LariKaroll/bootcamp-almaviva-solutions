import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int anoAtual = LocalDate.now().getYear();

        System.out.println("Digite o seu nome: ");
        String name = sc.next();
        String nameCorrect = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println("Digite o ano do seu nascimento: ");
        int ageOfBirth = sc.nextInt();

        int ageNow = anoAtual - ageOfBirth;

        System.out.println(anoAtual);
        System.out.println("Olá " + nameCorrect + " você tem " + ageNow + " anos");
    }
}
