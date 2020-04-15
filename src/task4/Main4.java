package task4;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(isCloseHole(3, 4, 5));
    }

    /**
     * Прямоугольное отверстие со сторонами a и b полностью закрыть кругом с радиусом r
     *
     * @param a одна сторона отверстия
     * @param b вторая сторона отверстия
     * @param r радиус крышки
     * @return
     */
    public static boolean isCloseHole(int a, int b, int r) {
        return r >= Math.sqrt(a * a + b * b) / 2;
    }
}
