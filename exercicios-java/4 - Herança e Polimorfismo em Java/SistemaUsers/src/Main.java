import model.Atendente;
import model.Employees;
import model.Gerente;
import model.Vendedor;

public class Main {
    public static void main(String[] args) {
        printSistemaUsers(new Gerente());
        printSistemaUsers(new Atendente());
        printSistemaUsers(new Vendedor());
    }


    public static void printSistemaUsers(Employees employees){
        System.out.printf("-------%s-------%n", employees.getClass().getSimpleName());
        switch (employees){
            case Gerente gerente ->{
                gerente.setName("Larissa");
                gerente.setEmail("lari123@gmail.com");
                gerente.setPassword("123456");

                System.out.println(gerente.getName());
                System.out.println(gerente.getEmail());
                System.out.println(gerente.getPassword());
                if(employees.isAdministrador()) System.out.println("Autorizado");
            }
            case Atendente atendente -> {
                atendente.setName("Vitor");
                atendente.setEmail("vito_prk@gmail.com");
                atendente.setPassword("cs@awp231");

                System.out.println(atendente.getName());
                System.out.println(atendente.getEmail());
                System.out.println(atendente.getPassword());
                if(employees.isAdministrador()){
                    System.out.println("Autorizado!");
                }else {
                    System.out.println("Negado!");
                }
            }
            case Vendedor vendedor -> {
                vendedor.setName("kalel");
                vendedor.setEmail("kalel_principe@gmail.com");
                vendedor.setPassword("sobrinho@123");

                System.out.println(vendedor.getName());
                System.out.println(vendedor.getEmail());
                System.out.println(vendedor.getPassword());
                if(employees.isAdministrador()){
                    System.out.println("Autorizado");
                }else {
                    System.out.println("Negado!");
                }
            }
        }
    }
}