package lesson4;

public class Animals {
    String name;
    boolean run;
    boolean sweam;
    int maxRunningDistance;
    int maxSweamingDistance;

    public Animals(String name, boolean run, boolean sweam, int maxRunningDistance, int maxSweamingDistance) {
        setValues(name, run, sweam, maxRunningDistance, maxSweamingDistance);
        System.out.println(name);
    }

    public void setValues(String name, boolean run, boolean sweam, int maxRunningDistance, int maxSweamingDistance) {
        this.name = name;
        this.run = run;
        this.sweam = sweam;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSweamingDistance = maxSweamingDistance;
    }

    public int running(int m) {

        System.out.println("running distance is " + m + "m");
        return m;

    }

    public int sweaming(int m) {

        if (sweam == false)
            System.out.println("cant sweaming");
        else
            System.out.println("sweaming distance " + m + "m");
        return m;

    }


}
