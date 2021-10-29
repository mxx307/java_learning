package 第五章;

//5.33
public class wanquanshu {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    count += j;
            }
            if (count == i)
                System.out.print(i + " ");
        }
    }
}
