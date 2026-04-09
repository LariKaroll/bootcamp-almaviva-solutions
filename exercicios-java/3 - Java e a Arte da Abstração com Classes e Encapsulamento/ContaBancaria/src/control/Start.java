package control;

import model.Conta;

public class Start{
    Conta conta = new Conta();
    Banco banco = new Banco(conta);

    public Start(){

    }

    public void startPrograma(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("0 - Sair");
        System.out.println("---------------------------------------------------------");
    }

    public void escolha(int escolha){
        switch (escolha){
            case 1 -> banco.consultarSaldo();
            case 2 -> banco.consultarChequeEspecial();
            case 3 -> banco.depositar();
            case 4 -> banco.sacar();
            case 5 -> banco.pagarBoleto();
            case 6 -> banco.verifyUsandoChequeEspecial();
            case 0 -> System.out.println("Finalizando...");
            default -> System.out.println("Opcao Invalida!");
        }
    }
}
