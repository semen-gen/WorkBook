package task5;

public class Main5 {
    public static void main(String[] args) {
        currencyEnding(31);
    }

    public static void currencyEnding(int money) {
        String[] after = {" рубль", " рубля", " рублей"};
        int[] arCases = {2, 0, 1, 1, 1, 2};

        System.out.println(money + (after[(money % 100 > 4 && money % 100 < 20) ? 2 : arCases[Math.min(money % 10, 5)]]));
    }
}
