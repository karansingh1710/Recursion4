package Assignment.Recursion4;

import java.util.Scanner;

public class Product {
    static int product(int x, int y){
        if (x>y){
            return product(y,x);
        }
        if (y!=0){
            return x+product(x,y-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(product(x,y));
    }
}
