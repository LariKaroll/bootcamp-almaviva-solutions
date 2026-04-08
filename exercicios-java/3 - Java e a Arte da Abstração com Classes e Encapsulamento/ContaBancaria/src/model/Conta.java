package model;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double deposito;
    private double sacar;

    public Conta(double saldo, double chequeEspecial, double deposito, double sacar) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.deposito = deposito;
        this.sacar = sacar;
    }

    public Conta() {
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

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
