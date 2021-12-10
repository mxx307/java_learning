package 第九章;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter a,b,c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation x = new QuadraticEquation(a, b, c);
        if (1 == x.getDiscriminant()) {
            System.out.println("the root1 is " + x.getRoot1());
            System.out.println("the root2 is " + x.getRoot2());
        } else if (0 == x.getDiscriminant()) {
            System.out.println("the root1 is " + x.getRoot1());
        } else
            System.out.println("the equation has no roots");

    }
}

class QuadraticEquation {
    private long a, b, c;

    public int getDiscriminant() {
        if (b * b - 4 * a * c > 0)
            return 1;
        else if (b * b - 4 * a * c == 0)
            return 0;
        else
            return -1;
    }

    QuadraticEquation(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    long getA() {
        return a;
    }

    long getB() {
        return b;
    }

    long getC() {
        return c;
    }

    double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}