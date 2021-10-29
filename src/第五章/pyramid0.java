package 第五章;
//5.17

import java.util.Scanner;

public class pyramid0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line:");
        int line = input.nextInt();

        for (int ii = 1; ii <= line; ii++) {
            String s = "1";
            for (int jj = 2; jj <= ii; jj++) {
                s = jj + " " + s + " " + jj;
            }
            for (int jj = 1; jj <= line - ii; jj++) {
                s = "  " + s;
            }
            System.out.println(s);
        }
    }
}
