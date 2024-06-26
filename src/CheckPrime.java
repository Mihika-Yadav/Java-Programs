// Check the given number is prime or not.

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        // loop to traverse all no to check all numbers
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeMethod(int n)
    {
        int check;
        for(int i=0;i<=n;i++)
        {
            check=0;

            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    check++;
                    break;
                }
            }
            if(check==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Check prime : "+isPrime(n));
        System.out.println("Prime numbers till n: " +n);
        for(int i=0;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+ " ");
            }
        }
        System.out.println("Prime check through loop" +n);
        primeMethod(n);
    }
}
