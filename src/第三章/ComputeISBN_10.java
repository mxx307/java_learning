package 第三章;
//3.9

import java.util.Scanner;

public class ComputeISBN_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.next();
        int s = 0;
        int d1 = Integer.parseInt(number) / 100000000;
        s = s + d1;
        int d2 = Integer.parseInt(number) / 10000000 % 10;
        s = s + d2 * 2;
        int d3 = Integer.parseInt(number) / 1000000 % 10;
        s = s + d3 * 3;
        int d4 = Integer.parseInt(number) / 100000 % 10;
        s = s + d4 * 4;
        int d5 = Integer.parseInt(number) / 10000 % 10;
        s = s + d5 * 5;
        int d6 = Integer.parseInt(number) / 1000 % 10;
        s = s + d6 * 6;
        int d7 = Integer.parseInt(number) / 100 % 10;
        s = s + d7 * 7;
        int d8 = Integer.parseInt(number) / 10 % 10;
        s = s + d8 * 8;
        int d9 = Integer.parseInt(number) % 10;
        s = s + d9 * 9;
        if (s == 10) {
            System.out.println("The ISBN-10 number is " + number + "X");
        } else {
            System.out.println("The ISBN-10 number is " + number + s % 11);
        }
    }
}
