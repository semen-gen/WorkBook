package task2;

public class Main2 {
    public static void main(String[] args) {
        int s = 2123757, sec,
                m, min,
                h, hours,
                d, days,
                w;

        sec = s % 60;

        m = (s - sec) / 60;
        min = m % 60;

        h = (m - min) / 60;
        hours = h % 24;

        d = (h - hours) / 24;
        days = d % 24;

        w = (d - days) / 7;

        System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
    }
}
