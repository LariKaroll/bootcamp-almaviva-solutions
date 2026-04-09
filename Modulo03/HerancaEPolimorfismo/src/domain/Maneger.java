package domain;

public non-sealed class Maneger extends Employee{
    private String login;
    private String password;

    private double comission;

    private double salary;

    public Maneger(String code, String name, String email, int age, double fullSalary, String login, String password, double comission, double salary) {
        super(code, name, email, age, fullSalary);
        this.login = login;
        this.password = password;
        this.comission = comission;
        this.salary = salary;
    }
    public Maneger(){

    }

    @Override
    public String getCode(){
        return "MN" + getCode();
    }



    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFullSalary(){
        return comission + getSalary();
    }
}
