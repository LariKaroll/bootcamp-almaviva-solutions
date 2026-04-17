package model;
public abstract class Clock {
    private int hour;
    private int minute;
    private int second;

    public int getHour() { return hour; }

    public int getMinute() { return minute; }

    public int getSecond() { return second; }


    public void setHour(int hour) {
        if(hour >= 0 && hour < 24){
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60){
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60){
            this.second = second;
        }
    }

    public abstract String formatarHora();

    public abstract void sincronizar(Clock outroRelogio);
}
