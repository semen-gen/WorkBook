package task7;

public class Main7 {
    public static void main(String[] args) {
        whichHouseFit(20, 50, 30, 80, 90, 50);
    }

    public static void whichHouseFit(int a, int b, int c, int d, int e, int f) {
        boolean house1, house2;
        house1 = house2 = false;

        if ((a <= e && b <= f) || (b <= e && a <= f)) {
            house1 = true;
            System.out.println("Первый дом поместится");
        }
        if ((c <= e && d <= f) || (d <= e && c <= f)) {
            house2 = true;
            System.out.println("Второй дом поместится");
        }

        if (!(house1 && house2)) {
            System.out.println("Оба дома не поместились");
        }
    }
}
