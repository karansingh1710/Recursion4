package Assignment.Recursion4;

import java.util.Scanner;

public class Binary {
    static int BinaryConvert(int n,int div){
        if (n==0){
            return 0;
        }
        return BinaryConvert(n/2,2)*10+n%2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Binary equivalent of "+n+": "+BinaryConvert(n,2));
    }
}
