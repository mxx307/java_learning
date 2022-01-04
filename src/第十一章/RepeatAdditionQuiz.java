package 第十一章;
//11-16
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args){
        int numbers1 =(int)(Math.random()*10);
        int numbers2 =(int)(Math.random()*10);
        Scanner input=new Scanner(System.in);
        System.out.print("What is "+numbers1+" + "+numbers2+"? ");
        int answer=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        while (numbers1+numbers2!=answer) {
            if (list.contains(answer)){
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer.Try again.What is " + numbers1 + " + " + numbers2 + "? ");
                answer = input.nextInt();
            }
            else {
                System.out.print("Wrong answer.Try again.What is " + numbers1 + " + " + numbers2 + "? ");
                list.add(answer);
                answer = input.nextInt();
            }
        }
        System.out.println("You got it!");
    }
}