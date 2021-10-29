package 第五章;

//5.27
public class rennian {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 2100; i++) {
            if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                System.out.format("%d  %d\n", ++count, i);
            }
        }
    }
}
