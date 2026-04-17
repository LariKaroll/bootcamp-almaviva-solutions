package model;

public class Brazil extends Clock{

    @Override
    public String formatarHora() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public void sincronizar(Clock outroRelogio) {
        this.setHour(outroRelogio.getHour());
        this.setMinute(outroRelogio.getMinute());
        this.setSecond(outroRelogio.getSecond());
    }
}
