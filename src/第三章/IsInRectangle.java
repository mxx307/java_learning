package 第三章;
//3.23

import java.util.Scanner;

public class IsInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = Math.sqrt(x * x + y * y);
        if (x <= 5.0 && y <= 2.5) {
            System.out.println("point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
