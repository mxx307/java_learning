package 第五章;
//5.22

import java.util.Scanner;

public class RepaymentOfLoansInInstallments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        double years = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble() / 1200;

        double monthlyPayment = amount * rate / (1 - 1 / Math.pow(1 + rate, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.format("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.format("Total Payment: %.2f\n", totalPayment);
        double balance = amount;
        double interest, principal;
        System.out.println("Payment\t\tInterest\t\tPrincipal\t\tbalance");
        for (int i = 1; i <= years * 12; ++i) {
            interest = rate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.format("%d\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", i, interest, principal, balance);
        }

    }
}
