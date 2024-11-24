package lesson2;

import java.util.Arrays;

public class Sixth {
    public static void fullArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
        System.out.println(Arrays.toString(array));

    }
}
