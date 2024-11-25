package lesson3;

import java.util.Arrays;

public class Employer {
    public String fio;
    public String jobTitle;
    public String email;
    public int phone;
    public int salary;
    public int age;

    public Employer(String fio, String jobTitle, String email, int phone, int salary, int age) {
        setValues(fio, jobTitle, email, phone, salary, age);

    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s", fio, jobTitle, email, phone, salary, age);
    }

    public void setValues(String fio, String jobTitle, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println(this);
    }

}


