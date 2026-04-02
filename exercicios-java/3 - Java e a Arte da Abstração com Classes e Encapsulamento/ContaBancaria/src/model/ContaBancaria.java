package model;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double deposito;
    private double sacar;

    public ContaBancaria(){

    }

    public ContaBancaria(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        this.saldo += this.deposito;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
        this.saldo -= this.sacar;
    }

}
