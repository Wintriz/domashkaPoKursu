package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employer[] employersArray = new Employer[5];
        employersArray[0] = new Employer("Ivanov Ivan", "worker", "ivan@mail.ru", 912333, 5000, 25);
        employersArray[1] = new Employer("Downey Robert", "ironman", "ironman@mail.ru", 99999, 5006666, 53);
        employersArray[2] = new Employer("Kristen Stuart", "pokerface", "kristen@mail.ru", 956212, 70000, 46);
        employersArray[3] = new Employer("Lev Trotsky", "desident", "trotsky@mail.ru", 9993333, 120000, 33);
        employersArray[4] = new Employer("Vladimir Lenin", "leader", "lenin@mail.ru", 666666, 50000, 80);
        for (int i = 0; i < employersArray.length; i++)
            if (employersArray[i].age > 40) {
                employersArray[i].printInfo();
            }

    }

}
