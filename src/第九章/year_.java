package 第九章;

import java.util.GregorianCalendar;

public class year_ {
    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar();
        System.out.println(a.get(GregorianCalendar.YEAR) + "年" + a.get(GregorianCalendar.MONTH) + '月' + a.get(GregorianCalendar.DAY_OF_MONTH) + "日");
        a.setTimeInMillis(1234567898765L);
        System.out.println(a.get(GregorianCalendar.YEAR) + "年" + a.get(GregorianCalendar.MONTH) + '月' + a.get(GregorianCalendar.DAY_OF_MONTH) + "日");

    }
}