package Assignment.Recursion4;

import java.util.Scanner;

public class PrimeNumber {
    static boolean PrimeCheck(int n, int i){
        if (n<=2){ //this if checks, if given number is less than or equal to 2
            return n == 2;//if the above condition is true then this if checks, if n is 2 then simply return yes
        }
        if (n==i) return true;//this if checks that, if our iterative element is equal to the given number then simply return true
        if (n%i==0){//This if checks, if given number is divisible by any number then simply return false
            return false;
        }

        return PrimeCheck(n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if (PrimeCheck(N,2)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
