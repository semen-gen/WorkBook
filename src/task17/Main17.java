package task17;

import java.util.Arrays;

public class Main17 {

    public static void main(String[] args) {
        printButterfly(5);
    }

    public static void printButterfly(int length) {
        int[][] arr = new int[length][length];
        int absDelta;

        for (int i = 0, e = length - 1; i < length; i++, e--) {
            absDelta = (length - (Math.abs(e - i) + 1)) / 2;
            for (int l = 0; l < length; l++) {
                arr[i][l] = l >= absDelta && l <= length - absDelta - 1 ? 1 : 0;
            }
        }

        for (int[] el : arr) {
            System.out.println(Arrays.toString(el));
        }
    }

}