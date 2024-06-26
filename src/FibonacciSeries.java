// Program to print the fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {

    public static void fibSeries(int n)
    {
        int a=0,b=1,c=1;
        if(n==1 || n==0)
        {
            System.out.println(n);
        }
        System.out.println("Fibonacci Series : ");
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }




    public static int fibSeries2(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibSeries2(n-1)+fibSeries2(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibSeries(n);
        System.out.println("Recursion Fib Series : "+fibSeries2(n));
    }
}
