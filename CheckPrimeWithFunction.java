// Program to show the use of Check prime through functions

package codingNinja.com;
import java.util.Scanner;
public class CheckPrimeWithFunction {
// 1st method
	public static boolean checkprime(int n)
	{
		int div=2;
		while(div<=n/2)
		{
			if(n%div==0)
			{
				// not prime
				return false;
			}
			div++;
		}
		return true;
	}
	// 2nd method
	public static boolean prime2(int n)
	{
		int div =2;
		boolean isprime=true;
		while(div<=n/2)
		{
			if(n%div==0)
			{
				isprime=false;
				break;
			}
			div++;
		}
		if(isprime)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		boolean prime=checkprime(n);
		boolean primechk=prime2(n);
		System.out.println(primechk);
		System.out.println(prime);
		r.close();
	}
}

