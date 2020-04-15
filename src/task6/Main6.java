package task6;

public class Main6 {
    public static void main(String[] args) {
        nextDay(30, 4, 2020);
    }

    /**
     * январь 31 1
     * февраль 28, 29 2
     * март 31 3
     * апрель 30 4
     * май 31 5
     * июнь 30 6
     * июль 31 7
     * август 31 8
     * сетябрь 30 9
     * октябрь 31 10
     * ноябрь 30 11
     * декабрь 31 12
     *
     * @param d день
     * @param m месяц
     * @param y год
     */
    public static void nextDay(int d, int m, int y) {
        if (((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) && d == 31) ||
                ((m == 4 || m == 6 || m == 9 || m == 11) && d == 30) ||
                (m == 2 && d == 29) ||
                (!(y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) && m == 2 && d == 28)) {
            d = 1;
            m++;
        }
        else if (m == 12 && d == 31) {
            d = 1;
            m = 1;
            y++;
        }
        else {
            d++;
        }
        System.out.println(d + "." + m + "." + y);
    }
}
