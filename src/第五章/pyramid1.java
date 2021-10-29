package 第五章;
//5.19

import java.util.Scanner;

public class pyramid1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = 7;
        for (int ii = 0; ii <= line; ii++) {
            String s = "";
            int t = 1;
            for (int jj = 0; jj < line - ii; jj++) {
                s = "    " + s;
            }
            for (int jj = 0; jj <= ii; jj++) {
                s = s + String.format("%4d", t);
                t = t * 2;
            }
            t = t / 2;
            for (int jj = 1; jj <= ii; jj++) {
                t = t / 2;
                s = s + String.format("%4d", t);

            }
            System.out.println(s);
        }
    }
}
