package Assignment.Recursion4;

import java.util.Scanner;

public class Armstrong {

    static int CheckArm(int N){
        if (N==0){//Base case
            return 0;
        }
        int small=CheckArm(N/10);
        int num=N%10;
        return num*num*num+small;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if (N==CheckArm(N))
            System.out.println("Armstrong Number");
        else
        System.out.println("Not a Armstrong Number");
    }
}
