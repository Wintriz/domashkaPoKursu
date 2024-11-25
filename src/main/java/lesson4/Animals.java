package lesson4;

public class Animals {
    private String name;
    private boolean run;
    private boolean sweam;
    private int maxRunningDistance;


    public Animals(String name, boolean run, boolean sweam, int maxRunningDistance, int maxSweamingDistance) {
        this.name = name;
        this.run = run;
        this.sweam = sweam;
        this.maxRunningDistance = maxRunningDistance;
        System.out.println(name);
    }

    public Animals(String name, boolean run, boolean sweam, int maxRunningDistance) {
        this.name = name;
        this.run = run;
        this.sweam = sweam;
        this.maxRunningDistance = maxRunningDistance;
        System.out.println(name);
    }


    public int running(int m) {

        System.out.println("running distance is " + m + "m");
        return m;

    }

    public int sweaming(int m) {

        if (sweam == false)
            System.out.println("cant sweaming");
        else
            System.out.println("sweaming distance is " + m + "m");
        return m;

    }


}
