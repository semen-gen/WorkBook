package task11;

public class Main11 {

    public static void main(String[] args) {
        simple(121);
    }

    public static void simple(int x) {
        boolean simpleInt = true;

        if (x > 0) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (!(x == 1 || x == 2) && x != i && x % i == 0) {
                    simpleInt = false;
                    break;
                }
            }
        }
        else {
            simpleInt = false;
        }

        if (simpleInt) {
            System.out.println("Простое");
        }
        else {
            System.out.println("Не простое");
        }
    }

}
