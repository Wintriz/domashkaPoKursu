package lesson2;

import java.util.Scanner;

public class Second {
    public static void checkPositive() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");

    }
}
