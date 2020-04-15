package task8;

public class Main8 {
    public static void main(String[] args) {
        long sum = 1;
        long i = 2;
        while (i <= 20) {
            sum *= i;
            i++;
        }
        System.out.println(sum);
    }
}
