package lessons1;

public class HomeWorkApp {
    public static void main(String[] args) {

        printWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }

    public static void printWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static String checkSumSign() {
        int a = 5;
        int b = 4;
        int sum = a + b;
        String res;
        if (sum >= 0)
            res = "Сумма положительная";
        else
            res = "Сумма отрицательная";

        return res;
    }

    public static String printColor() {
        int value = -1;
        String color = "";
        if (value <= 0) {
            color = "Red";
            System.out.println(color);
        } else if ((value > 0) && (value <= 100)) {
            color = "Yellow";
            System.out.println(color);
        } else if (value > 100) {
            color = "Green";
            System.out.println(color);
        }
        return color;

    }

    public static String compareNumbers() {
        int a = 100;
        int b = 1020;
        String ab;
        if (a >= b) {
            ab = "a >= b";
            System.out.println(ab);
        } else {
            ab = "a < b";
            System.out.println(ab);
        }
        return ab;
    }
}

