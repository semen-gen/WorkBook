package task14;

import java.util.Arrays;

public class Main14 {

    public static void main(String[] args) {
        printData(10);
    }

    public static void printData(int length) {
        int[] arr = createArrayMarks(length);

        System.out.println(Arrays.toString(arr));
        System.out.println(indexOfMaxMark(arr));
    }

    public static int indexOfMaxMark(int[] array) {
        int index = 0;
        int max = array[index];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int[] createArrayMarks(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        return arr;
    }

}

