package model;

public class American extends Clock{
    public American() {
    }

    @Override
    public String formatarHora() {
        int h = getHour();
        String periodo = (h < 12) ? "AM" : "PM";

        int horaExibicao = h % 12;
        if (horaExibicao == 0) horaExibicao = 12;
        return String.format("%02d:%02d:%02d %s", horaExibicao, getMinute(), getSecond(), periodo);
    }

    @Override
    public void sincronizar(Clock outroRelogio) {

    }
}
