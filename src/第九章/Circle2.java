package 第九章;

public class Circle2 {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle2() {
        numberOfObjects++;
    }

    public Circle2(double newRaidus) {
        radius = newRaidus;
        numberOfObjects++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setRadius(double newRaidus) {
        radius = (newRaidus >= 0) ? newRaidus : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }
}