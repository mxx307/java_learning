package 第八章;

public class employee {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 3, 4, 5, 8, 8}, {7, 4, 3, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        int sum[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int b[] = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                sum[i] += a[i][j];
            }
        }
        int min, k;
        for (int i = 0; i < 8; i++) {
            min = i;
            for (int j = i + 1; j < 8; j++) {
                if (sum[j] < sum[min]) {
                    min = j;
                }
            }
            k = sum[min];
            sum[min] = sum[i];
            sum[i] = k;
            k = b[min];
            b[min] = b[i];
            b[i] = k;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(b[i] + " " + sum[i]);
        }
    }
}