package model;

public record EnvioMensage(String mensage) implements Mensage{

    @Override
    public String sms() {
        return ("Enviada por SMS: "+ mensage);
    }

    @Override
    public String email() {
        return ("Enviada por email: "+ mensage);
    }

    @Override
    public String redeSocial() {
        return ("Enviada pelas rede social: "+ mensage);
    }

    @Override
    public String WhatsApp() {
        return ("Enviada por WhatsApp: "+ mensage);
    }
}
