package 第三章;
//3.21

import java.util.Scanner;

public class CalculateTheDayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        int m;
        if (month == 1 || month == 2) {
            m = month + 12;
            year = year - 1;
        } else {
            m = month;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        String[] week = new String[7];
        week[0] = "Saturday";
        week[1] = "Sunday";
        week[2] = "Monday";
        week[3] = "Tuesday";
        week[4] = "Wednesday";
        week[5] = "Thursday";
        week[6] = "Friday";
        System.out.println("Day of the week is " + week[h]);
    }
}
