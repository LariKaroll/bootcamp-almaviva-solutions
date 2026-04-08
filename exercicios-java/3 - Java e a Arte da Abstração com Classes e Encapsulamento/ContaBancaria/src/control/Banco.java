package control;

import model.Conta;

import java.util.Scanner;


public class Banco extends Conta {
    Scanner sc = new Scanner(System.in);
    public Banco(){

    }
    public Banco(double saldo, double chequeEspecial, double deposito, double sacar) {
        super(saldo, chequeEspecial, deposito, sacar);
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + getSaldo());
    }

    public void consultarChequeEspecial(){
        System.out.println("Saldo cheque especial: R$"+ getChequeEspecial());
    }
    public void depositar(){
        System.out.println("Digite o valor do deposito: ");
        double deposito = sc.nextDouble();

        if(deposito <= 500){
            setChequeEspecial(getChequeEspecial() + 50);
        }else{
            setChequeEspecial(getChequeEspecial() + (deposito*0.5));
        }
        setSaldo(getSaldo() + deposito);
        System.out.println("-- Deposito Realizado! --");
    }
    public void sacar(){
        System.out.println("Digite o valor do saque: ");
        double sacar = sc.nextDouble();

        if(sacar <= getSaldo()){

            setSaldo(getSaldo() - sacar);
            System.out.println("-- Saque Realizado! --");

        } else if (sacar <= getSaldo()+getChequeEspecial()) {
            double resto = getSaldo() - sacar;
            setSaldo(0);
            if(resto < 0){
                setChequeEspecial(getChequeEspecial()-(resto*(-1)));
            }else {
                setChequeEspecial(getChequeEspecial()-resto);
            }
            System.out.println("-- Saque Realizado usando o cheque especial! --");
        } else {
            System.out.println("Valor insuficiente!");
        }
    }

    public void pagarBoleto(){
        System.out.println("Digite o valor do boleto: ");
        double boleto = sc.nextDouble();
        if(boleto <= getSaldo()){
            setSacar(boleto);
            System.out.println("-- Pagamento Realizado! --");
        }else if (boleto <= getSaldo()+getChequeEspecial()) {
            double resto = getSaldo() - boleto;
            setSaldo(0);
            if(resto < 0){
                setChequeEspecial(getChequeEspecial()-(resto*(-1)));
            }else {
                setChequeEspecial(getChequeEspecial()-resto);
            }
            System.out.println("-- Pagamento Realizado usando o cheque especial! --");
        } else {
            System.out.println("Valor insuficiente!");
        }
    }

    public void verifyUsandoChequeEspecial(){
        if(getSaldo() == 0 && getSaldo() < getChequeEspecial()){
            System.out.println("Conta usando o cheque especial!");
        }else {
            System.out.println("Conta usando o saldo!");
        }
    }

}
