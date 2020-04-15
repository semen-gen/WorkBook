package task9;

public class Main9 {
    public static void main(String[] args) {
        int max = 0, temp;
        for (int i = 0; i < 20; i++) {
            temp = (int) (Math.random() * 20);
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
