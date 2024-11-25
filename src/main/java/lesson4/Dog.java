package lesson4;


public class Dog extends Animals {
    private int maxSweamingDistance;

    public Dog(String name, boolean run, boolean sweam, int maxRunningDistance, int maxSweamingDistance) {
        super(name, run, sweam, maxRunningDistance, maxSweamingDistance);

    }

    public void sweamingDistance() {
        maxSweamingDistance = 10;
    }
}
