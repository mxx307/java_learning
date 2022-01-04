package 第十一章;
//11-17
import java.util.ArrayList;
import java.util.Scanner;

public class ask {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        java.util.ArrayList<Integer> list=new ArrayList<>();
        int m =input.nextInt(),m1=m;
        int i=2;
        while(m1>1){
            if(m1%i==0){
                list.add(i);
                m1=m1/i;
            }
            else {
                i++;
            }
        }
        int a=list.get(0),sum=1,n=1;
        for(i=1;i<list.size();i++){
            if(a!=list.get(i)){
                if(sum%2==1){
                    n=n*a;
                }
                a=list.get(i);
                sum=1;
            }
            else{
                sum++;
            }
        }
        if(sum%2==1){
            n=n*a;
        }
        System.out.println("The smallest number n for m * n to be a perfect square is "+n);
        System.out.print("m * n is "+m*n);
    }
}
