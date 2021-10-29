package 第三章;
//3.22

import java.util.Scanner;

public class IsInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = Math.sqrt(x * x + y * y);
        if (z <= 10.0) {
            System.out.println("point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("point (" + x + ", " + y + ") is not in the circle");
        }
    }
}
