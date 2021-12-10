package 第九章;


public class TotalArea {
    public static void main(String[] args) {
        Circle2[] circleArray;
        circleArray = creatCircleArray();
        printCircleArray(circleArray);

    }

    public static Circle2[] creatCircleArray() {
        Circle2[] circleArray = new Circle2[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle2(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(Circle2[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("______________________________________");
        System.out.printf("%-30s%-15f\n", "The total area of circles is ", sum(circleArray));
    }

    public static double sum(Circle2[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}