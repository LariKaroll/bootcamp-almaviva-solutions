package model;

public non-sealed class MeiaEntrada extends Ingresso{

    public MeiaEntrada() {
    }

    public MeiaEntrada(double valor, String nomeDoFilme, int tipoIngresso, String audioFilme) {
        super(valor, nomeDoFilme, tipoIngresso, audioFilme);
    }
    @Override
    public double getValor(){
<<<<<<< HEAD
        return (valor/2);
=======
        return valor/2;
>>>>>>> 128dbd68ecfb0f330deb05f054692e6c10fcb9e4
    }

}
