import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        ArrayList<String> nomeArray = new ArrayList();
        ArrayList<Integer> idadeArray = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 2){
            System.out.println("Nome: ");
            String name = sc.next();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            nomeArray.add(name);
            idadeArray.add(idade);
            i++;
        }
        for(int x = 0; x < nomeArray.size(); x++){
            System.out.println("Nome: "+nomeArray.get(x)+ "\nIdade: "+ idadeArray.get(x));
        }
    }
}
