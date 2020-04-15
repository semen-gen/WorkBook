package task10;

public class Main10 {
    public static void main(String[] args) {
        sumInts(-589);
    }

    public static void sumInts(int val) {
        int sum = 0;
        if (val < 0) val = -val;

        for (; val > 0; val /= 10) sum += val % 10;

        System.out.println("sum = " + sum);
    }
}
