package 第三章;
//3.19

import java.util.Scanner;

public class ComputeTrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the triangle edge: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {
            System.out.println("The length of the edge of the triangle is " + (a + b + c));
        } else {
            System.out.println("Cannot form a triangle");
        }
    }
}
