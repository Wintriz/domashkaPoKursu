package lesson2;

import java.util.Arrays;

public class Fifth {
    public static void arraySwap() {
        int[] array = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 1)
                array[i] = 0;
            else
                array[i] = 1;

        }
        System.out.println(Arrays.toString(array));

    }
}
