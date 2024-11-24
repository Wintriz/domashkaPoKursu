package lesson2;

import java.util.Arrays;

public class Eighth {
    public static void doubleArray() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (i == array.length - 1 - j)) {
                    array[i][j] = 1;

                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}