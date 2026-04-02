package model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartPrograma extends ContaBancaria{

    Scanner sc = new Scanner(System.in);

    public StartPrograma(){

    }

    public StartPrograma(double saldo, double chequeEspecial) {
        super(saldo, chequeEspecial);
    }

    public void startPrograma(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("7 - Sair");
        System.out.println("---------------------------------------------------------");
    }

    public void escolherContinuar(){
        System.out.println("Deseja fazer outra operação? [S/N]");
    }

    public void escolha(int escolha){
        if(escolha == 1){
            System.out.println("Saldo: R$" + getSaldo());
        }else if(escolha == 2){
            System.out.println("Saldo cheque especial: R$"+ getChequeEspecial());
        }else if(escolha == 3){
            System.out.println("Digite o valor do deposito: ");
            double deposito = sc.nextDouble();

            if(deposito <= 500){
                setChequeEspecial(50);
            }else{
                setChequeEspecial(deposito*0.5);
            }
            setDeposito(deposito);
            System.out.println("-- Deposito Realizado! --");
        }else if(escolha == 4){

            System.out.println("Digite o valor do saque: ");
            double sacar = sc.nextDouble();

            if(sacar <= getSaldo()){

                setSacar(sacar);
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
        }else if(escolha == 5){

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

        }else if(escolha == 6){
            if(getSaldo() == 0 && getSaldo() < getChequeEspecial()){
                System.out.println("Conta usando o cheque especial!");
            }else {
                System.out.println("Conta usando o saldo!");
            }
        }else {
            System.out.println("---------------------------------------------------------");
            System.out.println("Escolha uma opcao valida!");
        }
    }
}
