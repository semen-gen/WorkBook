package task15;

import java.util.Arrays;

public class Main15 {

    public static void main(String[] args) {
        printSumData(10);
    }

    public static void printSumData(int length) {
        int[] array = createArray(length);
        System.out.println(Arrays.toString(array));
        System.out.println(sumBetweenMaxMin(array));
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        return array;
    }

    public static int sumBetweenMaxMin(int[] array) {
        int minIndex = 0, min = array[minIndex];
        int maxIndex = 0, max = array[maxIndex];
        int from, to;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
                minIndex = i;
            }
            else if (max > array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        if (maxIndex > minIndex) {
            from = minIndex + 1;
            to = maxIndex;
        }
        else {
            from = maxIndex + 1;
            to = minIndex;
        }

        for (; from < to; from++) {
            sum += array[from];
        }

        return sum;
    }

}
