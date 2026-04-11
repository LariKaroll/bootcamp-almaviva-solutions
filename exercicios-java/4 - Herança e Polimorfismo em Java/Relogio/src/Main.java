import model.American;
import model.Brazil;
import model.Clock;

public class Main {
    public static void main(String[] args) {
        Clock br = new Brazil();
        br.setHour(19);
        br.setMinute(50);

        Clock us = new American();
        us.sincronizar(br);

        System.out.println(br.formatarHora());
        System.out.println(us.formatarHora());
    }
}