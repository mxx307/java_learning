package 第九章;

public class TestCircleWithPrivateDataFieds {
    public static void main(String[] args) {
        Circle2 myCircle = new Circle2(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        System.out.println("The number of objects created is " + myCircle.getNumberOfObjects());
    }
}