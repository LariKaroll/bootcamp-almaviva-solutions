import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static Scanner scanner = new Scanner(System.in);
    public static List<User> usersList = new ArrayList<>();

    public static void main(String[] args) {

        var index = -1;
        do{
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Adicionar usuario");
            System.out.println("2 - Listar usuario");
            System.out.println("0 - Sair");
            int option = scanner.nextInt();

            switch (option){
                case 1 -> adicionarUsuario();
                case 2 ->listarUsuario();
                default -> {
                    System.out.println("Finalizando...");
                    index = option;
                }
            }

        }while (index != 0);

    }

    public static void adicionarUsuario(){
        User novoUsuario = new User();
        System.out.println("Digite seu nome: ");
        novoUsuario.setName(scanner.next());

        System.out.println("Digite sua idade: ");
        novoUsuario.setAge(scanner.nextInt());

        usersList.add(novoUsuario);

    }

    public static void listarUsuario(){
        for (User u : usersList) {
            System.out.println("Nome: " + u.getName() + " | ano: " + u.getAge());
        }
    }

}
