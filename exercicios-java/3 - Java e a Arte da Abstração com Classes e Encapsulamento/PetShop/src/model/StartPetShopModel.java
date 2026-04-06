package model;

public class StartPetShopModel {

    public void println(String mensage){
        System.out.println(mensage);
        return;
    }
    public void start(){
        println("---------------------------------");
        println("1 - Dar banho no pet");
        println("2 - Abastecer com água");
        println("3 - Abastecer com shampoo");
        println("4 - Verificar nivel de água");
        println("5 - Verificar nivel de shampoo");
        println("6 - Verificar se tem pet no banho");
        println("7 - Colocar pet na maquina");
        println("8 - Retirar pet da máquina");
        println("9 - Limpar maquina");
        println("0 - Finalizar");
        println("---------------------------------");
    }


}
