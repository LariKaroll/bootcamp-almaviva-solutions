import domain.Employee;
import domain.Maneger;

public class Main {
    public static void main(String[] args) {
        printfEmployee(new Maneger());
    }

    public static void printfEmployee(Employee employee){
        System.out.println("=======%s=======" + employee.getClass().getCanonicalName());
        switch (employee){
            case Maneger maneger ->{
                maneger.setName("Larissa");
                maneger.setAge(22);
                maneger.setLogin("lari123");
                maneger.setPassword("123");
                maneger.setSalary(5000.3);
                maneger.setComission(2800);

                System.out.println(maneger.getCode());
                System.out.println(maneger.getName());
                System.out.println(maneger.getAge());
                System.out.println(maneger.getLogin());
                System.out.println(maneger.getPassword());
                System.out.println("Salario total R$" + maneger.getFullSalary());
            }
        }
    }
}