package 第九章;

import java.util.Random;

public class Random_ {
    public static void main(String[] args) {
        Random a = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println(a.nextInt(100));
        }
    }
}