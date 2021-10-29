package 第五章;
//5.21

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        double years = input.nextDouble();
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        for (double rate = 0.05; rate <= 0.08001; rate = rate + 0.00125) {
            double monthlyPayment = amount * rate / 12 / (1 - 1 / Math.pow(1 + rate / 12, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.format("%.3f%%           %.2f             %.2f\n", rate * 100, monthlyPayment, totalPayment);
        }
    }
}
