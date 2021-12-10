package 第九章;

public class stopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 200);
        }
        count(a);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + "ms");
    }

    public static void count(int[] a) {
        int max;
        int tmp;
        for (int i = 0; i < a.length; i++) {
            max = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[max] < a[j])
                    max = j;
            }
            if (i != max) {
                tmp = a[max];
                a[max] = a[i];
                a[i] = tmp;
            }
        }
    }
}

class StopWatch {
    private long startTime, endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

