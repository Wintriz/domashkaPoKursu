package lesson2;


import static lesson2.First.checkBetween;
import static lesson2.Third.checkNegative;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        System.out.println(checkBetween(12, 1));
        Second second = new Second();
        Second.checkPositive();
        Third third = new Third();
        System.out.println(checkNegative(-1));
        Fourth fourth = new Fourth();
        Fourth.printString();
        Fifth fifth = new Fifth();
        Fifth.arraySwap();
        Sixth sixth = new Sixth();
        Sixth.fullArray();
        Seventh seventh = new Seventh();
        Seventh.mutiplArray();
        Eighth eighth = new Eighth();
        Eighth.doubleArray();


    }
}

