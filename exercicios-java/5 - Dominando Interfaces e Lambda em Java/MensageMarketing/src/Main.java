import model.EnvioMensage;
import model.Mensage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite sua mensagem: ");
        String mensage = scanner.next();

        System.out.println("Qual modo de mensagem: ");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Sociais");
        System.out.println("4 - WhatsApp");
        int option = scanner.nextInt();

        switch (option){
            case 1 -> sms(new EnvioMensage(mensage));
            case 2 -> email(new EnvioMensage(mensage));
            case 3 -> redeSocial(new EnvioMensage(mensage));
            case 4 -> whatsApp(new EnvioMensage(mensage));
            default -> System.out.println("Option invalida!");
        }


    }

    public static void sms(Mensage mensage){
        System.out.println(mensage.sms());
    }
    public static void email(Mensage mensage){
        System.out.println(mensage.email());
    }
    public static void redeSocial(Mensage mensage){
        System.out.println(mensage.redeSocial());
    }
    public static void whatsApp(Mensage mensage){
        System.out.println(mensage.WhatsApp());
    }
}