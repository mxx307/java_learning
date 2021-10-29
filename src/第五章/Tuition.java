package 第五章;

//5.7
public class Tuition {
    public static void main(String[] args) {
        double fee = 10000;
        double total = 0;
        for (int i = 1; i <= 10; ++i) {
            fee = fee * (1 + 0.05);
        }
        for (int i = 1; i <= 3; ++i) {
            total = total + fee;
            fee = fee * (1 + 0.05);
        }
        total = total + fee;
        System.out.format("The tuition fee after 10 years is $%.2f\n", fee);
        System.out.format("The total tuition fee is $%.2f\n", total);
    }
}
