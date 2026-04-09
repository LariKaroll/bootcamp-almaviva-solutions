package control;

import model.Conta;

import java.util.Scanner;


public class Banco {
    private Conta conta;
    Scanner sc = new Scanner(System.in);
    public Banco(){
    }

    public Banco(Conta conta) {
        this.conta = conta;
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + this.conta.getSaldo());
    }

    public void consultarChequeEspecial(){
        System.out.println("Saldo cheque especial: R$"+ this.conta.getChequeEspecial());
    }
    public void depositar(){
        System.out.println("Digite o valor do deposito: ");
        double deposito = sc.nextDouble();

        if(deposito <= 500){
            this.conta.setChequeEspecial(this.conta.getChequeEspecial() + 50);
        }else{
            this.conta.setChequeEspecial(this.conta.getChequeEspecial() + (deposito*0.5));
        }
        this.conta.setSaldo(this.conta.getSaldo() + deposito);
        System.out.println("-- Deposito Realizado! --");
    }
    public void sacar(){
        System.out.println("Digite o valor do saque: ");
        double sacar = sc.nextDouble();

        if(sacar <= this.conta.getSaldo()){

            this.conta.setSaldo(this.conta.getSaldo() - sacar);
            System.out.println("-- Saque Realizado! --");

        } else if (sacar <= this.conta.getSaldo()+this.conta.getChequeEspecial()) {
            double resto = this.conta.getSaldo() - sacar;
            this.conta.setSaldo(0);
            if(resto < 0){
                this.conta.setChequeEspecial(this.conta.getChequeEspecial()-(resto*(-1)));
            }else {
                this.conta.setChequeEspecial(this.conta.getChequeEspecial()-resto);
            }
            System.out.println("-- Saque Realizado usando o cheque especial! --");
        } else {
            System.out.println("Valor insuficiente!");
        }
    }

    public void pagarBoleto(){
        System.out.println("Digite o valor do boleto: ");
        double boleto = sc.nextDouble();
        if(boleto <= this.conta.getSaldo()){
            this.conta.setSacar(boleto);
            System.out.println("-- Pagamento Realizado! --");
        }else if (boleto <= this.conta.getSaldo()+this.conta.getChequeEspecial()) {
            double resto = this.conta.getSaldo() - boleto;
            this.conta.setSaldo(0);
            if(resto < 0){
                this.conta.setChequeEspecial(this.conta.getChequeEspecial()-(resto*(-1)));
            }else {
                this.conta.setChequeEspecial(this.conta.getChequeEspecial()-resto);
            }
            System.out.println("-- Pagamento Realizado usando o cheque especial! --");
        } else {
            System.out.println("Valor insuficiente!");
        }
    }

    public void verifyUsandoChequeEspecial(){
        if(this.conta.getSaldo() == 0 && this.conta.getSaldo() < this.conta.getChequeEspecial()){
            System.out.println("Conta usando o cheque especial!");
        }else {
            System.out.println("Conta usando o saldo!");
        }
    }

}
