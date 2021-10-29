package 第五章;

//5.26
public class computeeeeee {
    public static void main(String[] args) {
        for (int t = 1; t <= 100; t++) {
            double e = 0;
            for (int i = 1; i <= 10000 * t; ++i) {
                double ee = 1;
                for (int j = 1; j <= i; j++) {
                    ee = ee * j;
                }
                e = e + 1 / ee;
            }
            System.out.format("When i = %d, e = %.16f\n", t * 1000, e + 1);
        }
    }
}
