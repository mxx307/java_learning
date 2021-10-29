package 第三章;

//3.4
public class RandomMonth {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 12) + 1; //生成0~12的随机整数赋值给number
        String month = "";
        System.out.println(number);
        if (number == 1) {
            month = "January";
        } else if (number == 2) {
            month = "February";
        } else if (number == 3) {
            month = "March";
        } else if (number == 4) {
            month = "April";
        } else if (number == 5) {
            month = "May";
        } else if (number == 6) {
            month = "June";
        } else if (number == 7) {
            month = "July";
        } else if (number == 8) {
            month = "August";
        } else if (number == 9) {
            month = "September";
        } else if (number == 10) {
            month = "October";
        } else if (number == 11) {
            month = "November";
        } else if (number == 12) {
            month = "December";
        }
        System.out.println(month);
    }
}
