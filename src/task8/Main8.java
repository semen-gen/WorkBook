package task8;

public class Main8 {
    public static void main(String[] args) {
        factorial(20);
    }

    public static void factorial(long to) {
        long f = 1, i = 1;
        while (i <= to) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
