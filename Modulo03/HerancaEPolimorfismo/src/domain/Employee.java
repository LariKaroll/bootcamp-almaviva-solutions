package domain;

public sealed abstract class Employee permits Maneger {

    private String code;

    private String name;

    private String email;

    private int age;

    private double fullSalary;


    public Employee(String code, String name, String email, int age, double fullSalary) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.age = age;
        this.fullSalary = fullSalary;
    }

    protected Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getFullSalary();

    public void setFullSalary(double fullSalary) {
        this.fullSalary = fullSalary;
    }
}
