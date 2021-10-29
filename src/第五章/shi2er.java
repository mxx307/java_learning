package 第五章;
//3.37

import java.util.Scanner;

public class shi2er {
    public static void main(String[] args) {
        String binaryString = "";
        int decimalNumber;
        System.out.print("Enter a decimal integer: ");
        Scanner inputScanner = new Scanner(System.in);
        decimalNumber = inputScanner.nextInt();

        do {
            binaryString = decimalNumber % 2 + binaryString;
            decimalNumber /= 2;
        } while (decimalNumber > 0);

        System.out.printf("Its corresponding binary value is %s", binaryString);

        inputScanner.close();
    }
}
