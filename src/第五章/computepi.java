package 第五章;

//5.25
public class computepi {
    public static void main(String[] args) {

        for (int t = 1; t <= 100; t++) {
            double pi = 0;
            for (int i = 1; i <= 10000 * t; ++i) {
                pi = pi + Math.pow((-1), (i + 1)) / (2 * i - 1);
            }
            System.out.format("When i = %d, pi = %.10f\n", t * 1000, pi * 4);
        }

    }
}
